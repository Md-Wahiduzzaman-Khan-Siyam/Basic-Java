package basicjava;

import java.util.Scanner;
import java.util.ArrayList;

public class Testing{
    
    public static void main(String[] args){
        int a, b, c = 0, i, j;
        String s;
        
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        arr1.add(23);
        arr1.add(40);
        
        System.out.println(arr1.get(0));
        System.out.println(arr1.get(1));
        
        int[] arr = new int[100];
        Scanner gogo = new Scanner(System.in);
        a = gogo.nextInt();
        
        for(i = a, j = 0; i <= 100; i+=a){
            arr[j] = i; j++;
            c++;
        }
        
        for(i = 0; i < j; i++){
            System.out.println("No "+(i+1)+" = "+arr[i]);
        }
        if(c > 10){
            Scanner ngogo = new Scanner(System.in);
            s = ngogo.nextLine();
            System.out.println("I am "+s);
        }
    }
    
}
