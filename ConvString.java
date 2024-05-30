package basicjava;

import java.util.Scanner;

public class ConvString {
    
public static void main(String[] args) {
    Scanner gogo = new Scanner(System.in);
    String s1 = gogo.nextLine();
    String s2 = gogo.nextLine();

    System.out.println("Lower Case:");
    System.out.println(""+s1.toLowerCase());
    System.out.println(""+s2.toLowerCase());

    System.out.println("Upper Case:");
    System.out.println("" + s1.toUpperCase());
    System.out.println("" + s2.toUpperCase());
    }
}