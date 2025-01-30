package testNGFilesSrc;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGdependentMethod {

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

    @Test(dataProvider = "dataProviderTest")
    public void test6(String var1, String var2){
        System.out.println(var1);
        System.out.println(var2);
    }

    @DataProvider
    public Object[][] dataProviderTest(){
        Object data[][] = new Object[2][2];
        data[0][0] = "value00";
        data[0][1] = "value01";
        data[1][0] = "value10";
        data[1][1] = "value11";

        return data;
    }

}
