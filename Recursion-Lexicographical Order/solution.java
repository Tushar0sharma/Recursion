import java.util.*;
import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        print(n,0);
    }
    static void print(int n,int count){
        if(count>n) return;
        int i=0;
        System.out.print(count+" ");
        if(count==0){
            i=1;
        }
        for(;i<=9;i++){
            print(n,count*10+i);
        }
    }
}
