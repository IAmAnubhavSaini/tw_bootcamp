

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;

public class FizzBuzzTest {

    FizzBuzz fizzBuzz = new FizzBuzz();
    @Test
    public  void shouldReturnNumberIfNotFizzBuzz() {
        assertEquals("1", fizzBuzz.Run(1));
    }
    @Test
    public void shouldReturnFizzIfNumberOnlyModThree(){
        assertEquals("Fizz", fizzBuzz.Run(3));
        assertEquals("Fizz", fizzBuzz.Run(6));
        assertEquals("Fizz", fizzBuzz.Run(9));

    }
}



