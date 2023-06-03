package BT3.common;

public class BaseTest extends Constants{


    public BaseTest(String browser, boolean report, boolean headless) {
        super(browser, report, headless);
    }
    public void createDriver(){
        System.out.println("Browser "+ BaseTest.getBrowser());
        System.out.println("Report "+ BaseTest.isReport());
        System.out.println("Headless "+ BaseTest.isHeadless());
    }
    public void closeDriver(){
        System.out.println("Browser "+ BaseTest.getBrowser());

    }
    public static void main(String[] args) {

    }
}
