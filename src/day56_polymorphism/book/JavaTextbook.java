package day56_polymorphism.book;

/*
Create a concrete class JavaTextbook
    - Inherits EBook
    - Declare a fun variable
    - Override all abstract methods
 */

import day56_polymorphism.book.EBook;

public class JavaTextbook extends EBook {

    boolean fun;

    @Override
    public void read() {
        System.out.println("Reading Java textbook");

    }

    @Override
    public void download() {
        System.out.println("Downloading Java textbook");

    }

    @Override
    public void open() {
        System.out.println("Opening Java textbook");

    }
}
