
package basicjava;

import java.util.Scanner;

public class ForEachLoop {
    
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        //int[] x = new int[5];
        int[] x = {23, 44, 55, 66, 77};
        
        String[] name = {"Siyam", "Shafiq", "Niloy", "Meherab", "Foysal"};
        //name = new String[5];
        
        for(int a : x)   //for each loop
            System.out.println(a);
        
        for(String n : name)
            System.out.println(n);
    }
}
