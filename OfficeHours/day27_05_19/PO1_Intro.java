package day27_05_19;

import day26_05_11.driver_task.ChromeDriver;
import day26_05_11.driver_task.FireFoxDriver;
import day26_05_11.driver_task.SafariDriver;
import day26_05_11.driver_task.WebDriver;

public class PO1_Intro {

    public static void main(String[] args) {

        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("www.google.com");

        WebDriver driver = new ChromeDriver();
        // reference type     Object type

        driver.get("www.google.com");
        // since we have an overriden version og this method
        // it will execute from the child lass

        WebDriver safari = new SafariDriver();
        safari.get("www.google.com");

        // safari.talk(); it is not accessible from safari reference type. we can do down-casting to access it

        WebDriver firefox = new FireFoxDriver();
        firefox.get("www.google.com");
    }
}
