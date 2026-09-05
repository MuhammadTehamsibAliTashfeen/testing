public class Hello {

    public static void main(String[] args) {
        int[] numbers = {10, 25, 7, 42, 15, 8};

        printArray(numbers);
        System.out.println(calculateSum(numbers));
        System.out.println(findMaximum(numbers));
        System.out.println(countEven(numbers));
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
        int larger = 0;
        for (int i =0; i < numbers.length;i++){
            if (numbers[i] > numbers[i+1]){
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


}
