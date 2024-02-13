import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            String s=sc.next();
            String result=replace(s);
            System.out.println(result);
        }

    }
    static String replace(String s){
        if(s.length()<=1){
            return s;
        }
        if(s.startsWith("pi")){
            return "3.14"+replace(s.substring(2));
        }
        else{
            return s.charAt(0)+replace(s.substring(1));
        }
    }
}
