public class Hello{

    public static void main(String[] args){
        sayHello("Muhammad",14);
        sayHello("Ali",33);
        sayHello("Aimen",21);

    }

    public static void sayHello(String name, int age){
        System.out.println("Hello! " + name);
        System.out.println("I am "+age+" years old.");
    }
}