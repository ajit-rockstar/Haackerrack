import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class Highsumorlowsum {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x= sc.nextInt();
        int y= sc.nextInt();
        int sum=x+y; 
        if(sum>=100){
            System.out.println("High Sum");
        }
        else{
            System.out.println("Low Sum");
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}