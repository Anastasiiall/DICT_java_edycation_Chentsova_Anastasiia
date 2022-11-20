package CoffeeMachine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args){

        Coffee coffee = new Coffee();
        System.out.print("Write how many cups of coffee you will need: ");
        Scanner scanner = new Scanner(System.in);
        int cups = Integer.parseInt(scanner.next());
        System.out.println("For " + cups + " cups of coffee you will need:");
        System.out.println(coffee.water*cups + " ml of water");
        System.out.println(coffee.milk*cups + " ml of milk");
        System.out.println(coffee.beans*cups + " g of coffee beans");

    }
}
