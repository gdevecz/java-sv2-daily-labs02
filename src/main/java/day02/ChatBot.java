package day02;

import java.util.Scanner;

public class ChatBot {

    public static void main(String[] args) {
        System.out.println();
        Scanner sc = new Scanner(System.in);
        String inputName = sc.nextLine();

        Terminator terminator = new Terminator("Bill", 12);

        System.out.println(terminator.greetingSomebody(inputName));
        System.out.println(terminator.greetingSomebody("Joe"));
    }
}