package circle;
import java.util.Scanner;

class Circle {
    public static String userArea = "area";
    public static String userCircumference = "omkrets";
    Scanner sc = new Scanner(System.in);

    private final double PI = 3.14;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area() {
        double area = radius * radius * PI;
        return area;
    }

    public double circumference() {
        double circumference = 2 * PI * radius;
        return circumference;
    }

    public void runCircle() {
        System.out.println("Ange cikelns radie: ");
        double userCirInput = sc.nextDouble();
        sc.nextLine();
        setRadius(userCirInput);
        System.out.println("Vill du beräkna area, omkrets eller båda?");
        String userCirInput2 = sc.nextLine();
        if (userCirInput2.equalsIgnoreCase(userArea)) {
            System.out.println("Cirkelns area är " + area());
        } else if (userCirInput2.equalsIgnoreCase(userCircumference)) {
            System.out.println("Cirkelns omkrets är: " + circumference());
        } else {
            System.out.println("Cirkelns area är " + area() + " och "
                    + "Cirkelns omkrets är: " + circumference());
        }
    }

}
