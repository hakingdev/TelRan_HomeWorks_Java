import java.util.Scanner;

public class Additional_Tasks5_13_10_2023 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        String trianlge = "";
        trianlge = (a == b) && (b == c) && (c == a) ? "равносторонний" :
                (a == b || b == c || c == a) ? "равнобедренный" :
                        "разносторонний";
        System.out.println(trianlge);
        pointSystem();
        moneyConvertetion();
    }

    public static void pointSystem() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a >= 80) {
            System.out.println("A");
        } else if (a <= 79 && a >= 60) {
            System.out.println("B");
        } else if (a >= 40) {
            System.out.println("С");
        } else if (a <= 39 && a >= 20) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }

    public static void moneyConvertetion() {
        System.out.println("Выберите валюту для конвертации: usd, cny, uah ");
        double usd, cny, uah;
        Scanner scanner = new Scanner(System.in);
        String converts = scanner.nextLine();
        System.out.println("Введите количество: ");
        float amount = scanner.nextFloat();
        switch (converts) {
            case "usd" -> {
                usd = amount * 1.05;
                System.out.println(amount + " Euro = " + usd + " Dollars ");
            }
            case "cny" -> {
                cny = amount * 7.64;
                System.out.println(amount + " Euro = " + cny + " Youan ");
            }
            case "uah" -> {
                uah = amount * 7.64;
                System.out.println(amount + " Euro = " + uah + " Gryven ");
            }
            default -> System.out.println("Error");
        }
    }
}


