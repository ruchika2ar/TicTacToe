package com.ruchika.tictactoe2;

import static java.lang.Math.abs;

/**
 * Created by ruchika on 19-02-2018.
 */

public class IsWinningMove {
    public static boolean isWinningMove(int[][] arr, int x, int y, boolean isComputer) {
        int val = 1;
        if (isComputer) val = 0;
        if (arr[0][y] == val && arr[1][y] == val && arr[2][y] == val) return true;
        if (arr[x][0] == val && arr[x][1] == val && arr[x][2] == val) return true;
        if ((x - y) == 0 || x - y == 2 || x - y == -2) {
            if (x == y) {
                if (arr[0][0] == val && arr[1][1] == val && arr[2][2] == val) return true;
            }
            if ((x - y) == 2 || (x == 1 && y == 1) || x - y == -2) {
                if (arr[0][2] == val && arr[1][1] == val && arr[2][0] == val) return true;
            }
        }
        return false;
    }
}
