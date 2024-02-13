import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            String str=sc.next();
            char[]ch=new char[str.length()];
            generate(str,ch,0);
            System.out.println();
        } 

    }
    static void generate(String str,char[]ch,int k){
        if(k==str.length()){
            System.out.print(new String(ch)+" ");
            return;
        }
        if(str.charAt(k)=='0'||str.charAt(k)=='1'){
            ch[k]=str.charAt(k);
            generate(str,ch,k+1);
        }
        else if(str.charAt(k)=='?'){
            ch[k]='0';
            generate(str,ch,k+1);
            ch[k]='1';
            generate(str,ch,k+1);
        }
    }
}
