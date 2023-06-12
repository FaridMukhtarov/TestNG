package DemoTesNG;

import org.testng.annotations.*;

public class ConfigurationAnnotations_1_DataPickers {

    @Test(groups = "smoke")
    public void test1_BootstrapDataPicker(){
        System.out.println("     (5) Test Method 1: Bootstrap Data Picker");
    }

    @Test(groups = {"regression", "e2e"})
    public void test2_JQueryDataPicker(){
        System.out.println("     (5) Test Method 2: JQuery Data Picker");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("    (4) Execute Before Each Test Method");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("    (4) Execute After Each Test Method");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("   (3) Execute Before Class: Date Pickers");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("   (3) Execute After Class: Date Pickers");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("  (2) Execute Before Each Test");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("  (2) Execute After Each Test");
    }
    @BeforeSuite
    public void beforeSuite (){
        System.out.println(" (1) Execute Before The Suite");
    }
    @AfterSuite
    public void afterSuite (){
        System.out.println(" (1) Execute After The Suite");
    }



}
