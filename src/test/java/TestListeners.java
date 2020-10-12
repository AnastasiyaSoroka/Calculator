import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListeners implements ITestListener {
    public void onTestStart(ITestResult result) {
        System.out.println("Test started: " + result.getName());

    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("Test completed successfully: " + result.getName());

    }

    public void onTestFailure(ITestResult result) {
        System.out.println("Test Failed: " + result.getName());

    }

    public void onTestSkipped(ITestResult result) {
        System.out.println("Test Skipped: " + result.getName());

    }

    public void onStart(ITestContext context) {
        System.out.println("Started: " + context.getName());

    }

    public void onFinish(ITestContext context) {
        System.out.println("Finished: " + context.getName());

    }
}
