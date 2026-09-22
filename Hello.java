public class Hello {


    public static void main(String[] args) {

        int num[][][] = new int[3][2][5];





        for(int i = 0 ; i < num.length; i++){
            for (int j = 0 ; j < num[i].length; j++){
                for (int k = 0; k < num[i][j].length; k++)
                num[i][j][k] = (int) (Math.random() * 100);

            }
    }

    for(int[][] n : num) {
        for (int[] m : n) {
            for (int y : m) {
                System.out.print(y + " ");
            }
        }
        System.out.println();
    }






    }
}