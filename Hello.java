public class Hello {

    public static void main(String[] args) {
        int[] numbers = {10, 25, 7, 42, 15, 8};

        /*printArray(numbers);
        System.out.println(calculateSum(numbers));
        System.out.println(findMaximum(numbers));
        System.out.println(countEven(numbers));
        System.out.println(calculateAverage(numbers));
        System.out.println(findMinimum(numbers));
*/

    }

    public static void printArray(int[] numbers){
        for (int nums: numbers){
            System.out.println(nums);
        }
    }

    public static int calculateSum(int[] numbers){
        int sum = 0;
        for (int i = 0; i < numbers.length; i++){
             sum +=numbers[i];

        }
        return sum;
    }

    public static int findMaximum(int[] numbers){
        int larger = numbers[0];

        for (int i =0; i < numbers.length;i++){
            if (numbers[i] > larger){
                larger = numbers[i];
            }
        }
        return larger;
    }

    public static int countEven(int[] number){
        int count = 0;
        for(int num: number){
            if(num%2==0){
                count++;

            }
        }
        return count;
    }

    public static int findMinimum(int[] numbers){
        int mini = numbers[0];
        for(int i = 0; i < numbers.length; i++){
            if (mini < numbers[i]){
                mini = mini;
            }else {
                mini = numbers[i];
            }
        }
        return mini;
    }


    public static int calculateAverage(int[] numbers){
        int average,sum = 0;
        for (int i=0; i < numbers.length; i++){
            sum += numbers[i];
        }
        average = sum / numbers.length;
        return average;
    }






}
