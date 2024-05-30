package basicjava;

import java.util.Scanner;

public class Calculator {
    
    public double sum(double a, double b){
        double add = a + b;
        return add;
    }
    
    public double sub(double a, double b){
        double s;
        if (a > b) s = a - b;
        else s = b - a;
        return s;
    }
    
    public double mul(double a, double b){
        double m = a * b;
        return m;
    }   
    
    public double div(double a, double b){
        double d = a / b; 
        return d;
    }
    
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        System.out.println("Enter Two number: ");
        double m, n;         
        m = in.nextDouble();
        n = in.nextDouble();
        
        Calculator gogo = new Calculator();
            System.out.println("Summation = "+gogo.sum(m, n));
            System.out.println("Subtraction = "+gogo.sub(m, n));
            System.out.println("Multiplication = "+gogo.mul(m, n));
            System.out.println("Division = "+gogo.div(m, n));
    }
}
