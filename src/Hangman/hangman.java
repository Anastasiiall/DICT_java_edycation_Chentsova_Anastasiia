package Hangman;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.Random;


public class hangman {
    public static void main(String[] args) {
        System.out.println("HANGMAN");
        List<String>list = new ArrayList<>();
        list.add("python");
        list.add("java");
        list.add("javascript");
        list.add("kotlin");

        Random randomizer = new Random();
        String randomListElement = list.get(randomizer.nextInt(list.size()));
        

        Scanner word = new Scanner(System.in);
        String YourWord;
        System.out.println("Guess the word:");
        YourWord = word.nextLine();
        if (Objects.equals(YourWord, randomListElement)){
            System.out.println("You survived!");
        }else{
            System.out.println("You lost!");
        }


    }
}

