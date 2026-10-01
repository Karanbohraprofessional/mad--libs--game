import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Mad Libs Game!");
        System.out.print("Enter a name: ");
        String name = scanner.nextLine();

        System.out.print("Enter an adjective: ");
        String adjective = scanner.nextLine();

        System.out.print("Enter a noun: ");
        String noun = scanner.nextLine();

        System.out.print("Enter a verb: ");
        String verb = scanner.nextLine();

        System.out.print("Enter a place: ");
        String place = scanner.nextLine();

        String story = "One day, " + name + " went to " + place +
                ". It was a very " + adjective + " day. " +
                "Suddenly, " + name + " saw a " + noun +
                " and decided to " + verb + " with it. " +
                "Everyone in " + place + " was amazed!";

        System.out.println("\nHere is your Mad Libs story:");
        System.out.println(story);

        scanner.close();
    }
}
