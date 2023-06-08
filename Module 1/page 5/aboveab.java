import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class aboveab {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>100 && b>10){
            System.out.println("a is above 100 and b is above 10");
        }
        else if(a>50 && b>50){
            System.out.println("a is above 50 and b is above 50");
        }
        else if(a>20 && b>100){
            System.out.println("a is above 20 and b is above 100");
        }
        else
        {
            System.out.println("None");
        }
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}