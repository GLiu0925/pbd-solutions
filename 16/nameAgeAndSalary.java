import java.util.Scanner;

public class nameAgeAndSalary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Hello, What is your name?");
        String name = input.next();
        
        System.out.print("Hi, " + name + "! How old are you?"); 
        int age = input.nextInt();
        
        System.out.println("So you're " + age + ", eh? That's not old at all!");
        System.out.print("How much do you make, " + name + "?");
        double salary = input.nextDouble();
        
        System.out.println(salary + " I hope that's per hour and not per year! LOL!");
    }
}
