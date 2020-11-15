package cmpe272;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestArithmeticTest {

    private static Arithmetic arithmetic;
    @BeforeClass
    public static void setUp() {
        arithmetic = new Arithmetic();
    }

    @Test
    public void testAdd() {
        Assert.assertEquals(7, arithmetic.add(2,5));
    }

    @Test
    public void testSub() {
        Assert.assertEquals(15, arithmetic.subtract(20,5));
    }

    @Test
    public void testMult() {
        Assert.assertEquals(10, arithmetic.multiplication(2,5));
    }

    @Test
    public void testDiv() {
        Assert.assertEquals(5, arithmetic.division(25,5));
    }

    @Test
    public void testDivByZero() {
        Exception exception = null;
        try {
            arithmetic.division(25,0);
        } catch (Exception e) {
            exception = e;
        }

        Assert.assertNotNull(exception);
        Assert.assertEquals(RuntimeException.class, exception.getClass());
        Assert.assertEquals("Divison by zero is invalid", exception.getMessage());
    }
}

