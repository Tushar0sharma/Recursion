import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> group1 = new ArrayList<>();
        ArrayList<Integer> group2 = new ArrayList<>();
        int count = find(arr, group1, group2, 0, 0, 0);
        System.out.println( count);

    }

    public static int find(int[] arr, ArrayList<Integer> group1, ArrayList<Integer> group2, int index, int sum1, int sum2) {
        if (index == arr.length) {
            if (sum1 == sum2) {
                displaySplit(group1, group2);
                return 1; 
            }
            return 0;
        }
        int count = 0;

        group1.add(arr[index]);
        count += find(arr, group1, group2, index + 1, sum1 + arr[index], sum2);
        group1.remove(group1.size() - 1);

        group2.add(arr[index]);
        count += find(arr, group1, group2, index + 1, sum1, sum2 + arr[index]);
        group2.remove(group2.size() - 1);
        return count;
    }
    public static void displaySplit(ArrayList<Integer> group1, ArrayList<Integer> group2) {
        for (int num : group1) {
            System.out.print(num + " ");
        }
        System.out.print("and ");
        for (int num : group2) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
