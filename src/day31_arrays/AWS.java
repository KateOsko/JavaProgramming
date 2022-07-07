package day31_arrays;

import java.util.Arrays;

public class AWS {
    public static void main(String[] args) {
        //app and we want to deploy on multiple zones

        String app = "etsy";
        String zones = "is-east1,us-west1,us-west2,us-west3";

        String[] allZones = zones.split(",");
        for (String eachZone : allZones) {
            System.out.println(app + " is deploying on " + eachZone);

        }

        char [] d = app.toCharArray();
        System.out.println(Arrays.toString(d));
        System.out.println(Arrays.toString(allZones));
        System.out.println(allZones[allZones.length-1]);
    }
}
