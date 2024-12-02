package utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;

public class Listeners implements ITestListener {
    @Override
    public void onStart(ITestContext context) {
        System.out.println("Tests started!");
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("Tests finished!");
    }
}
