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
                    case 1: task1(); break;
                    case 2: break;
                    case 3: task3(); break;
                    case 4: break;
                    case 5: break;
                    case 6: break;
                    case 7: break;
                    case 8: task8(); break;
                    case 9: task9(); break;
                    case 10: break;
                    default:
                        System.out.println("Are you sure that task exist?");
                }
                System.out.println("Would you like to check anything else?");
                answer = scr.nextLine();
            }while(answer.equalsIgnoreCase("YES") || answer.equalsIgnoreCase("ДА"));
        }
//        public static void task4(){
//            Scanner scanner = new Scanner(System.in);
//            System.out.print("Enter your sentence: "+"\n");
//            String str = scanner.nextLine();
//            String[] st = str.split("( |,)", 0);
//            for(int i = 0;i<st.length;i++){
//                System.out.println(st[i]);
//            }
//        }
        private static void task9(){
            try{
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter last number(N): "+"\n");
            int n = scanner.nextInt();
            int sum = 0;
            boolean check = false;
            for(int k = 2;k<=n;k+=2){
                System.out.print(k + " ");
                sum+=k;
                check = true;
            }
            if(check) {
                System.out.println("\nSum of evens = " + sum);
            }
            else {
                System.out.println("There are no even numbers between 0 and " + n);
            }
            }catch(InputMismatchException ime){
                System.out.println("You input not integer number");
            }
        }
        private static void task8(){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter last number(N): "+"\n");
            int n = scanner.nextInt();
            for(int i = 0; i<n;i++){
                String number = Integer.toString(i);
                if(number.length()%2==0){
                    if(palindrom(number))
                        System.out.println(number + " is a palindrom!");
                }
            }
        }
        private static void task3(){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your word: "+"\n");
            String word = scanner.nextLine();
            if(word.length()%2==0)
                if(palindrom(word))
                    System.out.println(word + " is a palindrom!");
                else
                    System.out.println(word + " is not a palindrom");
            else
                System.out.println(word + " is not a palindrom");
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
        private static boolean palindrom(String word){
            boolean isPalindrom = true;
            char[] w = word.toCharArray();
            for(int k = 0; k<word.length();k++){
                if(w[k] != w[word.length()-1-k]){
                    isPalindrom = false;
                }
            }
            return isPalindrom;
        }
}
