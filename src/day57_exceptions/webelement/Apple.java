package day57_exceptions.webelement;

import java.util.ArrayList;

public class Apple {
    public static void main(String[] args) {

        Form obj = new Form ();
        Link obj2 = new Link();
        Input obj3 = new Input();
        Image obj4 = new Image();

        ArrayList <WebElement> elements = new ArrayList<>();
        elements.add(obj);
        elements.add(obj2);
        elements.add(obj3);
        elements.add(obj4);

        for (WebElement each: elements) {
            System.out.println(each.getText());


            if (each instanceof Form){
                ((Form) each).submit();
            }
        }

        WebElement logo = new Image();
        logo.click();
        //logo.extension = " .png"; // WebElement doesn't have access to the variable

        ((Image)logo).extension = ".png";

        Image logoAsImage = ((Image)logo);
        logoAsImage.extension = ".png";


    }
}
