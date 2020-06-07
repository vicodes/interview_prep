package com.mediumcommon;

public class CheckPathExists {

    static  boolean isValidCoordinates(int[][] mat, int x ,int y){
        if (x >= 0 && x < mat.length && y >= 0 && y < mat.length)
            return true;
        return false;
    }

    static boolean checkPathUtil(int[][] mat, int i, int j){
        if(isValidCoordinates(mat,i,j) && mat[i][j] == 2)
            return true;
        if(isValidCoordinates(mat,i,j) && mat[i][j] == 0)
            return false;
        if(isValidCoordinates(mat,i,j) && mat[i][j] != -1){
            mat[i][j] = -1;
            return checkPathUtil(mat,i+1,j) || checkPathUtil(mat,i-1,j) || checkPathUtil(mat,i,j+1) || checkPathUtil(mat,i,j-1);
        }
        return false;
    }

    static void checkPath(int[][] mat){
        for(int i = 0; i<mat.length;i++){
            for(int j=0; j<mat[0].length;j++){
                if(mat[i][j] == 1){
                    System.out.println(checkPathUtil(mat,i,j));
                }
            }
        }
    }

    public static void main(String[] args) {
        int [][] mat = new int [][]{{0,0,0,0},{0,0,0,0},{0,0,0,0},{1,3,3,2}};
        checkPath(mat);
    }
}
