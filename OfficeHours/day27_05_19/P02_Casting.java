package day27_05_19;

import day26_05_11.driver_task.*;

public class P02_Casting {
    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.get("www.google.com");

        TakeScreenshot takeScreenshot = new ChromeDriver();
        takeScreenshot.TakeScreenShot("pic3");

        JavaScriptExecuter obj = new ChromeDriver();
        obj.executeScript("Execute Script");

        /*
        Why we use WebDriver as a reference type
        instead of TakeScreenShot or JavaScriptExecutor

        - has more methods
        - -we don't need to do downcasting




        DownCasting

        -Larger Type to Smaller Type (Parent to Child)
        -Explicitly
        -To access features of object type which is not accessible from reference
         */

        WebDriver driver2 = new SafariDriver();
        ((SafariDriver) driver2).secure();
        ((SafariDriver) driver2).fast();
        ((SafariDriver) driver2).talk();

        /*
        There must be IS A relation between object type and reference type
        Otherwise it will give ClassCastException

         */

        WebDriver chrome = new ChromeDriver();
       //  ((SafariDriver)driver.fast();
       //   cause ClassCastException





    }
}