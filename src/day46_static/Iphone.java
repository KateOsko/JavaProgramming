package day46_static;

public class Iphone {

    String model;
    double price;

    static String company;
    static String os;
    static String day;
    static boolean appleDay;

    static {
        System.out.println("STATIC BLOCK RUN");
        company = "Apple";
        os = "IOS";
        day = "Wednesday";

        if(day.equals("Friday")){
            appleDay = true;
        }

    }

    public Iphone (String model, double price){
        System.out.println("CONSTRUCTOR RUN");
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
