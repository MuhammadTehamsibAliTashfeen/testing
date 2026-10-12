//Writen and maintained by Ali

public class Hello {


    public static int countCharacter(String text, char target) {
   
        int count = 0;
        text = text.toLowerCase();
        target = Character.toLowerCase(target);

        // Your code here
        for (int i = 0; i < text.length(); i++){
            if (text.charAt(i) == target){
                count++;
            }
        }

        return count;
    }
   


    public static void main(String[] args) {
        System.out.println(countCharacter("Hello, World!", 'l'));
        System.out.println(countCharacter("Hello, World!", 'o'));
    }

}