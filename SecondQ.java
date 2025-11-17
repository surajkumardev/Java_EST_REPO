//write a java program to write custom exception if age less tahn 18 then throw exception 

import java.util.*;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String s) {
        super(s);
    }
}

public class CustomException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            if (age < 18) {
                throw new InvalidAgeException("Underage! Age must be 18 or above.");
            } else {
                System.out.println("Age is valid — You are eligible!");
            }

        } catch (InvalidAgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Please enter a valid integer age.");
        } finally {
            sc.close();
        }
    }
}
