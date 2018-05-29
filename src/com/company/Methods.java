package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Methods {
        public static void menu() {
            Scanner scanner = new Scanner(System.in);
            Scanner scr = new Scanner(System.in);
            System.out.println("Tasks were made by Ksenia Volodko");
            String answer;
            do {
                System.out.println("What task would you like to check?");
                int i = scanner.nextInt();
                switch (i) {
                    case 1:task1(); break;
                    case 2: break;
                    case 3: break;
                    case 4: break;
                    case 5:break;
                    case 6: break;
                    case 7: break;
                    case 8: break;
                    case 9: break;
                    case 10: break;
                    default:
                        System.out.println("Are you sure that task exist?");
                }
                System.out.println("Would you like to check anything else?");
                answer = scr.nextLine();
            }while(answer.equalsIgnoreCase("YES") || answer.equalsIgnoreCase("ДА"));
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
