public class printNto1backtrack {
    public static void main(String[] args) {
        int n=3;
        print(1 ,n);
    }
    static void print(int j,int n){
        if(j==n+1) return;
        print(j+1,n);
        System.out.println(j);
    }
}
