public class main{
 public static void main(String[] args) {
        int []arr={1,3,4,5,3,2,6,32,5};
        int n=arr.length-1;
        mergesort(n,arr,0);
        for (int i:arr)
            System.out.print(i+" ");
    }
    static void mergesort(int high,int[]arr,int low){
        if(low==high) return;
        int mid=(low+high)/2;
        mergesort(mid,arr,low);
        mergesort(high,arr,mid+1);
        merge(arr,low,mid,high);
    }
    static void merge(int[]arr,int low,int mid,int high){
        List<Integer>l=new ArrayList<>();
        int ll=low;
        int right=mid+1;
        while(ll<=mid&&right<=high){
            if(arr[ll]<=arr[right]){
                l.add(arr[ll]);
                ll++;
            }
            else{
                l.add(arr[right]);
                right++;
            }
        }
        while(ll<=mid){
            l.add(arr[ll++]);
        }
        while (right<=high){
            l.add(arr[right++]);
        }
        for (int i=ll;i<=high;i++){
            arr[i]=l.get(i-low);
        }
    }
}
