import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        try {
            System.out.print("Enter ship type: ");
            String type = s.next();

            System.out.println("\n\nEnter ship name: ");
            String name = s.next();

            System.out.println("\n\nEnter ship damage: ");
            double damage = s.nextDouble();

            EnemyShipFactory factory = new EnemyShipFactory();
            var obj = factory.makeEnemyShip(type.toLowerCase(), name, damage);
            obj.displayEnemyShip();

        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number.");
            s.nextLine(); // Clear the invalid input from the scanner
        }
    }
}
