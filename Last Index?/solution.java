import java.util.*;
import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        System.out.print(lastindex(arr,n-1,m));
    }
    public static int lastindex(int[]arr,int n,int m){
             if(n==-1){
                 return -1;
             }
             if(arr[n]==m){
                 return n;
             }
             
            return lastindex(arr,n-1,m);
    }
}
