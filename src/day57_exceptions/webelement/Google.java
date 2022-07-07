package day57_exceptions.webelement;

import day57_exceptions.webelement.Input;
import day57_exceptions.webelement.Link;
import day57_exceptions.webelement.WebDriverUtil;
import day57_exceptions.webelement.WebElement;

public class Google {
    public static void main(String[] args) {

        WebElement link = new Link(); // created a Link object with WebElement reference

        WebElement input = new Input(); // created an Input object with WebElement reference

        WebDriverUtil.clickElement(link);

        WebDriverUtil.clickElement(new Link()); // because Interface is implemented in the Link class


        WebElement [] allElements = new WebElement [4]; // created an array that will store objects from classes that implement the WebElement interface

        //[null, null. null, null]

        allElements [0] = link; // [Link obj, null, null ,null]
        allElements[1]=input; // Link obj, Input objext, null ,null]
        allElements[2] = new Input();
        allElements[3] = new Image();

    }
}
