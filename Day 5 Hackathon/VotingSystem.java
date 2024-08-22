
import java.util.Scanner;

public class VotingSystem {

    private static int votesForPartyA = 0;
    private static int votesForPartyB = 0;
    private static int votesForPartyC = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which party do you want to vote for?");
        System.out.println("1. Party A");
        System.out.println("2. Party B");
        System.out.println("3. Party C");

        System.out.print("Enter 1, 2 or 3: ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            votesForPartyA++;
            System.out.println("You voted for Party A!");
        } else if (choice == 2) {
            votesForPartyB++;
            System.out.println("You voted for Party B!");
        } else if (choice == 3) {
            votesForPartyC++;
            System.out.println("You voted for Party C!");
        } else {
            System.out.println("Invalid choice.");
        }
        System.out.println("Thank you for casting your vote!");

    }
}
