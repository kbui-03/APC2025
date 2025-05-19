package Homework6;

public class MatrixMultMain {
    public static void main(String[] args) {
        int[][] matrix1 = {{1, 2}, {3, 4}};
        int[][] matrix2 = {{5, 6}, {7, 8}};

        int rows = matrix1.length;
        int cols = matrix1[0].length; 

        int [][] result = new int [rows][cols]; 

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                DotProductThread thread = new DotProductThread(matrix1[i][0], matrix2[0][j]);
                thread.start();
                try {
                    thread.join();
                    result[i][j] = thread.getDot();
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }

        System.out.println("Reuslts");
        for (int i = 0; i <rows; i++){
            for (int j = 0; j < cols; j++){
                System.out.println(result[i][j] + "");
            }
        System.out.println();
        }
    }
}
