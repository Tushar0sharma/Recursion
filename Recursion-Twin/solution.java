import java.util.*;
import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char[]ch=s.toCharArray();
        int n=ch.length;
        System.out.print(find(ch,n,2,0));
    }
    public static int find(char[]ch ,int n,int i,int cnt){
        if(n<3) return 0;
        if(i>=n) return cnt;
        if(ch[i]==ch[i-2])
         cnt+=1;
        i+=1;
        return find(ch,n,i,cnt);

    }
}
