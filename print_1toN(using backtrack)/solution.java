public class print1toNbacktrack {
    public static void main(String[] args) {
        int n=3;
        print(n,0);
    }
    static void print(int n,int i){
        if(n==i) return;
        print(n-1,i);
        System.out.println(n);
    }
}
