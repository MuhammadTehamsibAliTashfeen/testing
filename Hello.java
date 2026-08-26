/*
Arrays
├── Creating arrays
├── Indexing
├── Reading elements
├── Modifying elements
├── Array length
├── for loops + arrays
├── for-each loops
├── Passing arrays to methods
├── Searching arrays
├── Finding min/max
├── Summing arrays
├── Reversing arrays
├── Copying arrays
└── Multidimensional arrays
 */



public class Hello {

    public static void main(String[] args) {
        System.out.println(reverseNumber(12345));
        ystem.out.println(isPalindrome(12345));

    }


    public static int reverseNumber(int n) {
        int reverse = 0;
        while (n > 0) {
            reverse = n % 10 + reverse * 10;
            n = n / 10;
        }
        return  reverse;
    }

    public static boolean isPalindrome(int n){
        int original = n;
        int result = reverseNumber(n);
        if(original == result){
            return true;
        } else {
            return false;
        }
    }
}
