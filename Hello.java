//Writen and maintained by Ali

public class Hello {

    public static int findMaximum(int[] number) {
        int maxNum = number[0];
        for (int i = 0; i < number.length; i++) {
            if (number[i] > maxNum) {
                maxNum = number[i];
            }
        }
        return maxNum;
    }

    public static int countEven(int[] numbers){
            int count = 0;

            for(int i = 0; i < numbers.length; i++){
            if(numbers[i] % 2 == 0){
                count++;
            }
            }
        return count;
        }

        public static boolean contains(int[] numbers, int n){
        boolean a = false;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == n){
               a = true;
            }
        }
        return a;
    }

        public static void main(String[] args) {


        int[] numbers = {14, 7, 22, 5, 18, 9};



        System.out.println(findMaximum(numbers));   // should return 22

            System.out.println(countEven(numbers));     // should return 3

            System.out.println(contains(numbers, 5));  // should return true





    }
}