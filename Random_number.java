package com.company;
import java.util.Random;
import java.util.Scanner;

public class Random_number {
    public static void main(String[] args) {
        System.out.println("Enter 0 for choosing Rock ");
        System.out.println("Enter 1 for choosing Scissor ");
        System.out.println("Enter 2 for choosing Paper ");
        Scanner sc=new Scanner(System.in);
        Random ra=new Random();
        for(int i=0;i<5;i++){
            System.out.println("Enter your choice");
            int a=sc.nextInt();
            int b=ra.nextInt(3);
            if(a==0&&b==1){
                System.out.println("Computer choosed "+b);
                System.out.println("you won as Rock beat Scissor");
            }
            else if(a==0&&b==2){
                System.out.println("Computer choosed "+b);
                System.out.println("computer wins as Paper beated Rock");
            }
            else if(a==1&&b==0){
                System.out.println("Computer choosed "+b);
                System.out.println("computer wins as Rock beated Scisssor");
            }
            else if(a==1&&b==2){
                System.out.println("Computer choosed "+b);
                System.out.println("you won as Scissor beated Paper");
            }
            else if(a==2&&b==0){
                System.out.println("Computer choosed "+b);
                System.out.println("you won as Paper beat Rock");
            }
            else if(a==2&&b==1){
                System.out.println("Computer choosed "+b);
                System.out.println("computer wins as Scissor beated Paper");
            }
            else if(a==b){
                System.out.println("Computer choosed "+b);
                System.out.println("Tie");
            }
            else {
                System.out.println("You haven't choosed from the given option");
            }
            System.out.println("\n");
        }
    }
}
