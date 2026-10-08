//Writen and maintained by Ali

public class Hello {

    public static void reverseArray(int[] numbers){
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {

            // swap numbers[left] and numbers[right]
            int temp = numbers[left];
            numbers[left] = numbers[right];
            numbers[right] = temp;
            left++;
            right--;
        }
    }


    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        reverseArray(numbers);

        for (int num : numbers) {
            System.out.println(num);
        }
    }


    }
