import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter weight: ");
        int weight = reader.nextInt();

        System.out.print("Enter height in feet ");
        int heightInFeet = reader.nextInt();

        System.out.print("Enter height in inches: ");
        int heightInInches = reader.nextInt();

        int totalHeight = (heightInFeet*12)+heightInInches;

        reader.close();

        float heightInInchesFloat = (float) totalHeight;
        float calculatedBMI = (weight/(heightInInchesFloat*heightInInchesFloat))*703;

        System.out.println(calculatedBMI);

        if (calculatedBMI < 18.5) {
            System.out.println("Underweight");
        } else if (calculatedBMI < 24.9) {
            System.out.println("Normal");
        } else if (calculatedBMI < 29.9) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}