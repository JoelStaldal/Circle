package circle;

import java.util.Scanner;

public class Triangle {
    public static String userArea = "area";
    public static String userCircumference = "omkrets";
    Scanner sc = new Scanner(System.in);
    
    private double length;
    private double height;
    
    public Triangle(double length, double height){
        this.length = length;
        this.height = height;
    }
    public double getLength(){
        return length;
    }
    
    public void setLength(double length){
        this.length = length;
    }
    
    public double getHeight(){
        return height;
    }
    
    public void setHeight(double height){
        this.height = height;
    }
    
    public double area(){
        double area = length * height / 2;
        return area;
    }
    
    public double circumference(){
        double x2 = length * length + height * height;
        double x = Math.sqrt(x2);
        double circumference = length + height + x;
        return circumference;
    }
    
    public void runTriangle(){
                            System.out.println("Ange triangelns längd: ");
                    double userTriInput = sc.nextDouble();
                    setLength(userTriInput);
                    System.out.println("Ange triangelns höjd: ");
                    double userTriInput2 = sc.nextDouble();
                    setHeight(userTriInput2);
                    sc.nextLine();
                    System.out.println("Vill du beräkna area, omkrets eller båda?");
                    String userTriInput3 = sc.nextLine();
                    if (userTriInput3.equalsIgnoreCase(userArea)){
                        System.out.println("Triangelns area är " + area());
                    } else if (userTriInput3.equalsIgnoreCase(userCircumference)){
                        System.out.println("Triangelns omkrets är " + circumference());
                    } else {
                        System.out.println("Triangelns area är " + area() + " och " +
                                "Triangelns omkrets är " + circumference());
                    }
    }
}
