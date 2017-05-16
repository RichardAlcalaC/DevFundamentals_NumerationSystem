

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class NumerationSystemTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class NumerationSystemTest
{
    /**
     * Default constructor for test class NumerationSystemTest
     */
    public NumerationSystemTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /*   */
    
    @Test
    public void binaryOf2Is1_0()
    {
       // assertArraysEquals(new int []{}, );
    }
        
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /*   */
    
    
    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void CeroInDecimalIsCeroInBinary_ManualTest()
    {
        assertArrayEquals(new int[]{0}, NumerationSystemMain.convertToBinaryManual(0));
    }
    
    @Test
    public void OneInDecimalIs1InBinary()
    {
        assertArrayEquals(new int[]{1}, NumerationSystemMain.convertToBinary(1));
    }
    
    
    //Calc Size
    @Test
    public void CalculateSizeOfArrayEqualsToZero()
    {
        //assertIsEquals();
    }
    
    //
    @Test
    public void swapExtremesOfAnArrayWithOnlyTwoElements()
    {
        int [] expected = new int []{1,1};
        int [] array = new int[]{1,1};
        NumerationSystemMain.swapExtremeBits(array);
        assertArrayEquals(expected, array);
    }
    
    @Test
    public void swapExtremesOfAnArrayWithOnlyTwoElements()
    {
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}

