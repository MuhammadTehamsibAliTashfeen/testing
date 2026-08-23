/*
Create a Java program that:
Stores your name in a String.
Stores your age in an int.
Prints both.
Determines whether the person is an adult.
Prints numbers from 1 through 10.
Prints only the even numbers from 1 through 20
 */

public class Hello{

    public static void main(String[] args){

        String name = "Muhammad Tehmasib";
        int age = 28;

        System.out.println("Name is: "+ name);
        System.out.println("Age is: "+age);

        if (age <= 18) {
            System.out.println("You are not a adult");
        }
        else {
            System.out.println("You are a adult");
        }

        for (int i = 1; i < 11; i++){
            System.out.println(i);
        }

        for (int i = 1; i < 11; i++){
            if ( i % 2 == 0)
                System.out.println(i);
        }



    }

}