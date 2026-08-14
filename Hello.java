

 class Caluculator{

     public int add(int n1, int n2) {
        int sum = n1 + n2;
        return sum;
    }
}

public class Hello {

    public static void main(String[] args) {


        Caluculator cal = new Caluculator();

        int result = cal.add(3,5);

        System.out.println(result);

    }
}