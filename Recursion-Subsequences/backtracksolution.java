import java.util.*;

public class subsequence {
    public static void main(String[] args) {
        int []arr={1,2,3,4};
        List<Integer>l=new ArrayList<>();
        print(l,0,arr.length-1,arr);
    }
    static void print(List<Integer>l,int i,int n,int []arr){
        if(i==n){
            System.out.print(l+" ");
            return;
        }
        l.add(arr[i]);
        print(l,i+1,n,arr);
        l.remove(l.size()-1);
        print(l,i+1,n,arr);
    }
}
