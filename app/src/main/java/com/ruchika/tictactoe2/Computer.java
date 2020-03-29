package com.ruchika.tictactoe2;

/**
 * Created by ruchika on 19-02-2018.
 */

public class Computer {

    static int posX = -1;
    static int posY = -1;
    static int finalD;

    public static int findBoxNo(int[][] arr, int d) {
        finalD = d;
        findComputerMove(arr, d);
        if (posX == 0) {
            if (posY == 0) {
                return 1;
            } else if (posY == 1) {
                return 2;
            } else {
                return 3;
            }
        } else if (posX == 1) {
            if (posY == 0) {
                return 4;
            } else if (posY == 1) {
                return 5;
            } else {
                return 6;
            }

        } else {
            if (posY == 0) {
                return 7;
            } else if (posY == 1) {
                return 8;
            } else {
                return 9;
            }
        }
    }

    public static int findHumanMove(int[][] arr, int depth) {
        int curMax = -2;
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                if (arr[r][c] == -1) {
                    arr[r][c] = 1;
                    if (IsWinningMove.isWinningMove(arr, r, c, false)) {
                        arr[r][c] = -1;
                        return 1;
                    }
                    int maxComp = findComputerMove(arr, depth + 1);
                    if (maxComp > curMax) {
                        curMax = maxComp;
                    }
                    arr[r][c] = -1;
                    if (maxComp == 1) return 1;
                }
            }
        }
        return curMax;
    }

    public static int findComputerMove(int[][] arr, int depth) {
        if (depth == 10) return 0;
        int curMin = 2;
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                if (arr[r][c] == -1) {
                    arr[r][c] = 0;
                    if (IsWinningMove.isWinningMove(arr, r, c, true)) {
                        arr[r][c] = -1;
                        if (finalD == depth) {
                            posX = r;
                            posY = c;
                        }
                        return -1;
                    }
                    int maxHuman = findHumanMove(arr, depth + 1);
                    if (maxHuman < curMin) {
                        if (finalD == depth) {
                            posX = r;
                            posY = c;
                        }
                        curMin = maxHuman;
                    }
                    arr[r][c] = -1;
                    if (maxHuman == -1) return -1;
                }
            }
        }
        return curMin;
    }
}
