package Hangman;
import java.util.Objects;
import java.util.Scanner;

public class hangman {
    public static void main(String[] args) {
//        String words = "python";
        System.out.println("HANGMAN");


        Scanner word = new Scanner(System.in);
        String YourWord;
        System.out.println("Guess the word:");
        YourWord = word.nextLine();
        if (Objects.equals(YourWord, "python")){
            System.out.println("You survived!");
        }else{
            System.out.println("You lost!");
        }


    }
}

