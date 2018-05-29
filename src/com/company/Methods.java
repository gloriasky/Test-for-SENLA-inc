package com.company;

import java.util.*;

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
                    case 4: task4(); break;
                    case 5: task5(); break;
                    case 6: task6(); break;
                    case 7: task7(); break;
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
        private static void task7(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the length of our array: ");
            int length= scanner.nextInt();
            Random rnd = new Random();
            int[] array = new int[length];
            int min = 99;
            int max = 10;
            for(int i = 0; i<length;i++)
                array[i] = rnd.nextInt(89)+10;
            for (int i = 0; i<length;i++) {
                System.out.print(array[i] + " ");
                if(array[i]>max)
                    max = array[i];
                if(array[i]<min)
                    min = array[i];
            }
            System.out.println("\nThe largest number in the list is " + max);
            System.out.println("The lowest number in the list is " + min);
        }
        private static void task6(){
            try{
                Scanner scanner = new Scanner(System.in);
                int a,b,c;
                do {
                    System.out.println("Enter a: ");
                    a = scanner.nextInt();
                    System.out.println("Enter b: ");
                    b = scanner.nextInt();
                    System.out.println("Enter c: ");
                    c = scanner.nextInt();
                }while(a<=0 || b<=0 ||c <=0);
                if(possibilityOfSuchTriangle(a,b,c)||possibilityOfSuchTriangle(b,c,a)||possibilityOfSuchTriangle(c,a,b))
                    System.out.println("There could be such a triangle");
                else
                    System.out.println("There couldn't be such a triangle");

            }catch(InputMismatchException ime){
                System.out.println("You input not integer number");
            }
        }
        private static boolean possibilityOfSuchTriangle(int a, int b, int c){
            if (a * a + b * b == c * c)
                return true;
            else
                return false;
        }
        private static void task5(){
            Scanner scanner = new Scanner(System.in);
            Scanner scr = new Scanner(System.in);
            System.out.println("Enter your text: ");
            String text = scanner.nextLine();
            System.out.println("Enter your word: ");
            String word = scr.nextLine();
            String[] allWordsInTheText = text.split("(\\W|\\s|\\D)");
            int count = 0;
            for(int i = 0; i<allWordsInTheText.length;i++){
                if(allWordsInTheText[i].equalsIgnoreCase(word))
                    count++;
            }
            System.out.println(word + " is in the text  " + count + "  times.");
        }
        private static void task4() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your sentence: " + "\n");
            String str = scanner.nextLine();
            String[] st = str.split("(\\W)", 0);
            Map<String, Integer> ourDict = new HashMap<>();
            for(int i = 0; i<st.length;i++){
                String l = st[i].toLowerCase();
                if(!ourDict.containsKey(l) && st[i]!=null){
                    int count = 1;
                    for(int k = i+1;k<st.length;k++)
                        if(st[i].equalsIgnoreCase(st[k]))
                            count++;
                    ourDict.put(l, count);
                }
            }
            System.out.println(ourDict.keySet());
            System.out.println(ourDict.values());
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