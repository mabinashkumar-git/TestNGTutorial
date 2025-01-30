package testNGfiles;

import org.testng.annotations.Test;

public class DataProvider {

    @Test(dataProvider = "dependentTest")
    public void test(String value1, String value2){
        System.out.println(value1);
        System.out.println(value2);
    }

    @org.testng.annotations.DataProvider
    public Object[][] dependentTest(){
        Object data[][] = new Object[2][2];

        data[0][0] = "value00";
        data[0][1] = "value01";
        data[1][0] = "value10";
        data[1][1] = "value11";

        return data;

    }

}
