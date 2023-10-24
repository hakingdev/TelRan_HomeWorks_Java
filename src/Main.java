import week.DayOfWeek;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*

        Напиши программу, которая моделирует ситуацию.
        Ты попросил(а) друзей скинуться на подарок на твой День Рождения. Каждый друг случайным образом может подарить
        тебе одну купюру номиналом 50, 100, 200 или 500 долларов. Твоя цель - новенький игровой компьютер, который стоит 10 000 долларов.
        Как только друзья подарят тебе нужную сумму (или даже чуть больше),
        останавливай сбор подарков и веди всех выпить за твоё здоровье в лучший бар города!

         */
        //task 1
        Random rnd = new Random();
        int fullAmount = 10000;
        int current = 0;
        do {
            int random = rnd.nextInt(5);
            int money = switch (random) {
                case 1 -> 50;
                case 2 -> 100;
                case 3 -> 200;
                case 4 -> 500;
                default -> 0;
            };
            current += money;
        } while (current <= fullAmount);
        int rest = 0;
        rest = current - fullAmount;
        System.out.printf("Спасибо, на подарок я собрали всю сумму %d$.%nПриглашаю всех в бар на остаток от суммы %d$, отметить!%n", current, rest);

        summNumber();
        massiveFirst();
    }

    //task 2
    public static void summNumber() {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        do {
            System.out.println("Введите число по которому будем считать сумму нечетных чисел: ");
            int number = sc.nextInt();
            for (int i = 0; i < number; i++) {
                if (i % 2 != 0) {
                    sum += i;
                }
            }
            System.out.println("Сумма всех нечетных чисел " + sum);
            System.out.println("Введите \"quit\" если хотите закончить");
            String quit = sc.nextLine();
            String quit2 = sc.nextLine();
            if (quit2.equalsIgnoreCase("quit")) {
                return;
            }
        } while (true);
    }


    public static void massiveFirst() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текущий день недели: ");
        String userInput = sc.nextLine();
        DayOfWeek[] dayOfWeek = DayOfWeek.values();
        for (DayOfWeek week:dayOfWeek) {
            if (!week.name().equals(userInput))
                System.out.println(week);
        }
    }
}

