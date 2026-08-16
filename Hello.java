public class Hello
{

     public static void main(String[] args){

          int[] age = {22,34,45,12,12,34};
          int sum = 0;
          int average;
          for (int i = 0; i < age.length; i++){
                sum += age[i];
          }
          average = sum/2;

          System.out.println(sum);
          System.out.println(average);

     }
}