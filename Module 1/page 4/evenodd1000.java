import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class evenodd1000 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        
        if(num%2==0){
            if(num>1000){
                System.out.println("Even and above 1000");
            }
            else{
                System.out.println("Even");
            }
        }
        else if(num%2!=0){
            if(num>1000){
                System.out.println("Odd and above 1000");
            }
            else{
                System.out.println("Odd");
            }
        }
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}