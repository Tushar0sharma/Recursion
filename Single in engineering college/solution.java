import java.util.*;
public class Main {
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long arr[]=new long[n];
        long max=0;
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextLong();
            if(max<arr[i])
            max=arr[i];
        }
        long wood=sc.nextLong();
        long low=0; 
        long high=max;
        long ans=0;
        while(low<=high){
            long mid=low+(high-low)/2;
            if(check(arr, mid, wood)){
                low=mid+1;
                ans=mid;
            }
            else{
                high=mid-1;
            }
        }
        System.out.print(ans);
    
    }
     public static boolean check(long arr[], long mid, long wood){
        long totalWood=0;
        for(long i: arr){
            if(i>=mid){
                totalWood+=i-mid;
            }
            if(totalWood>=wood)
            return true;
        }
        return false;
    }

}
