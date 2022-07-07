package day57_exceptions.mypractice;

public class Computer {
    String os;
    int memory;

 public Computer(){

 }
    public Computer (String os, int memory){
        this.os = os;
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "os='" + os + '\'' +
                ", memory=" + memory +
                '}';
    }
}
