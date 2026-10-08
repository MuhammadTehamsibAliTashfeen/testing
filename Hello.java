//Writen and maintained by Ali

public class Hello {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        int copy[] = numbers.clone();

        copy[0] = 100; 

        for(int num : numbers) {
            System.out.println(num);
        }

        for(int num : copy) {
            System.out.println(num);
        }

    }
}