import java.util.Scanner;
public class specifically {
    public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Hello, what's your name?");
    String name = sc.next();
    System.out.print("Ok, " + name + ", how old are you? ");
    int age = sc.nextInt();
    
    System.out.println();
    if (age < 16) {
        System.out.println("You can't drive");
    } else if (age == 16 || age == 17) {
        System.out.println("You can drive but not vote");
    } else if (age >= 18 && age <= 24) {
        System.out.println("You can vote but not rent a car");
    } else {
        System.out.println("You can do pretty much anything");
    }
    
    }
}
