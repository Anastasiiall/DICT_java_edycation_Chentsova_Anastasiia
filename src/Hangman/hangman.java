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
        int randomWordLength = randomListElement.length();

        String let1 = String.valueOf(randomListElement.charAt(0));
        String let2 = String.valueOf(randomListElement.charAt(1));

        int a = 0;
        int b = randomWordLength - 2;
        String c = "-";
        Scanner word = new Scanner(System.in);
        String YourWord;
        System.out.print("Guess the word ");
        System.out.print(let1);
        System.out.print(let2);
        while (a < b){
            a++;
            System.out.print(c);
        }
        System.out.println(": ");

        YourWord = word.nextLine();
        if (Objects.equals(YourWord, randomListElement)){
            System.out.println("You survived!");
        }else{
            System.out.println("You lost!");
        }


    }
}

