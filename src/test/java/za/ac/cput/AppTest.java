package za.ac.cput;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testConcatenate() {
        App app = new App();

        String result = app.concatenate("Peanut","Butter");

        assertEquals("PeanutButter", result);
    }
}
