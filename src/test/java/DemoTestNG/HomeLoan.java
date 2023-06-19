package DemoTestNG;

import org.testng.annotations.Test;

public class HomeLoan {
    @Test
    public void webLoginHomeLoan(){
        System.out.println("Selenium For Home");
    }
    @Test
    public void mobilLoginHomeLoan(){
        System.out.println("Appium For Home");
    }
    @Test
    public void LoginApiHomeLoan(){
        System.out.println("Rest Assured For Home");
    }
}
