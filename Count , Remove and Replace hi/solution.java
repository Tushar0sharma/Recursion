import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        print("","",s,0);
    }
    static void print(String ans,String s1, String s,int cnt){
        if(s.length()==0){
            System.out.println(cnt);
            System.out.println(s1);
            System.out.println(ans);
            return;
        }
        if(s.length()>=2&&s.charAt(0)=='h'&&s.charAt(1)=='i'){
            print(ans+"bye",s1,s.substring(2),cnt+1);
        }
        else{
            print(ans+s.charAt(0),s1+s.charAt(0),s.substring(1),cnt);
        }
    }
}
