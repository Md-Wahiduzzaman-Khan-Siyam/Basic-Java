package basicjava;

import java.util.Scanner;

public class EqualString {
    public static void main(String[] args) {
        Scanner gogo = new Scanner(System.in);
        System.out.println("Enter 3 strings :");
        String s1 = gogo.nextLine();
        String s2 = gogo.nextLine();
        String s3 = gogo.nextLine();
        
        if (s1.equals(s2) && !s1.equals(s3)) {
            System.out.println("String 1 is Equals to String 2.");
        } 
        else if (s1.equals(s3) && !s1.equals(s2)) {
            System.out.println("String 1 is Equals to String 3.");
        } 
        else if (s2.equals(s3) && !s2.equals(s1)) {
            System.out.println("String 2 is Equals to String 3.");
        } 
        else if (s1.equals(s2) && s1.equals(s3)) {
            System.out.println("All three strings are equal.");
        } 
        else {
            System.out.println("No two strings are equal.");
        }
    }
}