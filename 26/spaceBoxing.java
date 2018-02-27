import java.util.Scanner;
public class spaceBoxing {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Please enter your current earth weight: ");
    int weight = sc.nextInt();
    System.out.println();
    
    System.out.println("I have information for the following planets:");
    System.out.println("     1. Venus    2. Mars    3. Jupiter");
    System.out.println("     4. Saturn   5. Uranus  6. Neptune");
    System.out.print("Which planet are you visiting? ");
    int planet = sc.nextInt();
    
    double times = 0;
    if (planet == 1) {
        times = 0.78;
    } else if (planet == 2) {
        times = 0.39;
    } else if (planet == 3) {
        times = 2.65;
    } else if (planet == 4) {
        times = 1.17;
    } else if (planet == 5) {
        times = 1.05;
    } else if (planet == 6) {
        times = 1.23;
    }
    double planetWeight = weight * times;
    
    System.out.println("Your weight would be " + planetWeight + " pounds on that planet.");
    }
}
