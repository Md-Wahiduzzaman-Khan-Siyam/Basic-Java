package basicjava;

import java.util.Scanner;

public class Concat {
    public static void main(String[] args) {
        Scanner gogo = new Scanner(System.in);
        String s1, s2, s3;
        String s = " ";
        System.out.println("Enter 3 strings: ");
        s1 = gogo.next();
        s2 = gogo.next();
        s3 = gogo.next();
        String x = s1 + s + s2 + s + s3;
        System.out.println("" + x);
    }
}
