import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FizzbuzzTest {
    private static Fizz_buzz fizzBuzz;

    @BeforeAll
    public static void init(){
        fizzBuzz = new Fizz_buzz();
    }

    @Test
    public void correctTest(){
        assertArrayEquals(fizzBuzz.solution(1), new String[]{"1"});
        assertArrayEquals(fizzBuzz.solution(3), new String[]{"1","2","Fizz"});
        assertArrayEquals(fizzBuzz.solution(5), new String[]{"1","2","Fizz","4","Buzz"});
        assertArrayEquals(fizzBuzz.solution(15), new String[]{"1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"});
    }


}
