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
                    if (coffee.waters >= 250 && coffee.milks >= 0 && coffee.beans >= 16 && coffee.cups >= 1) {
                        System.out.println("I have enough resources, making you a coffee!");
                        coffee.moneys = coffee.moneys + coffee.moneyEspresso;
                    }
                    if (coffee.waters < 250){
                        System.out.println("Sorry, not enough water!");
                    } else {
                        coffee.waters = coffee.waters - coffee.waterEspresso;
                    }
                    if (coffee.beans < 16) {
                        System.out.println("Sorry, not enough coffee beans!");
                    } else{
                        coffee.beans = coffee.beans - coffee.beanEspresso;
                    }
                    if (coffee.cups < 1) {
                        System.out.println("Sorry, not enough cups!");
                    }else {
                        coffee.cups = coffee.cups - coffee.cupEspresso;
                    }
                }

                if (Objects.equals(choice1, "2")) {
                    if (coffee.waters >= 350 && coffee.milks >= 75 && coffee.beans >= 20 && coffee.cups >= 1){
                        System.out.println("I have enough resources, making you a coffee!");
                        coffee.moneys = coffee.moneys + coffee.moneyLatte;
                    }
                    if (coffee.waters < 350){
                        System.out.println("Sorry, not enough water!");
                    } else {
                        coffee.waters = coffee.waters - coffee.waterLatte;
                    }
                    if (coffee.milks < 75) {
                        System.out.println("Sorry, not enough milk!");
                    } else {
                        coffee.milks = coffee.milks - coffee.milkLatte;
                    }
                    if (coffee.beans < 20) {
                        System.out.println("Sorry, not enough coffee beans!");
                    } else{
                        coffee.beans = coffee.beans - coffee.beanLatte;
                    }
                    if (coffee.cups < 1) {
                        System.out.println("Sorry, not enough cups!");
                    }else {
                        coffee.cups = coffee.cups - coffee.cupLatte;
                    }
                }

                if (Objects.equals(choice1, "3")) {
                    if (coffee.waters >= 200 && coffee.milks >= 100 && coffee.beans >= 12 && coffee.cups >= 1){
                        System.out.println("I have enough resources, making you a coffee!");
                        coffee.moneys = coffee.moneys + coffee.moneyCappuccino;
                    }
                    if (coffee.waters < 200){
                        System.out.println("Sorry, not enough water!");
                    } else {
                        coffee.waters = coffee.waters - coffee.waterCappuccino;
                    }
                    if (coffee.milks < 100) {
                        System.out.println("Sorry, not enough milk!");
                    } else {
                        coffee.milks = coffee.milks - coffee.milkCappuccino;
                    }
                    if (coffee.beans < 12) {
                        System.out.println("Sorry, not enough coffee beans!");
                    } else{
                        coffee.beans = coffee.beans - coffee.beanCappuccino;
                    }
                    if (coffee.cups < 1) {
                        System.out.println("Sorry, not enough cups!");
                    }else {
                        coffee.cups = coffee.cups - coffee.cupCappuccino;
                    }
                }

            }

            if (Objects.equals(choice, "fill")) {
                System.out.print("Write how many ml of water you want to add: ");
                Scanner scanner11 = new Scanner(System.in);
                Integer waterAdd = Integer.valueOf(scanner11.next());
                System.out.print("Write how many ml of milk you want to add: ");
                Scanner scanner12 = new Scanner(System.in);
                Integer milkAdd = Integer.valueOf(scanner12.next());
                System.out.print("Write how many grams of coffee beans you want to add: ");
                Scanner scanner13 = new Scanner(System.in);
                Integer beanAdd = Integer.valueOf(scanner13.next());
                System.out.print("Write how many disposable coffee cups you want to add: ");
                Scanner scanner14 = new Scanner(System.in);
                Integer cupAdd = Integer.valueOf(scanner14.next());

                coffee.waters = coffee.waters + waterAdd;
                coffee.milks = coffee.milks + milkAdd;
                coffee.beans = coffee.beans + beanAdd;
                coffee.cups = coffee.cups + cupAdd;
            }

            if (Objects.equals(choice, "take")) {
                System.out.println("I gave you " + coffee.moneys);
                coffee.moneys = 0;
            }

            if (Objects.equals(choice, "remaining")) {
                System.out.println("The coffee machine has: ");
                System.out.println(coffee.waters + " of water");
                System.out.println(coffee.milks + " of milk");
                System.out.println(coffee.beans + " of coffee beans");
                System.out.println(coffee.cups + " of disposable cups");
                System.out.println(coffee.moneys + " of money");
            }

            if (Objects.equals(choice, "exit")){
                break;
            }

        }

    }
}
