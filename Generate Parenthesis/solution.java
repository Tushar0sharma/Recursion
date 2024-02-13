import java.util.*;
import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
       Scanner sc =new Scanner(System.in);
       int n=sc.nextInt();
       String s="";
       generate(0,0,n,s);
    }
    public static void generate(int o,int c,int n,String s){
        if(o==n&&c==n){
            System.out.println(s);
            return;
        }
        if(o>c) generate(o,c+1,n,s+")");
        if(o<n) generate(o+1,c,n,s+"(");
    }
}
