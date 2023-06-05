import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class oldestamong3 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        int C=sc.nextInt();
        if(A>B &&A>C){
            System.out.println("A");
        }
        else if(B>A && B>C)
        {
            System.out.println("B");
         }
        else if(C>A && C>B){
            System.out.println("C");
        }
        else if(A==B && B==C){
            System.out.println("A");
        }
        else if(A==B && A>C){
            System.out.println("A");
        }
        
        
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}