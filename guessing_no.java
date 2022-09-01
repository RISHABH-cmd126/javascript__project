package com.company;
import java.util.Scanner;
import java.util.Random;
class Game {
    public int userGuess;
    public int computerGuess;
        Game() {
        Random rn = new Random();
        int a = rn.nextInt(5);
        computerGuess = a;
    }
        public int userdata () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Your choice");
        int b = sc.nextInt();
        userGuess = b;
        return userGuess;
    }
        public int correctName () {

        if (userGuess == computerGuess) {
            System.out.println("you guessed no " + userGuess );
        } else if (userGuess < computerGuess) {
            System.out.println("you choosed smaller no " + userGuess + "<" + computerGuess);
        } else if (userGuess > computerGuess) {
            System.out.println("you choosed higher no " + userGuess + ">" + computerGuess);
        }
        return 0;
    }

}
public class guessing_no {
    public static void main(String[] args) {
      //  int count = 0;
        int c;
        int d;
        int count=0;
        do {
            Game obj = new Game();
            obj.userdata();
            obj.correctName();
             c= obj.userGuess;
             d=obj.computerGuess;
            count++;
          //   count++;
        }while(c!=d);
        System.out.println("Have taken total no of chances is "+count);
    }
}
