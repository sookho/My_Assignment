import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Prac_Multithread {
    private static final Lock lock = new ReentrantLock();
    private static final Condition condition = lock.newCondition();
    private int i = 1;
    private char c = 'a';
    private boolean flag = true;

    public static void main(String[] args) {
        Prac_Multithread instance = new Prac_Multithread();
        new Thread(instance::printLetter).start();
        new Thread(instance::printNumber).start();
    }

    public void printLetter(){
        while(c <= 'z'){
            lock.lock();
            try{
                while(flag){
                    condition.await();
                }
                System.out.print(c);
                c++;
                flag = !flag;
                condition.signalAll();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }
        }
    }

    public void printNumber(){
        while(i <= 26){
            lock.lock();
            try{
                while(!flag){
                    condition.await();
                }
                System.out.print(i);
                i++;
                flag = !flag;
                condition.signalAll();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }
        }
    }
}

