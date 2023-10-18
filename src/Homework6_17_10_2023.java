import student.WeddingYear;

import java.util.Locale;
import java.util.Scanner;

public class Homework6_17_10_2023 {
    public static void main(String[] args) {
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
    }
}
