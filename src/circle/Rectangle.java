package circle;

import java.util.Scanner;

public class Rectangle {
    public static String userArea = "area";
    public static String userCircumference = "omkrets";
    Scanner sc = new Scanner(System.in);
   
    private double length;
    private double width;
    
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    
    public double getLength(){
        return length;
    }
    
    public void setLength(double length){
        this.length = length;
    }
    
    public double getWidth(){
        return width;
    }
    
    public void setWidth(double width){
        this.width = width;
    }
    
    public double area(){
        double area = length * width;
        return area;
    }
    
    public double circumference(){
        double circumference = 2 * length + 2 * width; 
        return circumference;
    }
    
    public void runRectangle(){
                            System.out.println("Ange rektangelns längd: ");
                    double userRecInput = sc.nextDouble();
                    setLength(userRecInput);
                    System.out.println("Ange rektangelns bredd: ");
                    double userRecInput2 = sc.nextDouble();
                    setWidth(userRecInput2);
                    sc.nextLine();
                    System.out.println("Vill du beräkna area, omkrets eller båda?");
                    String userRecInput3 = sc.nextLine();
                    if (userRecInput3.equalsIgnoreCase(userArea)){
                        System.out.println("Rektangelns area är " + area());
                    }
                    else if (userRecInput3.equalsIgnoreCase(userCircumference))
                        System.out.println("Rektangelns omkrets är: " + circumference());
                    else {
                        System.out.println("Rektangelns area är " + area() + " och " + 
                                "Rektangelns omkrets är: " + circumference());
                    }
    }
}
