import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class printbonus {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int Salary= sc.nextInt();
        int yos=sc.nextInt();
        if(yos>5){
            int Bonus=(Salary * 5) / 100;
            System.out.println(Bonus);
           
        }
     else{
            System.out.println(0);
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}