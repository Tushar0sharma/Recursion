import java.util.*;
import java.util.Scanner;
public class Main {
    static int cnt=0;
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        String s="";
        int d=n-1;
        path(n-1,m-1,d,0,0,0,s);
        System.out.println();
        System.out.print(cnt);
    }
    public static void path(int n,int m,int d,int vx,int hx,int dx,String s){
        if(vx==n&&hx==m){
            System.out.print(s+" ");
            cnt++;
            return ;
        }
        if(vx>n||hx>m||dx>d) return;
        path(n,m,d,vx+1,hx,dx,s+"V");
        path(n,m,d,vx,hx+1,dx,s+"H");
        path(n,m,d,vx+1,hx+1,dx+1,s+"D");

    }
}
