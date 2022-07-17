import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void test3() {
        assertEquals(
                Arrays.asList("1","2","Fizz"),
                new Solution().fizzBuzz(3)
        );
    }

    @Test
    public void test5() {
        assertEquals(
                Arrays.asList("1","2","Fizz","4","Buzz"),
                new Solution().fizzBuzz(5)
        );
    }

    @Test
    public void test15() {
        assertEquals(
                Arrays.asList("1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"),
                new Solution().fizzBuzz(15)
        );
    }

}