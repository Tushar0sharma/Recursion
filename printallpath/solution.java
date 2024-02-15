import java.util.Arrays;

public class test2 {
    public static void main(String[] args) {
        boolean [][]grid=
                {{true,true,true},
                 {true,true,true},
                 {true,true,true}
                };
        int [][]path=new int [grid[0].length][grid.length];
        int n=grid[0].length;
        int m=grid.length;
        int k=print("",grid,path,n,m,0,0,1);
        System.out.println(k);
    }
    public static int print(String s,boolean[][]grid,int[][]path,int n,int m,int row,int col,int steps){
        if(row>=n||col>=m||row<0||col<0||grid[row][col]==false){
            return 0;
        }
        if(row==n-1&&col==m-1){
           path[row][col]=steps;
            for(int[]arr:path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(s);
            System.out.println();
            return 1;
        }
        path[row][col]=steps;
        grid[row][col]=false;
        int a=print(s+"D",grid,path,n,m,row+1,col,steps+1);
        int b= print(s+"R",grid,path,n,m,row,col+1,steps+1);
        int c=print(s+"D",grid,path,n,m,row,col-1,steps+1);
        int d= print(s+"U",grid,path,n,m,row-1,col,steps+1);
        path[row][col]=0;
        grid[row][col]=true;
       return a+b+c+d;
    }
}
