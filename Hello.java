public class Hello
{

     public static void main(String[] args){

          String[] cars = {"BMW", "Volvo","AMG","Ford"};

          for (int i = 0; i < cars.length; i++)
          {
               System.out.println(cars[i]);
          }

          String[] trucks = new String[4];
          for (int i = 0; i < trucks.length; i++)
          {
               System.out.println(trucks[i]);
          }
          trucks[0] = "Man";
          trucks[3] = "Catapiller";
          System.out.println(trucks[2]);
          System.out.println(trucks[3]);


     }
}