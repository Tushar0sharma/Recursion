import java.util.*;
public class Main {
    public static void main(String args[]) {
     Scanner sc=new Scanner(System.in);
     int N=sc.nextInt();
     tower("A","B","C",N);
    }
    public static void tower(String a,String b,String c,int N){
        if(N==0){
          return;
        }
        tower(a,c,b,N-1);
        System.out.println("Moving ring "+N+" from "+a+" to "+b);
        tower(c,b,a,N-1);
    }
}
