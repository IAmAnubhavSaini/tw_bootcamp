import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class ProbabilityTest{
    Probability first;
    Probability second;

    public ProbabilityTest(){
        try {
            first = new Probability(0.5);
            second = new Probability(0.5);
        }
        catch(Exception ex) {

        }
    }
    @Test
    public void shouldReturnAndValueOfProbabilities(){
        assertEquals(0.25, first.And(second), 0);
    }

    @Test
    public void shouldReturnOrValueOfProbabilities(){
        assertEquals((0.5+0.5 - 0.5*0.5),first.Or(second),0);
    }

    @Test
    public void shouldReturnNotValueOfProbabilities(){
        assertEquals(0.5,first.Not(),0);
    }

    @Test
    public void shouldBeEqual(){
        assertEquals(true, first.Equals(second));
    }

    @Test
    public void shouldReturnExceptionForInvalidProbabilities(){

    }
}
