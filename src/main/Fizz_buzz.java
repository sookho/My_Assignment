import java.util.Arrays;

public class Fizz_buzz {
    public static void main(String[] args) {
        Fizz_buzz fizzBuzz  = new Fizz_buzz();
        System.out.println(Arrays.toString(fizzBuzz.solution(15)));
    }

    public String[] solution(int n){
        String[] arr = new String[n];
        for(int i = 1 ; i <= n; i++){
            if(i%3 == 0 && i%5 == 0){
                arr[i-1] = "FizzBuzz";
            }else if (i%3 == 0){
                arr[i-1] = "Fizz";
            }else if (i%5 == 0){
                arr[i-1] = "Buzz";
            }else{
                arr[i-1] = String.valueOf(i);
            }
        }
        return arr;
    }
}


//    FizzBuzz
//    Given an integer n, return a string array answer (1-indexed) where:
//
//        answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
//        answer[i] == "Fizz" if i is divisible by 3.
//        answer[i] == "Buzz" if i is divisible by 5.
//        answer[i] == i (as a string) if none of the above conditions are true.