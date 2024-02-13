import java.util.*;
public class Main {
    public static void print(String s, String rem, String rep, int count){
        if(s.length()==0){
            System.out.println(count);
            System.out.println(rem);
            System.out.println(rep);
            return;
        }
        if(s.length()>=3 && s.charAt(0)=='h' && s.charAt(1)=='i' && s.charAt(2)=='t'){
            print(s.substring(1), rem+s.charAt(0), rep+s.charAt(0), count);
        }
        else if(s.length()>=2 && s.charAt(0)=='h' && s.charAt(1)=='i')
        {
            print(s.substring(2), rem, rep+"bye", count+1);
        }
        else{
            print(s.substring(1), rem+s.charAt(0), rep+s.charAt(0), count);
        }
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        print(s,"","",0);
    }
}
