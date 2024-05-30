package basicjava;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
    
    public static void main(String[] args){
        
        Scanner x = new Scanner(System.in);
        
        int[] arr = new int[5];
        
        for(int i = 0; i < 5; i++)
            arr[i] = x.nextInt();
        
        Arrays.sort(arr); //as well as for string
        
        for(int i = 0; i < 5; i++)
            System.out.println(arr[i]);
    }
}
