public class Hello{

    public static void main(String[] args){
    greet("Muhammad");
    int result = square(5);
    System.out.println(result);
    boolean result1 = isEven(2);
    System.out.println(result1);
    int result2 = findMaximium(4,6);
    System.out.println(result2);
    double result3 = calculateAverage(10,55,97);
    System.out.println(result3);
    }

    public static void greet(String name){
        System.out.println("Hello, "+name+"!");
    }

    public static int square(int a){
        return a * a;
    }

    public static boolean isEven(int num){
        return num % 2 == 0;
    }

    public static int findMaximium(int a, int b){
        if (a>b){
            return a;
        }
        else {
            return b;
        }
    }

    public static double calculateAverage(int a, int b, int c){
        return (a+b+c)/3.0;
    }
}