package algds.string;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringManipulationTest {

    @Test public void testRmAt() {
        StringManipulation sm = new StringManipulation();
        String got = sm.rmAt("TEST",2);
        assertEquals(got, "TET");
    }

    @Test public void testInsAt() {
        StringManipulation sm = new StringManipulation();
        String got = sm.insAt("TET", 'S', 2);
        assertEquals(got, "TEST");
    }
}
