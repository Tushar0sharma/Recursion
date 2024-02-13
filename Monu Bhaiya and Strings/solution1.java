import java.util.*;
public class Main {
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        boolean[]ans=new boolean[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int n=Integer.valueOf(ch);
            ans[n-97]=true;
        }
        String s2="";
        for(int i=0;i<ans.length;i++){
            if(ans[i]==true){
                char ch=(char)('a'+i);
                s2+=ch;
            }
        }
        System.out.print(s2);

    }
}
