package CoffeeMachine;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args){

        Coffee coffee = new Coffee();

        System.out.println("Write how many ml of water the coffee machine has: ");
        Scanner water = new Scanner(System.in);
        int waters = Integer.parseInt(water.next());

        System.out.println("Write how many ml of milk the coffee machine has: ");
        Scanner milk = new Scanner(System.in);
        int milks = Integer.parseInt(milk.next());

        System.out.println("Write how many grams of coffee beans the coffee machine has: ");
        Scanner bean = new Scanner(System.in);
        int beans = Integer.parseInt(bean.next());

        System.out.print("Write how many cups of coffee you will need: ");
        Scanner scanner = new Scanner(System.in);
        int cups = Integer.parseInt(scanner.next());

        if (waters >= coffee.water*cups && milks >= coffee.milk*cups && beans >= coffee.beans*cups){
            System.out.println("Yes, I can make that amount of coffee");
            int wat = (waters / coffee.water) - cups;
            int mil = (milks / coffee.milk) - cups;
            int bea = (beans / coffee.beans) - cups;
            List<Integer> list = new ArrayList<>();
            list.add(wat);
            list.add(mil);
            list.add(bea);

            int n = list.get(0);
            for (Integer i: list){
                if (i < n) n = i;
            }

            if (n == 0){
            } else if (n >= 1 ) {
                System.out.println("Yes, I can make that amount of coffee (and even " + n + " more than that)");
            }

        }else {
            int w = waters / coffee.water;
            int m = milks / coffee.milk;
            int b = beans / coffee.beans;
            List<Integer> list2 = new ArrayList<>();
            list2.add(w);
            list2.add(m);
            list2.add(b);

            int k = list2.get(0);
            for (Integer i: list2) {
                if (i < k) k = i;
            }

            System.out.println("No, I can make only " + k + " cups of coffee");
        }

    }
}
