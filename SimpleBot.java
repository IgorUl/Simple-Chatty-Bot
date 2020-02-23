package bot;

import java.util.Scanner;

public class SimpleBot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String botName = "Tcracked";
        final int birthYear = 2020;
        final String yourName;
        int age;
        int num;

        System.out.println("Hello! My name is " + botName + ".");
        System.out.println("I was created in " + birthYear + ".");
        System.out.println("Please, remind me your name.");
        yourName = sc.nextLine();
        System.out.println("What a great name you have, " + yourName + "!");
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        age = (sc.nextInt() * 70 + sc.nextInt() * 21 + sc.nextInt() * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
        System.out.println("Now I will prove to you that I can count to any number you want.");
        num = sc.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.println(i + "!");
        }
        System.out.println("Completed, have a nice day!");

    }
}
