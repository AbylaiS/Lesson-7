import com.sun.source.tree.BreakTree;

import javax.crypto.spec.PSource;
import javax.print.attribute.standard.PresentationDirection;
import javax.swing.plaf.IconUIResource;
import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import javax.xml.namespace.QName;
import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Calendar;
import java.util.SortedMap;

public class Main {
    /*
    static void printHelloWorld() {
        System.out.println("Hello world");
    }

    static void printHelloPerson(String name, int age) {
        System.out.println("Hello," + name + ", " + age + " years old");
    }

    static String getHelloWorld() {
        return "Hello world";
    }

    static int getSumOfTwoNumbwers(int x, int y) {
        return x + y;
    }

    static void checkAge(int age) {
        if (age < 21)
            System.out.println("Доступ запрещён!");
        else
            System.out.println("Доступ разрешён!");
    }
    */
    //Домашнее задание
    //№1
    public static int findTheSmallestNumber(int a, int b, int c) {
        if (a < b && a < c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else {
            return c;
        }
    }
    //№2
    public static int findTheSecondNumber(int a, int b, int c) {
        if (a > b && a < c) {
            return a;
        } else if (b > a && b < c) {
            return b;
        } else {
            return c;
        }
    }
    //№3
    public static int getCount(String str) {
        int vowelsCount = 0;
        String vowelsAsString = "aeiou";
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            String currentCharAsString = String.valueOf(currentChar);
            if (vowelsAsString.contains(currentCharAsString)) {
                vowelsCount++;
            }
        }
        return vowelsCount;
    }
    //№4
    public static int countWords(String str) {
        if (str == null || str.isEmpty())
            return 0;
        int count = 0;
        for (int e = 0; e < str.length(); e++) {
            if (str.charAt(e) != ' ') {
                count++;
                while (str.charAt(e) != ' ' && e < str.length() - 1) {
                    e++;
                }
            }
        }
        return count;
    }
    //№5
/* Не смог выполнить это задание
 Пытался 2 способами
    public static int getCountingTheNumberDigits(String str) {
        int myNumber[] = {1, 2, 5, 4, 2, 1, 2,};
        for (int i = 2; i >= myNumber.length; i++) {
            System.out.println(i);
        }
        return getCountingTheNumberDigits(str);
    }

    public static void printSubArray(int[] originalArray, int n) {
        int[] resultArray = new int[2];
        int count = 0;
        for (int i = n; i <= n; i++) {
            resultArray[count] = originalArray[i];
            count++;
        }
        Arrays.stream(resultArray).forEach(System.out::println);
    }
*/
    //№5
    public static boolean isVowel(String x) {

        String y = x.toLowerCase();
        if (y.equals("a"))
            return true;
        else if (y.equals("e"))
            return true;
        else if (y.equals("i"))
            return true;
        else if (y.equals("o"))
            return true;
        else if (y.equals("u"))
            return true;
        else
            return true;

    }

    //№6
    public static double pentagon_area(double n, int s) {
        return (n * s * s) / (4 * Math.tan(Math.PI / n));
    }
    //№7
    public static int sumDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
/*
        checkAge(18);

        int sum = getSumOfTwoNumbwers(15, 12);
        System.out.println(sum);

       printHelloWorld();
       printHelloPerson("Anna",20);
       printHelloPerson("Azamat",30);
       printHelloPerson("Maria",25);

        System.out.println(getHelloWorld());

        String strHelloWorld = getHelloWorld();

        System.out.println(strHelloWorld);
*/

        System.out.println(findTheSmallestNumber(25, 37, 29));

        System.out.println(findTheSecondNumber(25, 45, 65));

        String DarTech123 = "Dartech123";

        System.out.println(getCount(DarTech123));

        String words = "Java is good to learn Object Oriented programming";

        System.out.println(countWords(words));

        System.out.println(sumDigits(252));

        System.out.println("Площадь пятиугольника равна " + pentagon_area(5, 6));

        System.out.println(isVowel("AIEEE"));

    }
}