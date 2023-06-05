import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class finalsalary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age =sc.nextInt();
        int salary = sc.nextInt();
        if(age>60){
            int final_income= salary+1000;
            System.out.println(final_income);
        }
        else if(age>40 && age <=60)
        {
            int final_income= salary+500;
            System.out.println(final_income);
        }
        else if(age<=40)
            {
            System.out.println(salary);
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}