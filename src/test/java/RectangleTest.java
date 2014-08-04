
import org.junit.Test;


import static junit.framework.Assert.*;
import static junit.framework.Assert.assertEquals;

public class RectangleTest{
    Rectangle rectangle;
    @Test
    public void shouldReturnZeroForZeroLength(){
        rectangle = new Rectangle(0.0, 10.0);
        assertEquals(Double.parseDouble(String.valueOf(0)), rectangle.Area());
    }

    @Test
    public void shouldReturnZeroForZeroBreadth() {
        rectangle =  new Rectangle(10.0, 0.0);
        assertEquals(Double.parseDouble(String.valueOf(0)), rectangle.Area());
    }
}