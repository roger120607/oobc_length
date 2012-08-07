package test.java;

import junit.framework.TestCase;
import main.java.Length;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 8/7/12
 * Time: 8:57 AM
 * To change this template use File | Settings | File Templates.
 */
public class HelloTest extends TestCase {

    @Test
    public void test_should_1m_equal_1m() {
        Length l1 = new Length(1, "m");
        Length l2 = new Length(1, "m");
        assertEquals(l1, l2);
    }

    @Test
    public void test_should_1m_not_equal_2m() {
        Length l1 = new Length(1, "m");
        Length l2 = new Length(2, "m");
        assertEquals(l1.equals(l2), false);
    }

    @Test
    public void test_should_1m_equal_100cm() {
        Length l1 = new Length(1, "m");
        Length l2 = new Length(100, "cm");
        assertEquals(l2.equals(l1), true);
    }

    @Test
    public void test_should_1m_not_equal_200cm() {
        Length l1 = new Length(1, "m");
        Length l2 = new Length(200, "cm");
        assertEquals(l2.equals(l1), false);
    }


    @Test
    public void test_should_get_1000mm_when_1m() {
        Length l1 = new Length(1, "m");
        assertEquals(l1.transfer_mm(), new Length(1000, "mm"));
    }


    @Test
    public void test_should_get_10mm_when_1cm() {
        Length l1 = new Length(1, "cm");
        assertEquals(l1.transfer_mm(), new Length(10, "mm"));
    }

}


