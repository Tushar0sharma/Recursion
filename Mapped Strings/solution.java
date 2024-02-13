import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // String s1=new String(n);
        ArrayList<String>ans=new ArrayList<>();
        print(n+"",ans);
    }
    static void print(String s,List<String>ans){
        if(s.length()==0){
            String a=replace(ans);
            System.out.println(a);
            return;
        }
        for(int i=1;i<=s.length();i++){
            if(Integer.valueOf(s.substring(0,i))<=26){
                ans.add(s.substring(0,i));
                print(s.substring(i),ans);
                ans.remove(ans.size()-1);
            }
        }
    }
    static String replace(List<String>ans){
        String a="";
        for(String b:ans){
            int n=Integer.valueOf(b);
            char ch=(char)(n+'A'-1);
            a+=ch;
        }
       return a;
    }

}
