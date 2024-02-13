import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        char[][]mat=new char[n][m];
        for(int i=0;i<n;i++){
           String line=sc.next();
           mat[i]=line.toCharArray();
        }
        int[][]path=new int[n][m];
        boolean found=find(mat,path,0,0);
        if(!found){
            System.out.println("-1");
        }
        else{
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    System.out.print(path[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
    public static boolean find(char[][]mat,int[][]path,int i,int j){
        int n=mat.length;
        int m=mat[0].length;
        if(i==n-1 &j==m-1){
            path[i][j]=1;
            return true;
        }
        if(i<0 ||i>=n||j<0||j>=m||mat[i][j]=='X'){
            return false;
        }
        if( find(mat,path,i,j+1) || find(mat,path,i+1,j)){
            path[i][j]=1;
            return true;
        }
       return false;
    }
}
