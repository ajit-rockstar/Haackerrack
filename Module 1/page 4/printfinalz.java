import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class printfinalz {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        if (x>=20){
            if(y>=100){
                z=100+z;
            }
            else if(y<100 && y>=50){
                z=50+z;
            }
            else{
                z=z+10;
            }
        }
        else if(x<20){
            if(y>=100){
                z=z+3;
            }
            else if(y<100 && y>=50){
                z=z+2;
            }
            else{
                z=z+1;
            }
        }
        System.out.println(z);
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}