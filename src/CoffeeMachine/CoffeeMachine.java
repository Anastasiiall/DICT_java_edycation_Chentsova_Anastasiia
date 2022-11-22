package CoffeeMachine;

import java.util.*;

public class CoffeeMachine {
    public static void main(String[] args){

        Coffee coffee = new Coffee();

        System.out.println("The coffee machine has: ");
        System.out.println(coffee.waters + " of water");
        System.out.println(coffee.milks + " of milk");
        System.out.println(coffee.beans + " of coffee beans");
        System.out.println(coffee.cups + " of disposable cups");
        System.out.println(coffee.moneys + " of money");

        System.out.print("Write action (buy, fill, take): ");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.next();

        if (Objects.equals(choice, "buy")){
            System.out.print("What do you want to buy? 1-espresso. 2-latte, 3-cappuccino: ");
            Scanner scanner1 = new Scanner(System.in);
            String choice1 = scanner1.next();
            if (Objects.equals(choice1, "1")){
                System.out.println("The coffee machine has: ");
                System.out.println((coffee.waters - coffee.waterEspresso) + " of water");
                System.out.println((coffee.milks - coffee.milkEspresso) + " of milk");
                System.out.println((coffee.beans - coffee.beanEspresso) + " of coffee beans");
                System.out.println((coffee.cups - coffee.cupEspresso) + " of disposable cups");
                System.out.println((coffee.moneys + coffee.moneyEspresso) + " of money");
            }
            if (Objects.equals(choice1, "2")){
                System.out.println("The coffee machine has: ");
                System.out.println((coffee.waters - coffee.waterLatte) + " of water");
                System.out.println((coffee.milks - coffee.milkLatte) + " of milk");
                System.out.println((coffee.beans - coffee.beanLatte) + " of coffee beans");
                System.out.println((coffee.cups - coffee.cupLatte) + " of disposable cups");
                System.out.println((coffee.moneys + coffee.moneyLatte) + " of money");
            }
            if (Objects.equals(choice1, "3")){
                System.out.println("The coffee machine has: ");
                System.out.println((coffee.waters - coffee.waterCappuccino) + " of water");
                System.out.println((coffee.milks - coffee.milkCappuccino) + " of milk");
                System.out.println((coffee.beans - coffee.beanCappuccino) + " of coffee beans");
                System.out.println((coffee.cups - coffee.cupCappuccino) + " of disposable cups");
                System.out.println((coffee.moneys + coffee.moneyCappuccino) + " of money");
            }
        }
        if (Objects.equals(choice, "fill")){
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

            int water = coffee.waters + waterAdd;
            int milk = coffee.milks + milkAdd;
            int beans = coffee.beans + beanAdd;
            int cups = coffee.cups + cupAdd;

            System.out.println("The coffee machine has: ");
            System.out.println(water + " of water");
            System.out.println(milk + " of milk");
            System.out.println(beans + " of coffee beans");
            System.out.println(cups + " of disposable cups");
            System.out.println(coffee.moneys + " of money");
        }
        if (Objects.equals(choice, "take")){
            System.out.println("I gave you " + coffee.moneys);
            System.out.println("The coffee machine has: ");
            System.out.println(coffee.waters + " of water");
            System.out.println(coffee.milks + " of milk");
            System.out.println(coffee.beans + " of coffee beans");
            System.out.println(coffee.cups + " of disposable cups");
            System.out.println("0 of money");
        }

        }
    }

