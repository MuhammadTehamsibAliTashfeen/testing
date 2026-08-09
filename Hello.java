import java.util.Locale;

public class Hello {

    public static void main(String[] args){

        int balance = 0;  //in dollars usd

        if (balance == 0) {
            System.out.println("You have no outstanding balance");
        }
        else {
            System.out.println("You have a due balance of "+balance);
        }


    }
}