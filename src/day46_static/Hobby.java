package day46_static;

public class Hobby {
    /*
    - data:
            name, annual cost, is outdoors (boolean), requires others (boolean)

        - constructor
            - create a constructor that creates a Hobby object with the name
            - create a constructor that creates a Hobby object with the name and annual cost
            - create a constructor that creates a Hobby object with the name, annual cost, is outdoors, and requires others
     */

    String name;
    double cost;
    boolean isOutdoors;
    boolean requiresOthers;

    public Hobby(String name) {
        this.name = name;
    }

    public Hobby(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public Hobby(String name, double cost, boolean isOutdoors, boolean requiresOthers) {
        this(name, cost);
        this.isOutdoors = isOutdoors;
        this.requiresOthers = requiresOthers;
    }

    /*
    - method:
            - doIt():
                print: Doing $name-of-hobby $outside-or-inside

            - toString()
                print all the Hobby information
     */

    public String Doing() {
        String doing;
        doing = "Doing " + name + (isOutdoors ? " outside" : " inside");
        return doing;
    }

    public String toString() {
        return "Hobby: " + name +
                ", cost=" + cost +
                (isOutdoors ? ", outdoors" : ", indoors") +
                (requiresOthers ? ", requiresOthers" : ", doesn't require others " + "\n");
    }
}
