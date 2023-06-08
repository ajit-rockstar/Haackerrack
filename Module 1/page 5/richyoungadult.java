import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class richyoungadult {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        int salary=sc.nextInt();
        if(age>40){
            if(salary>=30000){
                System.out.println("You are rich and adult");
            }
            else{
                System.out.println("You are an adult");
            }
        }
          else if(age<=40){
              if(salary>=12000){
                  System.out.println("You are rich and young");
              }
              else{
                  System.out.println("You are young");
              }
          }
        
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
