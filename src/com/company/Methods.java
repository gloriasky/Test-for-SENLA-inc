package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Methods {
        public static void menu(){
            System.out.println("Tasks were made by Ksenia Volodko" +
                    "\nWhat task would you like to check?");
            Scanner scanner = new Scanner(System.in);
            int i = scanner.nextInt();
            switch(i){
                case 1: task1();
            }
        }
        private static void task1(){
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter your number: ");
                int i = scanner.nextInt();
                boolean checkForPrime = true;
                boolean checkForEven = false;
                int a = 1;
                for (int k = 2; k<=i/2;k++){
                    if(i%k == 0 ) {
                        a++;
                        if (k == 2) {
                            checkForEven = true;
                        }
                    }
                    if(a>1&&i!=2){
                        checkForPrime = false;
                    }
                }

                if(i==2) {
                    System.out.println(i + " is  prime and even");
                }
                else if(checkForPrime&&!checkForEven){
                    System.out.println(i + " is prime and not even");
                }
                else if(!checkForPrime && checkForEven){
                    System.out.println(i + " is not prime and even");
                }
                else if(!checkForPrime && !checkForEven){
                    System.out.println(i + " is not prime and not even");
                }
                else{
                    System.out.println(i + " is  prime and even");
                }
            }catch(InputMismatchException ime){
                System.out.println("You input not integer number");
            }

        }
}
