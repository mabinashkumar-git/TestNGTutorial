package testNGFilesSrc;

import org.junit.Assert;
import org.testng.annotations.Test;

public class BasicTestNG {

    @Test
    public void testTrue() {
        System.out.println("Demo Test : " + Thread.currentThread().getId());
        Assert.assertEquals(true, true);
    }

    @Test
    public void testFalse() {
        System.out.println("Demo Test : " + Thread.currentThread().getId());
        Assert.assertEquals(true, false);
    }

}
