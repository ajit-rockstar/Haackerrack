
import java.util.Scanner;

public class areaandperimeter {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int L=sc.nextInt();
        int b= sc.nextInt();
        
        int area= L*b;
        int perimeter= L+L+b+b;
        
        System.out.println(area);
        System.out.println(perimeter);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
