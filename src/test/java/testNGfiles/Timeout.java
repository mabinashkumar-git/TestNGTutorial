package testNGfiles;

import org.testng.annotations.Test;

public class Timeout {

    /* If there any test method that consumes  a lot of time for execution ,we can terminate that method with the help
       of timeOut helper attribute in TestNG. */

    @Test(timeOut = 5000)
    public void test1(){
        System.out.println("Test 1");
    }

    @Test(timeOut = 2000)
    public void test2(){
        System.out.println("Test 2");
    }
}
