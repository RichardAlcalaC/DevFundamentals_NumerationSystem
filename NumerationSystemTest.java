

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
    public void CeroInDecimalIsCeroInBinary()
    {
        assertArrayEquals(new int[]{0}, NumerationSystemMain.convertToBinary(0));
    }
}

