import java.util.ArrayList;
import java.util.Scanner;
public class voterReg extends Voter {
    static ArrayList<Voter> votersList = new ArrayList<>();
    public static Voter registration() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Please enter your date of birth: ");
        String dateOfBirth = scanner.nextLine();

        System.out.print("Please enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Please enter your gender: ");
        String gender = scanner.nextLine();

        System.out.print("Please enter your nationality: ");
        String nationality = scanner.nextLine();

        numberVoter++;
        System.out.println(numberVoter);
        Voter voter = new Voter(name, dateOfBirth, age, gender, nationality);
        voter.ID = numberVoter;
        votersList.add(voter);
        return voter;
    }
}
