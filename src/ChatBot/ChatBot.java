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

        System.out.println("Let me guess your age.");
        Scanner age = new Scanner(System.in);
        int YourAge1;
        int YourAge2;
        int YourAge3;

        System.out.println("Enter remainders of diving your age by 3, 5 and 7.");
        YourAge1 = age.nextInt();
        YourAge2 = age.nextInt();
        YourAge3 = age.nextInt();

        int YourAge = (YourAge1*70 + YourAge2*21 + YourAge3*15)%105;
        System.out.println("Your age is " + YourAge + "; that's a good time to start programming!");

        System.out.println("Now I will prove to you that I can count to any number you want.");
        Scanner number = new Scanner(System.in);
        int YourNumber;

        YourNumber = number.nextInt();
        int i = 0;
        while (i <= YourNumber){
            System.out.println("" + i + "!");
            i++;
        }

        System.out.println("Let's test your programming knowledge.");

        System.out.println("What programming language was used now?");
        System.out.println("1.Python");
        System.out.println("2.C++");
        System.out.println("3.Java");
        System.out.println("4.PHP");

        Scanner ans = new Scanner(System.in);
        int Answer;
        while (true){
            Answer = ans.nextInt();
            if (Answer == 3){
                System.out.println("Great, you right!");
                break;
            }else{
                System.out.println("Please, try again.");
            }
        }
        System.out.println("Goodbye, have a nice day!");


    }
}
