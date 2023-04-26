import java.util.Scanner;

public class HusbandAndWife {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String husbandName, wifeName;
        int yearsMarried;
        boolean happyMarriage;

        System.out.println("Welcome to the husband and wife program!");
        System.out.println("Please enter the husband's name:");
        husbandName = scanner.nextLine();
        System.out.println("Please enter the wife's name:");
        wifeName = scanner.nextLine();
        System.out.println("How many years have you been married?");
        yearsMarried = scanner.nextInt();
        System.out.println("Would you say you have a happy marriage? (true/false)");
        happyMarriage = scanner.nextBoolean();

        System.out.println();
        System.out.println(husbandName + " and " + wifeName + " have been married for " + yearsMarried + " years.");
        if (happyMarriage) {
            System.out.println("They have a happy marriage!");
        } else {
            System.out.println("They do not have a happy marriage.");
        }

        scanner.close();
    }

}
