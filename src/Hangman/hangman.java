package Hangman;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.Random;

public class hangman {
    public static void main(String[] args) throws IOException {
        System.out.println("HANGMAN");
        List<String> list = new ArrayList<>();
        list.add("python");
        list.add("java");
        list.add("javascript");
        list.add("kotlin");

        Random randomizer = new Random();
        String randomListElement = list.get(randomizer.nextInt(list.size()));
        int randomWordLength = randomListElement.length();

        int attempts = 8;
        int a = 0;
        String c = "-";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String currWord;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Scanner letter = new Scanner(System.in);

        System.out.print("Input a letter  ");

        while (a != randomWordLength) {
            a++;
            System.out.print(c);
        }
        System.out.print(": ");


        char letters;
        do {
            letters = (reader.readLine().toLowerCase().charAt(0));
            alphabet = alphabet.replace(letters, '*');
            currWord = randomListElement;

            for (char ch : alphabet.toCharArray()) {
                currWord = currWord.replace(ch, '-');
                currWord = currWord.replace(Character.toUpperCase(ch), '-');
            }

            System.out.println(currWord);

        if (attempts > 0){
            if (randomListElement.contains(String.valueOf(letters))) {
            } else if (currWord.contains(alphabet)) {
                attempts--;
                System.out.println("No improvements");
                System.out.println(attempts);
            }else {
                attempts--;
                System.out.println("That letter doesn't appear in the word");
                System.out.println(attempts);
            }
        }else {
                break;
            }

        } while (currWord.contains("-"));
        reader.close();
        if (attempts >= 1){
            System.out.println("You guessed the word!");
            System.out.println("You survived!");
        } else if (attempts == 0 && currWord.length()== randomWordLength) {
            System.out.println("You guessed the word!");
            System.out.println("You survived!");
        } else {
            System.out.println("You lost!");
        }
    }
}



