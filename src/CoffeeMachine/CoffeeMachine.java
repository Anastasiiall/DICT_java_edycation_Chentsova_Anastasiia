package CoffeeMachine;

import java.util.Objects;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args){

        Coffee coffee = new Coffee();

        while (true) {
            System.out.print("Write action (buy, fill, take, remaining, exit): ");
            Scanner scanner = new Scanner(System.in);
            String choice = scanner.next();

            if (Objects.equals(choice, "buy")) {
                System.out.print("What do you want to buy? 1-espresso. 2-latte, 3-cappuccino, back - to main menu: ");
                Scanner scanner1 = new Scanner(System.in);
                String choice1 = scanner1.next();

                if (Objects.equals(choice1, "back")) {
                    continue;
                }

                if (Objects.equals(choice1, "1")) {
                    coffee.espresso();
                }

                if (Objects.equals(choice1, "2")) {
                    coffee.latte();
                }

                if (Objects.equals(choice1, "3")) {
                    coffee.cappuccino();
                }

            }

            if (Objects.equals(choice, "fill")) {
                coffee.fill();
            }

            if (Objects.equals(choice, "take")) {
                coffee.take();
            }

            if (Objects.equals(choice, "remaining")) {
                coffee.remaining();
            }

            if (Objects.equals(choice, "exit")){
                break;
            }

        }

    }
}
