package day07_unary_operators;

public class Pizza {
    public static void main(String[] args) {
        String TypeofPizza = "Cheese";
        int numofSlices = 8;
        int numofPeople = 4;
        int slicesPerPerson = numofSlices/numofPeople;
        int slicesLeftOver = numofSlices%numofPeople;

        String report = "We ordered "+ TypeofPizza + " pizza with " + numofSlices + " slices, " + numofPeople + " people and " + slicesPerPerson + " slices per person" + " each with " + slicesLeftOver + " slices left over";
        System.out.println(report);
    }

}
