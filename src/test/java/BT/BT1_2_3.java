package BT;

import common.BaseTest;
import locator.LocatorCMS;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BT1_2_3 extends BaseTest {
    @Test(priority = 1)
    public void loginCMS(){
        driver.get("https://cms.anhtester.com/login");
        //kiểm tra text màn login
        String  headerLoginpage1=  driver.findElement(By.xpath(LocatorCMS.headerLoginPage)).getText();
        Assert.assertEquals(headerLoginpage1,"Welcome to Active eCommerce CMS","Giá trị header sai");

        driver.findElement(By.xpath(LocatorCMS.inputEmail)).sendKeys("admin@example.com");
        driver.findElement(By.xpath(LocatorCMS.inputPassword)).sendKeys("123456");
        driver.findElement(By.xpath(LocatorCMS.buttonLogin)).click();
    }
    @Test(priority = 2)
    public void addCategory() {
        loginCMS();
        driver.findElement(By.xpath(LocatorCMS.menuProducts)).click();
        driver.findElement(By.xpath(LocatorCMS.menuCategory)).click();
        driver.findElement(By.xpath(LocatorCMS.addCategory)).click();

        // kiểm tra header trang addCategory
        //isDisplay cái này chỉ để xem có hiển thị hay không nên không ok lắm
        Assert.assertTrue(driver.findElement(By.xpath(LocatorCMS.headerAddCategory)).isDisplayed(), "tiêu đề không hợp lên");
        // so sánh trên web và thực tế
      //  Assert.assertEquals(driver.findElement(By.xpath(LocatorCMS.headerAddCategory)),"Category Information", "Tiêu đề addCategory không hợp lệ");


        driver.findElement(By.xpath(LocatorCMS.inputNameCategory)).sendKeys("tuyet.hoangthi");
        sleep(1);
        driver.findElement(By.xpath(LocatorCMS.dropdownParentCategory)).click();
        driver.findElement(By.xpath(LocatorCMS.inputSearchParentCategory)).sendKeys("---- ĐỒNG HỒ");
        driver.findElement(By.xpath(LocatorCMS.inputSearchParentCategory)).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath(LocatorCMS.inputOrderingNumber)).sendKeys("123");
        driver.findElement(By.xpath(LocatorCMS.dropdownType)).click();
        driver.findElement(By.xpath(LocatorCMS.selctType)).click();
        sleep(1);
        //Chú ý phần chọn hình: click Browse -> search tên hình add bằng tay -> click item hình -> Click Add button
        driver.findElement(By.xpath(LocatorCMS.inputBanner)).click();
        driver.findElement(By.xpath(LocatorCMS.searchBanner)).click();
        driver.findElement(By.xpath(LocatorCMS.searchBanner)).sendKeys("watc");
        sleep(1);
        driver.findElement(By.xpath(LocatorCMS.selectBanner)).click();
        driver.findElement(By.xpath(LocatorCMS.buttonAddFiles)).click();
        sleep(1);
       // thêm icon
        driver.findElement(By.xpath(LocatorCMS.inputIcon)).click();
        driver.findElement(By.xpath(LocatorCMS.searchIcon)).click();
        driver.findElement(By.xpath(LocatorCMS.searchIcon)).sendKeys("gio-qua");
        driver.findElement(By.xpath(LocatorCMS.selectIcon)).click();
        driver.findElement(By.xpath(LocatorCMS.buttonAddFileIcon)).click();
        sleep(5);
        driver.findElement(By.xpath(LocatorCMS.inputMetaTitle)).sendKeys("Meta Title");
        driver.findElement(By.xpath(LocatorCMS.inputMetadescription)).sendKeys("Meta description");
        driver.findElement(By.xpath(LocatorCMS.dropdownFilteringAttributes)).click();
        driver.findElement(By.xpath(LocatorCMS.inputSearchFilteringAttributes)).sendKeys("Size");
        driver.findElement(By.xpath(LocatorCMS.inputSearchFilteringAttributes)).sendKeys(Keys.ENTER);
        sleep(1);
        driver.findElement(By.xpath(LocatorCMS.buttonSaveCategory)).click();

}
}
