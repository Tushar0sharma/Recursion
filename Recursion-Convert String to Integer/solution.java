import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        String n=sc.next();
        int result=replace(n,0,0);
        System.out.println(result);
    }
    static int replace(String n,int i,int value){
        if(i==n.length()){
            return value;
        }
        char digitchar=n.charAt(i);
        int digit=digitchar-'0';
        int updatevalue=value*10+digit;

        return replace(n,i+1,updatevalue); 
    }
}
