package com.Gentech.Return.Method;
public class Array4 {

    private static int[][] originalMatrix = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };

   static int[][] transposedMatrix;

    static {
        
        transposedMatrix = new int[originalMatrix[0].length][originalMatrix.length];

    
        for (int i = 0; i < originalMatrix.length; i++) {
            for (int j = 0; j < originalMatrix[0].length; j++) {
                transposedMatrix[j][i] = originalMatrix[i][j];
            }
        }
    }


    public static int[][] getTransposedMatrix() {
        return transposedMatrix;
    }

    public static void main(String[] args) {
       
        int[][] result =Array4.getTransposedMatrix();


        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}



