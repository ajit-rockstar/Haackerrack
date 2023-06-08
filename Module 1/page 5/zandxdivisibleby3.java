import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class zandxdivisibleby3 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        
        if(x%3==0){
            if(y>=200){
                z=10+z;
            }
            else if(y>=100 && y<200){
                z=z+5;
            }
            else if(y>=50 && y<100){
                z=z+4;
            }
            else if(y<50){
                z=z+1;
            }
        }
        else if(x%3!=0){
            if(y>=200){
                z=z+3;
            }
            else if(y>=100 && y<200){
                z=z+2;
            }
            else if(y<100){
                z=z+1;
            }
        }
        int final_value= z+10;
        System.out.println(final_value);
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
