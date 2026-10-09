//Writen and maintained by Ali

public class Hello {

    public static boolean isPalindromeFast(String text) {

        // Your code here
        int left = 0;
        int right = text.length() - 1;

        while (left < right) {

         if(text.charAt(left) != text.charAt(right)){
             return false;
         }

         left++;
         right--;

        }

        return true;
    }




    public static void main(String[] args) {

    System.out.println(isPalindromeFast("abcda"));
    }
}