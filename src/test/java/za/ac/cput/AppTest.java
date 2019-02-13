package za.ac.cput;

import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void subtract()
    {
        App calc = new App();
        int result = calc.add(6,4); //change from subtract to addition
        assertEquals(10,result);
    }
}
