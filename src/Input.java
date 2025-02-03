import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        // makes scanner
        Scanner scanner = new Scanner(System.in);

        // Get the users name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Get user age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Get user weiught
        System.out.print("Enter your weight: ");
        double weight = scanner.nextDouble();

        // Get bool
        System.out.print("Are you a smoker?: ");
        boolean isSmoker = scanner.nextBoolean();

        // Output
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
        System.out.println("Smoker: " + isSmoker);

        scanner.close();
    }
}

