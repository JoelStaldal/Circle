package circle;
import java.util.Scanner;

public class MyMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle circle1 = new Circle(0);
        Rectangle rectangle1 = new Rectangle(0, 0);
        Triangle triangle1 = new Triangle(0, 0);

        int temp = 0;

        do {
            System.out.println("-----------------------");
            System.out.println("Välkommen till menyn!");
            System.out.println("Vilken figur vill du beräkna?");
            System.out.println("[1] Cirkeln");
            System.out.println("[2] Rektangeln");
            System.out.println("[3] Triangeln");
            System.out.println("[0] Avsluta programmet");

            temp = sc.nextInt();

            switch (temp) {
                case 1:
                    circle1.runCircle();
                    break;
                case 2:
                    rectangle1.runRectangle();
                    break;
                case 3:
                    triangle1.runTriangle();
                    break;
                case 0:
                    System.out.println("Programmet avslutas");
                    break;
                default:
                    System.out.println("Menyn styrs genom att ange siffran framför valet, försök igen");
                    break;
            }

        } while (temp != 0);

    }
}
