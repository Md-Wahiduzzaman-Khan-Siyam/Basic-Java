package basicjava;

import java.util.Scanner;

public class CircleArea {
    
    public double area(double x){
        double a = 3.1416 * x * x;
        return a;
    }
    
    public static void main(String[] args){
        Scanner gogo = new Scanner (System.in);
        System.out.println("Enter the redious of the Circle: ");
        double m;
        m = gogo.nextDouble();
        
        CircleArea ar = new CircleArea();
        
        System.out.println("Area of the Circle is : "+ar.area(m));
    }
} 
