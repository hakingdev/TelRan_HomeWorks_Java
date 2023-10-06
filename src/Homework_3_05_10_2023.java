import javax.swing.text.html.parser.Parser;
import java.util.Random;
import java.util.Scanner;

public class Homework_3_05_10_2023 {
    public static void main(String[] args) {
        //Part 1
        Random rand = new Random();
        byte byteType = (byte) rand.nextInt(101);
        short shortType = (short) rand.nextInt(234);
        int intType = rand.nextInt(1957);
        long longType = rand.nextLong();
        boolean booleanType = rand.nextBoolean();

        System.out.println(byteType);
        System.out.println(shortType);
        System.out.println(intType);
        System.out.println(longType);
        System.out.println(booleanType);

        //Part 2
        String str = "129"; //
        byte strToByte = Byte.parseByte(String.valueOf((byte) rand.nextInt(Integer.parseInt(str))));
        short strToShort = Short.parseShort(String.valueOf((short) rand.nextInt(Integer.parseInt(str))));
        int strToInt = rand.nextInt(Integer.parseInt(str));
        long strToLong = rand.nextLong(Long.parseLong(str));

        System.out.println(strToByte);
        System.out.println(strToShort);
        System.out.println(strToInt);
        System.out.println(strToLong);

        String randomName = String.valueOf((char) rand.nextInt('A', 'Z' + 1) ) + (char) rand.nextInt('A', 'Z' + 1) + (char) rand.nextInt('A', 'Z' + 1) + (char) rand.nextInt('A', 'Z' + 1) + (char) rand.nextInt('A', 'Z' + 1);

        System.out.println(randomName);

        //Task 2
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        int age = s.nextInt();
        int weight = s.nextInt();
        System.out.printf("Уважаемый, %s! В свои %d лет Вы для нас дороги, как %d килограмм золота.", name, age, weight);

        //Task 3
        int number1 = s.nextInt();
        int number2 = s.nextInt();
        int sum,  sub, mult, div;
        sum = number1 + number2;
        sub = number1 - number2;
        mult = number1 * number2;
        div = number1 / number2;
        System.out.printf("Сумма - %d " + "Разность - %d " + "Умножение - %d " + "Деление - %d", sum, sub, mult, div);
    }


}
