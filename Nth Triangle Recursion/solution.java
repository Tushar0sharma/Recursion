import java.util.*;
import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        generate(n,sum);
    }
    public static void generate(int n,int sum){
       if(n<1){
           System.out.print(sum);
           return;
       }
       sum+=n;
       generate(n-1,sum);
    }
}
