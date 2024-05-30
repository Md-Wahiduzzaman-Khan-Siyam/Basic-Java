package basicjava;

import java.util.Scanner;

public class InputDemo{
    
    public static void main(String[] args){
        
        Scanner come = new Scanner(System.in);
        
        int a;
        double d;
        //char c;
        String c, s;
        
        System.out.println("Enter Your name, Gender, age & CGPA : ");
        
        s = come.nextLine();
        c = come.next();
        a = come.nextInt();
        d = come.nextDouble();
        
        System.out.println("Your name : "+s);
        System.out.println("Your gender : "+c);
        System.out.println("You are "+a+" years old");
        System.out.println("Your CGPA : "+d);
        
    }    
}
