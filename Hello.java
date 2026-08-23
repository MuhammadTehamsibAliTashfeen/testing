public class Hello{

    public static void main(String[] args){

        boolean result = isPositive(-4);
        System.out.println(result);

        boolean rr2 = isPrime(9);
        System.out.println(rr2);


        int result3 = factorial(5);
        System.out.println(result3);

        int result4 = findMinimum(3,1);
        System.out.println(result4);

        double result5 = rectangleArea(33,11);
        System.out.println(result5);

    }

    public static boolean isPositive(int num){
         return num > 0;
         }


   public static boolean isPrime(int num) {
         if (num <= 1) {
             return false;
         }
         for (int n = 2; n < num; n++){
             if ( num % n == 0){
                 return false;
             }
         }

         return true;
     }

     public static int factorial(int num){
        int r = 1;
             for (int n = 1; n <=num; n++){
                  r *= n;
             }
             return r;
        }

         public static int findMinimum(int a, int b){
             if (a < b){
                 return a;
             }else {
                 return b;
             }
        }
         public static double rectangleArea(double a, double b){
             double area = a * b;
             return area;
        }



    }
