import java.util.Scanner;

public class bmi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Your height in m: ");
        double height = input.nextDouble();
        
        System.out.print("Your weight in kg: ");
        double weight = input.nextDouble();
       
        double square = Math.pow(height,2);
        double bmi = weight / square;
        
        System.out.println("Your BMI is " + bmi);
    }
}
