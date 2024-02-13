import java.util.*;
import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int []currentsubset=new int[n];
        int m=sc.nextInt();
        int[]cnt={0};
        subset(arr,n,m,0,currentsubset,0,cnt);
        System.out.println();
        System.out.print(cnt[0]);
    }
    public static void subset(int[]arr,int n ,int m,int i,int []currentsubset,int subsetsize,int[]cnt){
        if(i==arr.length){
            int sum=0;
            for(int j=0;j<subsetsize;j++){
                sum+=currentsubset[j];
            }
            if(sum==m){
                for(int k=0;k<subsetsize;k++){
                    System.out.print(currentsubset[k]+" ");
                }
                System.out.print(" ");
                cnt[0]++;
            }
            return;

        }
        currentsubset[subsetsize]=arr[i];
        subset(arr,n,m,i+1,currentsubset,subsetsize+1,cnt);
        subset(arr,n,m,i+1,currentsubset,subsetsize,cnt);
    }
}
