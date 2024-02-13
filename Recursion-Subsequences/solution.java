import java.util.*;
import java.util.Scanner;
public class Main {
    static int cnt=0;
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String ans="";
        subseq(s,ans);
        System.out.println();
        System.out.print(cnt);
    }
    public static void subseq(String s,String ans){
        if(s.length()==0){
            System.out.print(ans+" ");
            cnt++;
            return;
        }
        char ch=s.charAt(0);
        subseq(s.substring(1),ans);
        subseq(s.substring(1),ans+ch);
    }
}
