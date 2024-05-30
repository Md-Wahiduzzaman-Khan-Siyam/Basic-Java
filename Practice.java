package basicjava;

import java.util.Scanner;

public class Practice{
    
    public static void main(String[] args){
        
        Scanner gogo = new Scanner (System.in);
        
        int a, b, c, i, j, t, s;
        t = gogo.nextInt();
        
        for(j = 1; j <= t; j++){
            s = gogo.nextInt();
            int[] arr = new int[s];
            
            for(i = 0; i < s; i++)
                arr[i] = gogo.nextInt();
            
            for(i = 0, b = 0; i < s - 1; i++){
                a = arr[i] + arr[i + 1];
                if(a % 2 != 0) b+=a;
            }
            
            System.out.println("Case "+j+" : "+b);
        }
        
        
    }
    
}
