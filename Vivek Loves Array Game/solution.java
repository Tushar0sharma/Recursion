import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while( T-->0){
            int n=sc.nextInt();
            int []a=new int[n];
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
            System.out.println(funcmaxtime(a,0,a.length-1));
        }

    }
    public static int funcmaxtime(int []a,int start,int end){
        for(int i=start;i<end;i++){
            int left =funcsum(a,start,i);
            int right =funcsum(a,i+1,end);
            if(left==right){
                return 1+Math.max(funcmaxtime(a,start,i),funcmaxtime(a,i+1,end));
            }
        }
        return 0;
    }
    public static int funcsum(int []a,int start,int end){
        int sum=0;
        for(int i=start;i<=end;i++){
            sum+=a[i];
        }
        return sum;
    }
}
