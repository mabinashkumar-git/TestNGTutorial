package testNGfiles;

import org.testng.annotations.Test;

/* If we are required to execute a test case N number of times , then invocationCount helper attribute is used. */
public class InvocationCount {

    @Test(invocationCount = 2)
    public void test1(){
        System.out.println("Test 1");
    }

    @Test(invocationCount = 1)
    public void test2(){
        System.out.println("Test 2");
    }

    @Test(invocationCount = 4)
    public void test3(){
        System.out.println("Test 3");
    }
}
