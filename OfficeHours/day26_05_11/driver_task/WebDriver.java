package day26_05_11.driver_task;

public interface WebDriver {

    /*
         Interface WebDriver:
         void get(String URL);
         void close();
         void quit();

         */

    // public static final String VERSION = "initial them right away";

    public abstract void get(String URL); // by default -->public abstract
    void close();
    void quit();
    

}
