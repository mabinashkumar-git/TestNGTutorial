package testNGFiles;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {

    /* To get all tests right click on Listeners class file in Project Explorer -> Select Source ->
	   Override/Imlement Method ->Select desired */

    @Override
    public void onTestStart(ITestResult result) {
        // TODO Auto-generated method stub
//        ITestListener.super.onTestStart(result);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        // TODO Auto-generated method stub
//        ITestListener.super.onTestSuccess(result);
        System.out.println("Passed : The method which passed is -> " + result.getName() + "()");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        // TODO Auto-generated method stub
//        ITestListener.super.onTestFailure(result);
        System.out.println("Failed : The method which failed is -> " + result.getName() + "()");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        // TODO Auto-generated method stub
//        ITestListener.super.onTestSkipped(result);
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // TODO Auto-generated method stub
//        ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
    }

    @Override
    public void onStart(ITestContext context) {
        // TODO Auto-generated method stub
//        ITestListener.super.onStart(context);
    }

    @Override
    public void onFinish(ITestContext context) {
        // TODO Auto-generated method stub
//        ITestListener.super.onFinish(context);
    }

//	@Override
//	public void onTestFailure(ITestResult result) {
//		System.out.println("Failed : The method which failed is -> " + result.getName() + "()");
//	}
//
//	@Override
//	public void onTestSuccess(ITestResult result) {
//		System.out.println("Passed : The method which passed is -> " + result.getName() + "()");
//	}

}
