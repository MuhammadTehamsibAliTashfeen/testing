public class Hello
{

    static int myMethod(int x){
        return 2 * x;
    }


    public static void main(String[] args)
    {

        for (int i=0;i<=5;i++){
            System.out.println("Double of " + i + " is " + myMethod(i));
        }

    }
}