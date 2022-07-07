package day26_05_11.driver_task;

public class RemoteWebDriver implements WebDriver, JavaScriptExecuter, TakeScreenshot {
    @Override
    public void executeScript(String script) {
        System.out.println("Executing Script");

    }

    @Override
    public void TakeScreenShot(String name) {
        System.out.println("Taking screenshot " + name);

    }

    @Override
    public void get(String URL) {
        System.out.println("opening website: " + URL);

    }

    @Override
    public void close() {
        System.out.println("Closing browser");

    }

    @Override
    public void quit() {
        System.out.println("Quitting browser");

    }
}
