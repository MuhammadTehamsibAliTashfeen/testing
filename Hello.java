//Writen and maintained by Ali

public class Hello {

    public static int sumMatrix(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                 sum +=matrix[i][j];

            }
        }
        return sum;
    }



    public static void main(String[] args) {

        int[][] matrix = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };

        System.out.println(sumMatrix(matrix));
    }
}