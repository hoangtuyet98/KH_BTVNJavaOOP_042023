package BT3.common;

public class Constants {
   private static String  browser;
   private static boolean report,headless;

    public Constants(String browser, boolean report, boolean headless) {
        Constants.browser = browser;
        Constants.report = report;
        Constants.headless = headless;
    }


    public static String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        Constants.browser = browser;
    }

    public static boolean isReport() {
        return report;
    }

    public void setReport(boolean report) {
        Constants.report = report;
    }

    public static boolean isHeadless() {
        return headless;
    }

    public void setHeadless(boolean headless) {
        Constants.headless = headless;
    }
}
