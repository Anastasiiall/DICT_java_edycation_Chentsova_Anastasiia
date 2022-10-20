package ChatBot;
import java.util.Scanner;

public class ChatBot {
    public static void main(String[] arg){
        String BotName = "Robert";
        int BirthYear = 2022;
        System.out.println("Hello! My name is " + BotName);
        System.out.println("I was created in " + BirthYear);

        Scanner name = new Scanner(System.in);
        String YourName;

        System.out.println("Please, remind me your name.");
        YourName = name.nextLine();

        System.out.println("What a great name you have, " + YourName + "!");


    }
}
