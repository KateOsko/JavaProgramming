package day56_polymorphism.book;

public class Library {
    public static void main(String[] args) {

        JavaTextbook book1 = new JavaTextbook();
        book1.name = "Java Programming";
        book1.size = 20.5;
        book1.fun = true;
        book1.download();
        book1.open();
        book1.read();

        EBook book2 = new JavaTextbook();
        book2.name = "Java Programming";
        book2.size = 20.5;
    //  book2.fun = true; EBook reference doesn't have access to the fun variable
        ((JavaTextbook)book2).fun = true;
        book2.download();
        book2.open();
        book2.read();

        Book book3 = new JavaTextbook();
        book3.name = "Java Programming";
       // book3.size = 20.5;
       // book3.fun = true;
       // book3.download();
       // book3.open();
        book3.read();

        Downloadable book4 = new JavaTextbook();
       // book4.name = "Java Programming";
       // book4.size = 20.5;
       // book4.fun = true;
        book4.download();
       // book4.open();
       // book4.read();

        JavaTextbook book5 = (JavaTextbook)book4;
        // book4 was the interface reference, we cast the reference to be a JavaTextBook and assigned it to the book5 reference
        book5.read();
        book5.open();



    }
}
