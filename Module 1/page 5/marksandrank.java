import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class marksandrank {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int marks=sc.nextInt();
        int rank=sc.nextInt();
        if(marks<20 || rank>100){
            System.out.println("Needs improvement");
        }
        else if(marks<40 || rank>80){
            System.out.println("Concentrate");
        }
        else if(marks<60 || rank>120){
            System.out.println("Needs to focus");
        }
        else if(marks>100 || rank<10){
            System.out.println("Very good");
        }
        else{
            System.out.println("Bright Student");
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}