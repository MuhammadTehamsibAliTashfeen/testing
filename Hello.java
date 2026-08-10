import java.util.Locale;

public class Hello {

    public static void main(String[] args) {

        int age = 21;
        boolean citizen = false;

        if (age >= 21){
            System.out.println("Your AGE is eligible for vote");
                if (citizen == true){
                    System.out.println("You are lawful citizen to vote");
                }
                else {
                    System.out.println("You are not lawful citizen to vote");
                }

        } else {
            System.out.println("Please go to help desk");
        }







    }
}