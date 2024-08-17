
import java.util.ArrayList;
import java.util.Scanner;

class EWasteItem {

    private String name;
    private String category;
    private boolean recyclable;

    public EWasteItem(String name, String category, boolean recyclable) {
        this.name = name;
        this.category = category;
        this.recyclable = recyclable;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public boolean isRecyclable() {
        return recyclable;
    }

    @Override
    public String toString() {
        return "E-Waste Item: " + name + " | Category: " + category + " | Recyclable: " + recyclable;
    }
}

class EWasteSystem {

    private ArrayList<EWasteItem> wasteItems;

    public EWasteSystem() {
        wasteItems = new ArrayList<>();
    }

    public void addItem(EWasteItem item) {
        wasteItems.add(item);
    }

    public void displayItems() {
        if (wasteItems.isEmpty()) {
            System.out.println("No e-waste items to display.");
        } else {
            for (EWasteItem item : wasteItems) {
                System.out.println(item);
            }
        }
    }

    public void displayRecyclableItems() {
        boolean found = false;
        for (EWasteItem item : wasteItems) {
            if (item.isRecyclable()) {
                System.out.println(item);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No recyclable items found.");
        }
    }
}

public class EWasteMonitoringSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EWasteSystem system = new EWasteSystem();

        while (true) {
            System.out.println("\nE-Waste Monitoring System");
            System.out.println("1. Add E-Waste Item");
            System.out.println("2. Display All Items");
            System.out.println("3. Display Recyclable Items");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter item name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter item category: ");
                    String category = scanner.nextLine();
                    System.out.print("Is it recyclable? (true/false): ");
                    boolean recyclable = scanner.nextBoolean();
                    scanner.nextLine();

                    EWasteItem item = new EWasteItem(name, category, recyclable);
                    system.addItem(item);
                    System.out.println("Item added successfully.");
                }

                case 2 ->
                    system.displayItems();

                case 3 ->
                    system.displayRecyclableItems();

                case 4 -> {
                    System.out.println("Exiting the system.");
                    return;
                }

                default ->
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
