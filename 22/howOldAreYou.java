import java.util.Scanner;

public class howOldAreYou {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Hey, what's your name?");
        String name = input.next();
        
        System.out.print("Ok, " + name + ", how old are you? ");
        int age = input.nextInt();
        
        if (age < 16) {
        System.out.println("You can't drive.");
        System.out.println("You can't vote.");
        System.out.println("You can't rent a car.");
        }
        
        if (age >= 16 && age < 18) {
        System.out.println("You can't vote.");
        System.out.println("You can't rent a car.");
        }
        
        if (age >= 18 && age < 25) {
        System.out.println("You can't rent a car.");
        }
        
        if (age >= 25) {
        System.out.println("You can do anything that's legal.");
        }
    }
}
