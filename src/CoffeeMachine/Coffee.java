package CoffeeMachine;

import java.util.Objects;
import java.util.Scanner;

public class Coffee {
    public int waters = 400;
    public int milks = 540;
    public int beans = 120;
    public int cups = 9;
    public int moneys = 550;
    public int waterEspresso = 250;
    public int waterLatte = 350;
    public int waterCappuccino = 200;
    public int milkLatte = 75;
    public int milkCappuccino = 100;
    public int beanEspresso = 16;
    public int beanLatte = 20;
    public int beanCappuccino = 12;
    public int cupEspresso = 1;
    public int cupLatte = 1;
    public int cupCappuccino = 1;
    public int moneyEspresso = 4;
    public int moneyLatte = 7;
    public int moneyCappuccino = 6;

    public void espresso() {
        if (waters >= 250 && milks >= 0 && beans >= 16 && cups >= 1) {
            System.out.println("I have enough resources, making you a coffee!");
            moneys = moneys + moneyEspresso;
        }
        if (waters < 250){
            System.out.println("Sorry, not enough water!");
        } else {
            waters = waters - waterEspresso;
        }
        if (beans < 16) {
            System.out.println("Sorry, not enough coffee beans!");
        } else{
            beans = beans - beanEspresso;
        }
        if (cups < 1) {
            System.out.println("Sorry, not enough cups!");
        }else {
            cups = cups - cupEspresso;
        }
    }

    public void latte() {
        if (waters >= 350 && milks >= 75 && beans >= 20 && cups >= 1){
            System.out.println("I have enough resources, making you a coffee!");
            moneys = moneys + moneyLatte;
        }
        if (waters < 350){
            System.out.println("Sorry, not enough water!");
        } else {
            waters = waters - waterLatte;
        }
        if (milks < 75) {
            System.out.println("Sorry, not enough milk!");
        } else {
            milks = milks - milkLatte;
        }
        if (beans < 20) {
            System.out.println("Sorry, not enough coffee beans!");
        } else{
            beans = beans - beanLatte;
        }
        if (cups < 1) {
            System.out.println("Sorry, not enough cups!");
        }else {
            cups = cups - cupLatte;
        }
    }

    public void cappuccino() {
        if (waters >= 200 && milks >= 100 && beans >= 12 && cups >= 1){
            System.out.println("I have enough resources, making you a coffee!");
            moneys = moneys + moneyCappuccino;
        }
        if (waters < 200){
            System.out.println("Sorry, not enough water!");
        } else {
            waters = waters - waterCappuccino;
        }
        if (milks < 100) {
            System.out.println("Sorry, not enough milk!");
        } else {
            milks = milks - milkCappuccino;
        }
        if (beans < 12) {
            System.out.println("Sorry, not enough coffee beans!");
        } else{
            beans = beans - beanCappuccino;
        }
        if (cups < 1) {
            System.out.println("Sorry, not enough cups!");
        }else {
            cups = cups - cupCappuccino;
        }
    }

    public void fill() {
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

        waters = waters + waterAdd;
        milks = milks + milkAdd;
        beans = beans + beanAdd;
        cups = cups + cupAdd;
    }

    public void take() {
        System.out.println("I gave you " + moneys);
        moneys = 0;
    }

    public void remaining() {
        System.out.println("The coffee machine has: ");
        System.out.println(waters + " of water");
        System.out.println(milks + " of milk");
        System.out.println(beans + " of coffee beans");
        System.out.println(cups + " of disposable cups");
        System.out.println(moneys + " of money");
    }

}



