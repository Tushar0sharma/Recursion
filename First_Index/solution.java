import java.util.*;
import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        // Your Code Here;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        System.out.print(index(arr, n, m));
        
    }
    public static int index(int[]arr,int n,int m){
        for(int i=0;i<n;i++){
            if(arr[i]==m){
                return i;
            }
        }
        return -1;
    }
}
