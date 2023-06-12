package DemoTesNG;

import org.testng.annotations.*;

@Test
public class ConfigurationAnnotations_1_ListBox {

    @Test (groups = "smoke")
    public void test1_BootstrapDataPicker(){
        System.out.println("     (5) Test Method 1: Bootstrap List Box");
    }

    @Test
    public void test2_JQueryDataPicker(){
        System.out.println("     (5) Test Method 2: JQuery Data Picker");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("    (4) Execute Before Each Test Method");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("    (4) Execute After Each Test Method \n");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("   (3) Execute Before Class: Date Pickers");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("   (3) Execute After Class: Date Pickers");
    }

    @BeforeGroups(groups = {"Regression", "smoke"})
    public void beforeGroups(){
        System.out.println("Execute Before Group:");
    }
    @AfterGroups(groups = {"Regression", "e2e"})
    public void afterGroups(){
        System.out.println("Execute After Group:");
    }


}
