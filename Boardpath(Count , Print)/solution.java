import java.util.*;
import java.util.Scanner;
public class Main {
    // static int cnt=0;
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        String s="";
        int []cnt={0};
        path(n,m,0,s,cnt);
        System.out.println();
        System.out.print(cnt[0]);
    }
    public static void path(int n,int m,int i,String s,int[] cnt ){
        if(i==n){
            System.out.print(s+" ");
            cnt[0]++;
            return;
        }
        if(i>n) return;
        for(int k=1;k<=m;k++){
           path(n,m,i+k,s+k,cnt);
        }
    }
}
