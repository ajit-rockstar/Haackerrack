import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class agebracket {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(age>=70){
            System.out.println("Super Senior Citizen ");
        }
        else if(age<70 && age>=59)
        {
            System.out.println("Senior Citizen");
        }
        else if(age<59 && age>=18)
        {
            System.out.println("Adult");
        }
        else if(age<18 && age>1)
        {
            System.out.println("Underage");
        }
        else{
            System.out.println("New Born");
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}