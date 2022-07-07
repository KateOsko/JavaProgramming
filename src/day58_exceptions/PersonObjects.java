package day58_exceptions;

public class PersonObjects {
    public static void main(String[] args) {

        Person obj = new Person();
        obj.setAge(-50);

        try {
            obj.setName (null);
        } catch  (Exception e) {
            e.printStackTrace();

        }

/*
        try {
            obj.setAge(-50);
        } catch  (Exception e) {
            e.printStackTrace();

        }
        */


        System.out.println(obj.getName());
        System.out.println(obj.getAge());
    }
}