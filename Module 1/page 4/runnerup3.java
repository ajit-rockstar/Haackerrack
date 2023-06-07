import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;
public class runnerup3 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b && a<c || a>c && a<b)
        {
            System.out.println(a);
        }
        else if(b>a && b<c || b>c && b<a){
            System.out.println(b);
        }
        else if(c>a && c<b || c>b && c<a){
            System.out.println(c);
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
