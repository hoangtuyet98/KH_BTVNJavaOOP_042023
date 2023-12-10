package locator;

public class LocatorCMS {
    //Login
    public static String headerLoginPage="//h1[normalize-space()='Welcome to Active eCommerce CMS']";
    public static String inputEmail="//input[@id='email']";
    public static String inputPassword="//input[@id='password']";
    public static String buttonLogin="//button[normalize-space('Login')]";
    //Chọn menu c
    public static String menuProducts="//span[normalize-space()='Products']";
    public static String menuCategory="//span[normalize-space()='Category']";
    public static String headerCatagoryInfomation="//h1[normalize-space('All categories']";
    public static String buttonAddNewCategory="//span[normalize-space('Add New category']";

    // Add category
    public static String addCategory="//span[normalize-space()='Add New category']";
    public static String headerAddCategory = "//h5[normalize-space()='Category Information']";

    public static String inputNameCategory = "//input[@id='name']";
    public static String dropdownParentCategory = "//div[contains(text(),'No Parent')]";
    public static String EditinputParentCategory = "//label[normalize-space()='Parent Category']/following-sibling::div//div[@class='filter-option-inner-inner']";

    //l
    public static String inputSearchParentCategory = "//div[@class='col-md-9']//input[@type='search']";
    public static String inputOrderingNumber = "//input[@id='order_level']";

    public static String dropdownType = "//div[contains(text(),'Physical')]";
    public static String selctType = "//span[normalize-space()='Digital']";

    public static String inputBanner = "//label[normalize-space()='Banner (200x200)']/following-sibling::div";
    public static String searchBanner = "//input[@placeholder='Search your files']";
    public static String selectBanner = "//img[@class='img-fit']";
    public static String buttonAddFiles = "//button[normalize-space()='Add Files']";

    public static String inputIcon = "//label[normalize-space()='Icon (32x32)']//following-sibling::div";
    public static String searchIcon = "//input[@placeholder='Search your files']";
    public static String selectIcon = "//div[@class='aiz-file-box']/parent::div";
    public static String buttonAddFileIcon = "//button[normalize-space()='Add Files']";
    public static String inputMetaTitle = "//input[@placeholder='Meta Title']";
    public static String inputMetadescription = "//textarea[@name='meta_description']";
    public static String dropdownFilteringAttributes = "//button[@title='Nothing selected']";
    public static String inputSearchFilteringAttributes = "//div[@class='dropdown-menu show']//input[@aria-label='Search']";

    public static String buttonSaveCategory = "//button[@type='submit']";
}
