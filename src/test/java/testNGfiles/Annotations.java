package testNGfiles;

//import org.junit.jupiter.api.Test;
import org.testng.annotations.*;

public class Annotations {

    /* The annotated method will be run before any test method belonging to the classes inside the <test> tag is run */
    @BeforeTest
    public void prerequisite() {
        System.out.println("Before Test");
    }

    /* The annotated method will be run after all the test methods belonging to the classes inside the <test> tag have run */
    @AfterTest
    public void postrequisite() {
        System.out.println("After Test");
    }

    /* https://www.tutorialspoint.com/testng/testng_group_test.htm */
    @Test(groups = {"GroupTest"})
    public void test1() {
        System.out.println("Test1 : " + Thread.currentThread().getId());
    }

    @Test(groups = {"GroupTest"})
    public void test2() {
        System.out.println("Test2 : " + Thread.currentThread().getId());
    }

    /* The annotated method will be run only once before the first test method in the current class is invoked */
    @BeforeClass
    public void beforeclass() {
        System.out.println("Before Class");
    }

    /* The annotated method will be run only once after all the test methods in the current class have run */
    @AfterClass
    public void afterclass() {
        System.out.println("After Class");
    }

    /* The annotated method will be run before each test method. */
    @BeforeMethod
    public void beforemethod() {
        System.out.println("Before method");
    }

    /* The annotated method will be run after each test method. */
    @AfterMethod
    public void aftermethod() {
        System.out.println("After Method");
    }

    /* Annotation to skip or execute */
    @Test(enabled=false)
    public void basicTest() {
        System.out.println("Basic Test");
    }

}
