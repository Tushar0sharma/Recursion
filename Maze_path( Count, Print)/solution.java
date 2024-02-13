import java.util.*;
// import java.util.Scanner;
public class Main {
    // static int cnt=0;
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        String s="";
        // path(n-1,m-1,0,0,s,ans);
        int c=path(m,n,0,0,s);
        System.out.println();
        System.out.print(c);
    }
    public static int path(int m,int n,int x,int y,String s){
        if(x==m-1&&y==n-1){
            System.out.print(s+" ");
            // cnt++;
            return 1;
        }
        if(x>m||y>n) return 0;
        int a= path(m,n,x+1,y,s+"V");
        int b=path(m,n,x,y+1,s+"H");
        return a+b;
    }
}
