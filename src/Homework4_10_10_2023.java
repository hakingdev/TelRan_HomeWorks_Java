import java.util.Scanner;

public class Homework4_10_10_2023 {


    public static void main(String[] args) {
        //task 1
        System.out.println("Введите количество метров для конвертации: ");
        Scanner s = new Scanner(System.in); //Create a method for input
        int meter = s.nextInt(); //Create a variable for Input
        //Calculating meters to kilometers
        float convertMeterToKilometer = (float) (meter * 0.001);
        //Calculating meters to miles
        float convertMeterToMiles = (float) (meter * 0.000621);
        //Calculating meters to arshin
        float convertMeterToArshin = (float) (meter * 1.40607424071991);
        System.out.printf("%d метров = %f км%n", meter, convertMeterToKilometer);
        System.out.printf("%d метров = %f миль%n", meter, convertMeterToMiles);
        System.out.printf("%d метров = %f аршин%n", meter, convertMeterToArshin);

        cash();
        travel();
        simpleByteCode();

    }

    //task 2
    public static void cash() {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите полную стоимость покупок: ");
        double fullPrice = s.nextDouble();
        System.out.println("Введите сумму денег покупателя: ");
        double gotMoney = s.nextDouble();
        double sum = 0;
        if (gotMoney == fullPrice) {
            System.out.println("Покупатель дал без сдачи");
        } else if (gotMoney > fullPrice) {
            sum = gotMoney - fullPrice;
            int rubles = (int) sum;
            int kopeyki = (int) Math.ceil((sum - rubles) * 100);
            System.out.printf("Сдача с покупки: %d рублей и %d копеек%n", rubles, kopeyki);
        } else {
            sum = fullPrice - gotMoney;
            int rubles = (int) sum;
            int kopeyki = (int) Math.ceil((sum - rubles) * 100);
            System.out.printf("%d рубля и %d копеек должен додать покупатель%n", rubles, kopeyki);
        }
    }

    //task 3
    public static void travel() {
        boolean isGoodWeather = true;
        boolean isYearFinished = true;
        boolean hasBoughtRaincoats = true;
        boolean isJimFree = true;
        boolean hasKateComeBack = true;
        boolean isTravel = true;
        if (((isYearFinished && isGoodWeather) && (hasBoughtRaincoats ^ !isGoodWeather) && (isJimFree || !hasKateComeBack) && (isJimFree ^ !hasKateComeBack))) {
            isTravel = true;
        } else {
            isTravel = false;
        }
        System.out.println("Поход состоится: " + isTravel);
    }

    //task 4
    public static void simpleByteCode() {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число, я проверю оно четное или нет: ");
        int a = s.nextInt();
        int b = 0;
        if ((a & 1) == 0) {
            b = a >> 1;
            System.out.println(b);
        } else {
            b = a;
            System.out.printf("Число - %d является нечетным", b);
        }
    }

}
