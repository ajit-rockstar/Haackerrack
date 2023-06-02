import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;
public class shopdiscount {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int unit=sc.nextInt();
        int cost=unit*100;
        if(cost>1000){
            int discount= (10*cost)/100;
            cost=cost-discount;
        }
        System.out.println(cost);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}