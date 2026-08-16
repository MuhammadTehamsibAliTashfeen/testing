public class Hello
{

     public static void main(String[] args){

          int[][] homes = {{1,2,10},{4,5,6}};

          for ( int row = 0; row < homes.length; row++){
               for (int col = 0; col < homes[row].length; col++){
                    System.out.println(homes[row][col]);
               }
          }






     }
}