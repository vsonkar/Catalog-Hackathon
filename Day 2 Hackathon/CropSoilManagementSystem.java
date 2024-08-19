
import java.util.Scanner;

public class CropSoilManagementSystem {

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nWelcome to the Crop and Soil Management System");
            System.out.println("1. Crop Selection");
            System.out.println("2. Soil Management");
            System.out.println("3. Disease identification");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");

            int choice = s.nextInt();

            switch (choice) {
                case 1:
                    cropSelection();
                    break;
                case 2:
                    soilManagement();
                    break;
                case 3:
                    diseaseIdentification();
                    break;
                case 4:
                    System.out.println("Exiting the system.");
                    s.close();
                    return;
                default:
                    System.out.println("Invalid choice");
                    ;
                    break;
            }
        }
    }

    static void cropSelection() {
        System.out.println("Enter the soil type (Red, Black, Alluvial, Laterite, Desert, Mountain):");
        String soilType = s.next();

        switch (soilType.toLowerCase()) {
            case "red":
                System.out.println("Recommended crops: Cotton, Wheat, Rice, Pulses");
                break;
            case "black":
                System.out.println("Recommended crops: Cotton, Soybean, Millets, Tobacco");
                break;
            case "alluvial":
                System.out.println("Recommended crops: Rice, Wheat, Sugarcane, Pulses");
                break;
            case "laterite":
                System.out.println("Recommended crops: Tea, Coffee, Cashew, Rubber");
                break;
            case "desert":
                System.out.println("Recommended crops: Barley, Millet, Date Palm, Sorghum");
                break;
            case "mountain":
                System.out.println("Recommended crops: Tea, Spices, Fruits, Vegetables");
                break;
            default:
                System.out.println("Invalid soil type or not recognized.");
                break;
        }
    }

    static void soilManagement() {
        System.out.println("Enter the pH level of the soil: ");
        float pH = s.nextFloat();

        if (pH < 5.5) {
            System.out.println("Soil is too acidic. Add some lime");
        } else if (pH > 7.5) {
            System.out.println("Soil is too alkaline. Add some sulfur");
        } else {
            System.out.println("Soil pH is optimal for most crops");
        }
    }

    static void diseaseIdentification() {
        System.out.println("Enter the symptoms (Yellow, Wilting, Spots): ");
        String symptoms = s.next();

        switch (symptoms.toLowerCase()) {
            case "yellowing":
                System.out.println("Possible Disease: Nitrogen Deficiency");
                break;
            case "wilting":
                System.out.println("Possible disease: Fusarium Wilt.");
                break;
            case "spots":
                System.out.println("Possible disease: Leaf Spot.");
                break;
            default:
                System.out.println("No matching disease found.");
                break;
        }
    }
}
