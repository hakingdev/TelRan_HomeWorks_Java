import student.Game;
import student.WeddingYear;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Homework6_17_10_2023 {
    public static void main(String[] args) {

        //task 1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сколько лет вы в браке: ");
        int year = scanner.nextInt();
        WeddingYear yearsWedding = switch (year) {
            case 1 ->  WeddingYear.СИТЦЕВАЯ;
            case 2 -> WeddingYear.БУМАЖНАЯ;
            case 3 -> WeddingYear.КОЖАНАЯ;
            case 4 -> WeddingYear.ЛЬНЯНАЯ;
            case 5 -> WeddingYear.ДЕРЕВЯННАЯ;
            case 6 -> WeddingYear.ЧУГУННАЯ;
            case 7 -> WeddingYear.МЕДНАЯ;
            case 8 -> WeddingYear.ЖЕСТЯНАЯ;
            case 9 -> WeddingYear.ФАЯНСОВАЯ;
            case 10 -> WeddingYear.ОЛОВЯННАЯ;
            case 11 -> WeddingYear.БУМАЖНАЯ;
            default -> throw new RuntimeException("Не знаю такой :)");
        };
        System.out.println(yearsWedding);
        game();
    }

    //task 2
    public static void game() {
        Scanner scanner = new Scanner(System.in);
        Random rnd = new Random();
        System.out.println("Введите, что выбираете: \"Камень\", \"Ножницы\" или \"Бумага\" ");
        String choiсe = scanner.nextLine();
        Game noDefault = Game.valueOf(choiсe.toUpperCase());
        Game userChoice = switch (noDefault) {
            case КАМЕНЬ -> Game.КАМЕНЬ;
            case НОЖНИЦЫ -> Game.НОЖНИЦЫ;
            case БУМАГА -> Game.БУМАГА;
        };
        System.out.println("Твой выбор " + userChoice);
        System.out.println("Теперь бросает выбор компьютер");
        int program = rnd.nextInt(Game.values().length);
        Game progChoice = Game.values()[program];
        System.out.println("Компьютер выбрал " + progChoice);
        if (userChoice.equals(progChoice)) {
            System.out.println("Ничья");
        } else if (userChoice == Game.НОЖНИЦЫ && progChoice == Game.БУМАГА
                || userChoice == Game.КАМЕНЬ && progChoice == Game.НОЖНИЦЫ
                || userChoice == Game.БУМАГА && progChoice == Game.КАМЕНЬ) {
            System.out.println("Вы победили");

        } else {
            System.out.println("Компьютер победил");
        }
    }
}
