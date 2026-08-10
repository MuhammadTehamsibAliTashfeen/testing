import java.util.Locale;

public class Hello {

    public static void main(String[] args){

        double amount = 1000.00d;

        String message = (amount > 0) ? "Outstanding Amount"
                        :(amount == 0) ? "No amount pending"
                        : "contact ali";
        System.out.println(message);
    }
}