import java.util.*;
import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        generateodd(n);
        generateeven(n,2);

    }
    public static void generateodd(int n){
        if(n<1) return;
        if(n%2!=0){
             System.out.println(n);
        }
        generateodd(n-1);
    }
    public static void generateeven(int n,int i){
       if(i>n) return;
       if(i%2==0) System.out.println(i); 
       generateeven(n,i+1);
    }

}
