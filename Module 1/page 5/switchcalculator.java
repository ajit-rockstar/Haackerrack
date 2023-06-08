import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class switchcalculator {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N= sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(N==10){
            System.out.println(a+b);
        }
        else if(N==20){
          System.out.println(a-b);
        }
        else if(N==30){
            System.out.println(a*b);
        }
        else if(N==40){
            System.out.println(a%b);
        }
        else if(N==50){
            System.out.println(a/b);
        }
        else{
            System.out.println("Enter a valid number");
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}