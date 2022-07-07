package day26_05_11.driver_task;

public class TestCases {
    public static void main(String[] args) {

        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("http://www.google.com");
        chromeDriver.TakeScreenShot("picture01");
        chromeDriver.close();

        System.out.println("=============");
        FireFoxDriver firefoxDriver = new FireFoxDriver();
        firefoxDriver.get("http://www.google.com");
        firefoxDriver.TakeScreenShot("picture02");
        firefoxDriver.close();

        System.out.println("=============");
        SafariDriver safari = new SafariDriver();
        safari.get("http://www.google.com");
        safari.TakeScreenShot("picture02");
        safari.talk();
        safari.fast();
        safari.secure();
        safari.close();


        System.out.println("=============");

        WebDriver driver = new ChromeDriver();
        ((TakeScreenshot)driver).TakeScreenShot("");

        WebDriver driver2 = new SafariDriver();

    }
}
