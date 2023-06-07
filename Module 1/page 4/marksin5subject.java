import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class marksin5subject {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a= sc.nextDouble();
        double b= sc.nextDouble();
        double c= sc.nextDouble();
        double d= sc.nextDouble();
        double e= sc.nextDouble();
        double results=a+b+c+d+e;
        double percentage= (results*100)/500;
        System.out.println(results);
        System.out.println(percentage);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}