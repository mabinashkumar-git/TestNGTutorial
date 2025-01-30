package testNGfiles;

//import org.junit.jupiter.api.Test;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Groups {

    @BeforeGroups("FirstTest")
    public void testBefore(){
        System.out.println("Test Before Group");
    }

    @AfterGroups("LastTest")
    public void testAfter(){
        System.out.println("Test After Group");
    }

    @Test(groups={"FirstTest"})
    public void test1(){
        System.out.println("Test 1");
    }

    @Test
    public void test2(){
        System.out.println("Test 2");
    }

    @Test
    public void test3(){
        System.out.println("Test 3");
    }

    @Test
    public void test4(){
        System.out.println("Test 4");
    }

    @Test(groups = {"LastTest"})
    public void test5(){
        System.out.println("Test 5");
    }

}
