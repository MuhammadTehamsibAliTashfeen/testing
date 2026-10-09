//Writen and maintained by Ali

public class Hello {

    public static boolean isPalindrome(String text) {


        String reversed = "";
        boolean result = false;

        // Your code here

        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }
        if(text.equals(reversed)) {
            result = true;
        }

        return result;
    }




    public static void main(String[] args) {

        System.out.println(isPalindrome("racecar"));

    }
}