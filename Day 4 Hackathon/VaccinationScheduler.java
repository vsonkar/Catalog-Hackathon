
import java.util.ArrayList;
import java.util.Scanner;

class VaccinationRecord {

    private String childName;
    private String vaccineName;
    private String appointmentDate;

    public VaccinationRecord(String childName, String vaccineName, String appointmentDate) {
        this.childName = childName;
        this.vaccineName = vaccineName;
        this.appointmentDate = appointmentDate;
    }

    @Override
    public String toString() {
        return "Child: " + childName + ", Vaccine: " + vaccineName + ", Date: " + appointmentDate;
    }
}

public class VaccinationScheduler {

    private ArrayList<VaccinationRecord> records = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        VaccinationScheduler scheduler = new VaccinationScheduler();
        scheduler.run();
    }

    private void run() {
        while (true) {
            System.out.println("\n1. Book Appointment");
            System.out.println("2. View Appointments");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    bookAppointment();
                    break;
                case 2:
                    viewAppointments();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void bookAppointment() {
        System.out.print("Enter child's name: ");
        String childName = scanner.nextLine();

        System.out.print("Enter vaccine name: ");
        String vaccineName = scanner.nextLine();

        System.out.print("Enter appointment date (YYYY-MM-DD): ");
        String appointmentDate = scanner.nextLine();

        VaccinationRecord record = new VaccinationRecord(childName, vaccineName, appointmentDate);
        records.add(record);
        System.out.println("Appointment booked successfully!");
    }

    private void viewAppointments() {
        if (records.isEmpty()) {
            System.out.println("No appointments scheduled.");
        } else {
            System.out.println("Scheduled Appointments:");
            for (VaccinationRecord record : records) {
                System.out.println(record);
            }
        }
    }
}
