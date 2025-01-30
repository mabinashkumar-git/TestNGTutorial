package testNGfiles;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGdependantMethod {

    @Test(dependsOnMethods = {"test1"})
    public void test(){
        System.out.println("Print Test 1");
    }

    @Test
    public void test1(){
        System.out.println("Print Test 2");
    }

    @Test(dependsOnMethods = {"test1", "test3", "test4"})
    public void test2(){
        System.out.println("Print Test 3");
    }

    @Test
    public void test3(){
        System.out.println("Print Test 4");
    }

    @Test
    public void test4(){
        System.out.println("Print Test 5");
    }

    /* Will throw an error as this is trying to call another TestNG dependsOnMethods */
    @Test(dependsOnMethods = {"test"})
    public void test5(){
        System.out.println("Print Test 3");
    }

}
