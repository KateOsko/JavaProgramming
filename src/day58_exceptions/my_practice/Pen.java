package day58_exceptions.my_practice;

public class Pen  {
    int inkLevel;
    String inkColor;

    public void write(){
        if(inkLevel <=10){
            throw new OutOfInkException();
        } else {
            System.out.println("Writing with pen, 10 ink used");
        }

        inkLevel-=10;
    }

    public void changeColor (String inkColor) throws InvalidColorException  {

        if(inkColor !="red" || inkColor !="black" || inkColor !="blue" ) {
            throw new InvalidColorException();
        } else {
            this.inkColor = inkColor;
        }



    }
}
