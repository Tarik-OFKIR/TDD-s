import org.example.SimpleCalculator;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.*;

public class SimpleCalculatorTest {


    @Test
    public void testCreatInstance() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
    }

    @Test
    public void testSumEmptyString() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        assertEquals(0, simpleCalculator.add(""));
    }

    @Test
    public void testSumOfNonEmptyString(){
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        assertEquals(1,simpleCalculator.add("1"));
        assertEquals(2, simpleCalculator.add("2"));
    }

    @Test
    public void testSumOfUnknownNumberOfArgument(){
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        assertEquals(3,simpleCalculator.add("1,2"));
    }


    @Test
    public void testSumOfUnknownNumberOfArgumentContainNewlinesAsSeparators(){
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        assertEquals(6,simpleCalculator.add("1,2\n3"));
        assertEquals(12,simpleCalculator.add("1,2\n3,4\n2"));
//        assertEquals(22,simpleCalculator.add("1,2\n3,4\n5,5,"));
    }

    @Test
    public void testNotAllowSeparatorAtTheEnd(){
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        assertThrows(IllegalArgumentException.class,()->{simpleCalculator.add("1,2\n3,4\n5,5,\n2");});
        assertThrows(IllegalArgumentException.class,()->{simpleCalculator.add("1,2\n3,4\n5,5,");});
    }


}


