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
    static void print(String s1,String ans,String s){
        if(s1.length()==0){
            if(s.equals(ans)){
                flag=1;
            }
            else if(flag==1){
                System.out.println(ans);
            }
            return;
        }
        for(int i=0;i<s1.length();i++){
            print(s1.substring(0,i)+s1.substring(i+1),ans+s1.charAt(i),s);
        }
    }
}
