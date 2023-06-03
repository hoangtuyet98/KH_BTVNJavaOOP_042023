package BT3.testcases;

import BT3.common.BaseTest;

public class Testcase extends BaseTest {
    public Testcase(String browser, boolean report, boolean headless) {
        super(browser, report, headless);
    }

    public void login(){
        createDriver();
        System.out.println("Login");
        System.out.println(" url"+getBrowser());
        System.out.println("nhap ten ");
        System.out.println("nhap pass");
        closeDriver();
    }
    public void AddCategory(){
    login();
        System.out.println("Nhap cac buoc thuc hien");
        closeDriver();
    }

    public static void main(String[] args) {
        Testcase testcase=new Testcase("https://cms.anhtester.com/",true,true);
        testcase.login();
        System.out.println("---------------------");
        testcase.AddCategory();

    }
}
