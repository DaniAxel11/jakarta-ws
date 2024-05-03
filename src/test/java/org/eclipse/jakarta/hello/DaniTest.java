package org.eclipse.jakarta.hello;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @Author daniel-gonzalez
 * Date: 03/05/24
 */
public class DaniTest {

	
    Dani dani = new Dani("Daniel");

    @Test
    public void testGetName() {
        String name = dani.getName();
        assertEquals("Danielle", name);
    }

    @Test
    public void testToString() {
        String result = dani.toString();
        assertEquals("Dani{name='Danielle'}", result);
    }
}
