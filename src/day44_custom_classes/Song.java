package day44_custom_classes;

public class Song {
    String name; // instance variable
    double length;
    String artist;
    String genre;

    public Song (String name) {
        this.name = name; // this means the instance of the Class
    }

    public Song (String name, double length){
//      this.name = name;
        this(name); // calling the first contractor
        this.length = length;
    }

    public Song(String name, double length, String artist) {
//        this.name = name;
//        this.length = length;
        this(name,length); // name and length contractors are being called here
        this.artist = artist;
    }

    public Song(String name, double length, String artist, String genre) {
//        this.name = name;
//        this.length = length;
//        this.artist = artist;
        this(name, length, artist);
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", artist='" + artist + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
