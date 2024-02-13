import java.util.*;
public class Main {
    static int n, m;
    static char[][]grid;
    static int[][]path;
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
       n=sc.nextInt();
       m=sc.nextInt();
      grid=new char[n+1][m+1]; 
      path=new int[n+1][m+1];
      for(int i=1;i<=n;i++){
         String row=sc.next();
         for(int j=1;j<=m;j++){
             grid[i][j]=row.charAt(j-1);
         }
      }
      boolean found=find(1,1);
      if(!found){
          System.out.println("NO PATH FOUND");
      }
      else{
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                System.out.print(path[i][j]+" ");
            }
            System.out.println();
        }
      }
    }
    static boolean find(int i,int j){
        if(i<1||i>n||j<1||j>m||grid[i][j]=='X'||path[i][j]==1){
            return false;
        }
        path[i][j]=1;
        if(i==n && j==m){
            return true;
        }
        if(find(i+1,j)||find(i-1,j)||find(i,j+1)||find(i,j-1)){
            return true;
        }
        path[i][j]=0;
        return false;
    }
}
