//Writen and maintained by Ali

public class Hello {

   public static void printCharacters(String text) {

    // Write your code here
    for (int i = 0; i < text.length(); i++) {
        System.out.println(text.charAt(i));
    }
}




    public static void main(String[] args) {

    printCharacters("JAVA");



    }

}