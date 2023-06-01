import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;
public class addlastdigit {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x= sc.nextInt();
        int y= sc.nextInt();
        
        int L1= x%10;
        int L2=y%10;
        
        System.out.println(L1+L2);
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}