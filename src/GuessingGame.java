import java.util.Scanner;
public class GuessingGame {
    public static void main(String[] args) {
        System.out.println("Welcome to the greatest guessing game of all timmmmeee!!! \nI have thought of a number, and it is YOUR job to guess it correctly.");
        System.out.println("You have three attempts, so be careful with your answers! Let's begin!");


        byte secret = 5;
        Scanner reader = new Scanner(System.in);
        int number = reader.nextInt();


        if (secret == number) {


            System.out.println("Good job! I guess you're a medium or something...");
            System.exit(0);


        }


        else if (secret > number) {


            System.out.println("Nope! Guess higher! Two more attempts remaining!");


        }


        else {


            System.out.println("Nope! Guess lower! Two more attempts remaining!");


        }


        number = reader.nextInt();


        if (secret == number) {


            System.out.println("Nice guess! And second try. Coolio.");
            System.exit(0);


        }


        else if (secret > number) {


            System.out.println("Nope! Guess higher! One more attempt remaining!");


        }


        else {


            System.out.println("Nope! Guess lower! One more attempt remaining!");


        }




        number = reader.nextInt();


        if (secret == number) {


            System.out.println("Correct on the last try! Not TOO bad, I guess...");
            System.exit(0);


        }


        else if (secret > number) {


            System.out.println("Ouchhh... You're bad at this... You lose!");


        }


        else {


            System.out.println("Nope! You snooze! Kinda embarrassing, not gonna lie");


        }


    }
}
