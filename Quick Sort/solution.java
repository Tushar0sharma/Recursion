public class QuickSort {
    public static void main(String[] args) {
        int[]arr={1,23,55,322,4,5,32,2};
        int n=arr.length-1;
        sort(arr,n,0);
        for (int i:arr)
            System.out.print(i+" ");;
    }
    static void sort(int[]arr,int high ,int low){
        if(low<high){
            int partition=part(arr,low,high);
            sort(arr,partition-1,low);
            sort(arr,high,partition+1);
        }
    }

    private static int part(int[] arr, int low, int high) {
        int pivot=arr[low];
        int l=low;
        int r=high;
        while (l<r){
            while (arr[l]<=pivot&&l<high){
                l++;
            }
            while (arr[r]>pivot&&r>low){
                r--;
            }
            if(l<r){
                int temp=arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
            }
        }
        int temp=arr[low];
        arr[low]=arr[r];
        arr[r]=temp;
        return r;
    }
}
