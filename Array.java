
package basicjava;

import java.util.Scanner;

public class Array {
    public static void main(String[] args){
        
        int[] x;
        x = new int[5];   //int[] x = new int[5]; 
        
        //String name;
        
        Scanner in = new Scanner(System.in);
        
        for(int i = 0; i < 5; i++)
            x[i] = in.nextInt();
        
        for(int i = 0; i < 5; i++)
            System.out.println(x[i]);
        
        /*System.out.println("Your name is "+name);
        System.out.println("You are "+age+" years old");*/
        
    }
    
}
