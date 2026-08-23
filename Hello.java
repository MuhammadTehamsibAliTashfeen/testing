public class Hello
{

     public static void main(String[] args){

          int num[][] = new int[3][4];
          int temp;

          for (int r = 0; r < 3; r++){

               for (int c = 0; c < 4; c++){
                    num[r][c] = (int) (Math.random() * 100);
                    System.out.print(num[r][c] + " ");
               }
               System.out.println();

          }




     }
}