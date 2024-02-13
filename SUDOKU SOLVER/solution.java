import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();       
        int[][] Grid = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                Grid[i][j] = sc.nextInt();
            }
        }
        if (solve(Grid, N)) {
            display(Grid, N);
        } 
    }
    public static boolean solve(int[][] grid, int N) {
        int row, col;
        int[] emptyCell = findEmptyCell(grid, N);
        row = emptyCell[0];
        col = emptyCell[1];
        if (row == -1 && col == -1) {
            return true;
        }
        for (int num = 1; num <= 9; num++) {
            if (isSafe(grid, row, col, num, N)) {
                grid[row][col] = num;
                if (solve(grid, N)) {
                    return true; 
                }
                grid[row][col] = 0;
            }
        }
        return false;
    }
    public static int[] findEmptyCell(int[][] grid, int N) {
        int[] emptyCell = {-1, -1};
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (grid[i][j] == 0) {
                    emptyCell[0] = i;
                    emptyCell[1] = j;
                    return emptyCell;
                }
            }
        }

        return emptyCell;
    }
    public static boolean isSafe(int[][] grid, int row, int col, int num, int N) {
        for (int x = 0; x < N; x++) {
            if (grid[row][x] == num || grid[x][col] == num) {
                return false;
            }
        }
        int startRow = row - row % 3;
        int startCol = col - col % 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (grid[startRow + i][startCol + j] == num) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void display(int[][] grid, int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}
