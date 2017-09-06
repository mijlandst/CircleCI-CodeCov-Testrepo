package test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ExtraTest {

    @Test
    public void emptyConstructorTest() {
        assertTrue(new Test() != null);
    }

}
