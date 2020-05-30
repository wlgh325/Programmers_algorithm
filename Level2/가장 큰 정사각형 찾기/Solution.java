import java.util.*;

class Solution {
    public static void main(String[] args) {
        int[][] board = {{0,1,1,1},{1,1,1,1},{1,1,1,1},{0,0,1,0}};
        int[][] board2 = {{1,1,1,0},{1,1,0,0},{0,0,0,0},{0,0,0,0}};
        int[][] board3 = {{0,0,1,1,1},{1,0,1,1,1}};
        System.out.println(solution(board3));
        System.out.println(solution(board));
    }

    public static int solution(int [][]board) {
        int max = 0;
        boolean flag = false;
        for(int i=0; i<board[0].length; i++){
            if(board[0][i] == 1)
                flag = true;
        }

        for(int i=0; i<board.length; i++){
            if(board[i][0] == 1)
                flag = true;
        }
        // 1이 하나도 없는 경우 예외 처리
        for(int i=1; i<board.length; i++){
            for(int j=1; j<board[0].length; j++){
                if(board[i][j] == 0)
                    continue;
                board[i][j] = Math.min(board[i][j-1], Math.min(board[i-1][j], board[i-1][j-1])) + 1;
                max = board[i][j] > max ? board[i][j] : max;
                flag = true;
            }
        }
        if(!flag)
            return 0;
        if(max == 0)
            return 1;
        return max*max;
    }
}