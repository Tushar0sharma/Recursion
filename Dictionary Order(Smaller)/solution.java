import java.util.*;
public class Main {
    static int flag=0;
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char[]ch=s.toCharArray();
        Arrays.sort(ch);
        String s1=new String(ch);
        print(s1,"",s);
    }
    static void print(String ch,String ans,String s){
        if(ch.length()==0){
            if(ans.equals(s)){
                flag=1;
            }
            else if(flag==0){
            System.out.println(ans);
            }
            return;
        }
        for(int i=0;i<ch.length();i++){
             print(ch.substring(0,i)+ch.substring(i+1),ans+ch.charAt(i),s);
        }
    }
}
