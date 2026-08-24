public class Hello {

    public static void main(String[] args) {
        System.out.println(reverseNumber(12345));

    }


    public static int reverseNumber(int n) {
        int reverse = 0;
        while (n > 0) {
            reverse = n % 10 + reverse * 10;
            n = n / 10;
        }
        return  reverse;
    }
}