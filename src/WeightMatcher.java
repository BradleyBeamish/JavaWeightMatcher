import java.util.ArrayList;
import java.util.Scanner;

public class WeightMatcher {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Create two empty lists to store the weights
        ArrayList<Double> list1 = new ArrayList<>();
        ArrayList<Double> list2 = new ArrayList<>();

        // Ask the user to enter weights for the first list
        System.out.println("Enter weights for the first list (separated by spaces):");
        String[] input1 = in.nextLine().split(" ");
        for (String weight : input1) {
            list1.add(Double.parseDouble(weight));
        }

        // Ask the user to enter weights for the second list
        System.out.println("Enter weights for the second list (separated by spaces):");
        String[] input2 = in.nextLine().split(" ");
        for (String weight : input2) {
            list2.add(Double.parseDouble(weight));
        }

        // Find and print the closest matching weights from the two lists
        for (Double weight1 : list1) {
            double minDifference = Double.MAX_VALUE;
            double closestWeight = 0;
            for (Double weight2 : list2) {
                double difference = Math.abs(weight1 - weight2);
                if (difference < minDifference) {
                    minDifference = difference;
                    closestWeight = weight2;
                }
            }
            System.out.println(weight1 + " is closest to " + closestWeight);
        }
    }
}

