//Writen and maintained by Ali

public class Hello {

    
public static String swapCase(String text) {
        String result = "";

        // Your code here
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isLowerCase(c)) {
                c = Character.toUpperCase(c);
            } else if (Character.isUpperCase(c)) {
                c = Character.toLowerCase(c);
            }
            result += c;
        }

        return result;
}

   
   


    public static void main(String[] args) {

        System.out.println(swapCase("Hello, World!123erw"));
      





    }

}