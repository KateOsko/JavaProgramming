package day26_05_11.driver_task;

public class ChromeDriver extends RemoteWebDriver  {
    @Override
    public void get(String URL) {
        System.out.println("Opening in Chrome");;
    }
}

