public class Hello {


    public static void main(String[] args) {

        int num[][] = new int[3][];     //jagged array

        num[0] = new int[3];
        num[1] = new int[6];
        num[2] = new int[8];



        for(int i = 0 ; i < num.length; i++){
            for (int j = 0 ; j < num[i].length; j++){
                num[i][j] = (int) (Math.random() * 100);

            }
    }

    for(int n[] : num){
        for (int m : n){
            System.out.print(m+" ");
        }
    System.out.println();
    }







    }
}