
import java.util.*;
public class Main {
    static int c=0;
    static String []d={"","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String n=sc.next();
        print(n,"");
        System.out.println();
        System.out.print(c);
    }
    static void print(String n,String s){
        if(n.length()==0){
            System.out.print(s+" ");
            c++;
            return;
        }
        char ch=n.charAt(0);
        String p=d[ch-'0'];
        for(int i=0;i<p.length();i++){
            print(n.substring(1),s+p.charAt(i));
        }
    }
}
