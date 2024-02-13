import java.util.*;
import java.util.Scanner;
public class Main {
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(replace(n));
    }
    public static int replace(int n){
        if(n==0) return 5;
        int temp=0;
        while(n>0){
            int ldigit=n%10;
            if(ldigit==0) ldigit=5;
            temp=temp*10+ldigit;
            n/=10;
        }
        return reverse(temp);
    }
    public static int reverse(int n){
        int temp=0;
        while(n>0){
            int ldigit=n%10;
            temp=temp*10+ldigit;
            n/=10;
        }
        return temp;
    }
}
