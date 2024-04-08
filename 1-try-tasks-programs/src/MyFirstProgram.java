
import java.util.Scanner;

public class MyFirstProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the program.");
        System.out.println("-----------------------");

        while (true) {
            System.out.println("Enter integer number which will be used as fibonacci row maximum.");

            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("q")) {
                break;
            }

            try {
                int max = Integer.parseInt(input);
                System.out.println("User entry accepted.");
                System.out.println();
                fibonacciCount(max);
                break;

            } catch (NumberFormatException e) {
                System.out.println("Invalid entry by the user.");
                continue;
            }
        }
    }

    public static void fibonacciCount(int max) {
        int a = 1;
        int b = 2;
        int c = 0;

        System.out.print(a + " ");
        System.out.print(b + " ");

        while (c < max) {
            c = a + b;
            a = b;
            b = c;

            if (c < max) {
                System.out.print(c + " ");
            }
        }
    }
}





// _____________________________________________________________
   /*
        Porovnavacie operatori
        <
        >
        <=
        >=
        ==
        !=

        String option1 = "letter A is bigger than letter B";
        String option2 = "letter B is bigger than letter A";
        String option3 = "letter A and letter B are equal";

        int a = 6;
        int b = 6;

        if (a > b) {
            System.out.println(option1);
        } else if (a < b) {
            System.out.println(option2);
        } else {
            System.out.println(option3);
        }
         */

// _____________________________________________________________

    /*
    Logicke operatory
    && (and)
    || (or)
    ! (not)

        int x = 76;

        // x je medzi 50 az 100
        if (x >= 50 && x <=100) {
            System.out.println("plati podmienka");
        } else {
            System.out.println("neplati podmienka");
        }

        // je x mensie ako 50 alebo vacsie ako 100
        if (x < 50 || x > 100) {
            System.out.println("premenna X nie je v intervale 50 az 100");
        } else {
            System.out.println("premenna x je v intervale 50 az 100");
        }

        if (!(x <= 10)) {
            System.out.println("variable x is not lower or equal to 10");
        }

        // je x parne a zaroven vacsie ako 5
        if (x % 2 == 0 && x > 5) {
            System.out.println("variable x is not odd and is bigger than 5");
        }
     */
// _____________________________________________________________

 /*
        Stringy - referencny datovy typ

        String soc = "Street of code";
        System.out.println(soc.replaceAll("e", "o"));
        System.out.println(soc.contains("Street"));
        */

        /*
        String atom = "Atom Street of 365";
        String street = "Atom or Street?";

        if (atom.contains("365") && atom.contains("code")) {
            System.out.println(atom.toUpperCase());
        } else if ((atom.contains("AtomCode") && atom.contains("365")) || (atom.contains("Street") && atom.contains("of"))) {
            System.out.println(street.toLowerCase());
        } else {
            System.out.println("neviem co uz tu mam napisat");
        }


        String random = "dsadkasjajdsiajdam,dasiudsakldosadsa";
        System.out.println(random.length());

        String hello = "Hello";
        String world = " world";
        String result = hello.concat(world);
        System.out.println(result);

        String random = "asdjasmlikamv[qodugmalichrnxmckio";
        if (random.contains("nxm")) {
            System.out.println("Random string has another string nxm inside");
        } else {
            System.out.println("Nope");
        }

      String fruit = "porodojko";
      fruit = fruit.replaceAll("o", "a");
      System.out.println(fruit);

        */


// _____________________________________________________________

/*
import java.awt.*;

public class MyFirstProgram {
    public static void main(String[] args) {
        Point point = new Point (5, 5);
        System.out.println("Point = " + point);

        point.move(10, 10);
        System.out.println(point);
 */

// _____________________________________________________________

/*
    String apple = "apple";
    String orange = "orange";
    String lemon = "lemon";

   String[] fruits = new String[3];
    fruits[0] = apple;
    fruits[1] = orange;
    fruits[2] = lemon;

    String[] fruits = {"apple", "orange", "lemon"};
    fruits[2] = "pomegranate";

        System.out.println(Arrays.toString(fruits));

    int[] num = new int[3];
    num[0] = 1;
    num[1] = 3;
    num[2] = 5;
        System.out.println(Arrays.toString(num));


        int[] numbers = new int[3];
        Arrays.fill(numbers, 10);
        numbers[2] = 5;

        System.out.println(Arrays.toString(numbers));
     */

// _____________________________________________________________

/*
String[] fruits = new String[3];
        fruits[0] = "apple";

        System.out.println(Arrays.toString(fruits));
        System.out.println(fruits[0].toUpperCase() + fruits[1]); // pozicia pola s hodnotou null nemoze pouzit nikdy metodu, je to prazdne pole

        int[] numbers = new int[3];
        numbers[0] = 5;
        numbers[2] = 33;

        System.out.println(numbers[0] + numbers[1] + numbers[2]);

        double[] myDoubles = new double[3];

        System.out.println(Arrays.toString(myDoubles));
 */
// _____________________________________________________________
/*

import java.util.Arrays;

public class Main {
   public static void main(String[] args) {
      String hello = "Hello world";
      String[] words = hello.split(" ");
      System.out.println(Arrays.toString(words));
   }
}
 */

// _____________________________________________________________

/*
public class Main {
   public static void main(String[] args) {
      int sum = 0;
      for (int i = 9; i <= 99; i++) {
         sum += i;
      }
      System.out.println(sum);
   }
}
 */

    /*
                   for (int i = 1; i <= 100; i++) {
                    if (i % 3 == 0) {
                        System.out.println(i);
                    }
                }
            }
        }

        /*
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

    }
}
*/

// _____________________________________________________________

/*
FizzBuzz uloha
Napis program, ktory vypise cisla od 1 do 100 avsak:
1. ak je cislo delitelne 3 tak namiesto cisla vypis Fizz
2. ak je cislo delitelne 5 tak namiesto cisla vypis Buzz
3. ak je cislo 3 a 5 zaroven tak napis FizzBuzz


        for (int i = 1; i <= 100; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
 */

// _____________________________________________________________
     /*
     public static int add(int first, int second) {
        // moznost dat int c = a + b; a potom do return dat iba return c
        return first + second;
    }

    - access modifier (public / private)
    - optional static (preco musi byt az v OOP)
    - return type (int)
    - Name (add)
    - optional parameters (moze ich hocikolko, ale treba s rozumom)
    - method body v {}
    - optimal return value = pre int premennu sa pouziva return

    public static void printLargerNumber(int first, int second) {
        if (first >= second) {
            System.out.println(first);
        } else {
            System.out.println(second);
        }
    }
    // void znamena, ze metoda nebude nic vracat, nebude tam ziaden return

    public static void main(String[] args) {

        int a = 5;
        int b = 15;

        printLargerNumber(a, b);

        // int c = add(a, b);
        // System.out.println(c);

        Priklad metody:
           public static int getBiggerNumber(int A, int B) {
        if (A >= B) {
            return A;
        } else {
            return B;
        }
    }
________________________________________________________________
public class Task {
    public static boolean startAllNamesWithJ(String[] names) {
        for (String name: names) {
            if (!name.startsWith("J")) {
                return false;
            }
        }
                return true;
    }
}

  */

// _____________________________________________________________

/*
import java.util.Arrays;

public class MyFirstProgram {

    public static void  change(int[] nums) {
        System.out.println(">> Adresne miesto v pamati pre premennu nums " + nums);
        nums[0] = 5;
    }

    public static void main (String[] args) {
        int[] numbers = new int[3];
        numbers[0] = 0;
        numbers[1] = 1;
        numbers[2] = 2;

        System.out.println(">> Adresne miesto v pamati pre premennu numbers " + numbers);
        System.out.println(Arrays.toString(numbers));

        change(numbers); // zavolanie metody change a pouzitie premennej numbers
        System.out.println(">> Adresne miesto pre premennu numbers po zavolani metody change " + numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
 */


// _____________________________________________________________


/*
// KOD PRE POUZITIE ENUM A SWITCH ZAROVEN PRE OPTIMALIZOVANIE ZAPISU KODU
public class MyFirstProgram {

    enum Days {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    enum type {
        WEEKEND, WEEKDAY, UNKNOWNDAY
    }

    public static void main(String[] args) {

        Days day = Days.FRIDAY;

        switch (day) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> System.out.println(type.WEEKDAY);
                // System.out.println(wkd);
                // break;
                // !!! Ak je pouzita v zapise jedneho switchu jeden typ zapisu, tak musi byt pouzity pre vsetky pripady, inac hodi chybu different java case


            case SATURDAY, SUNDAY -> System.out.println(type.WEEKEND); od verize java12 je mozne namiesto zapisu s break zapisat iba za sipkou
            default -> System.out.println(type.UNKNOWNDAY);
        }

                }
_____________________________________________________________________
     ULOHA PRE SWITCH VO FUNKCII
    public class Task {

    public static String getDayName(int day) {
        return switch(day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Unknown";
        };
    }
_____________________________________________________________________
        // uloha pre pouzitie enum switch vo funkcii
        public class Task {

    public enum Month {
        JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
    }

    public static int getMonthNumber(Month month) {
        return switch (month) {
            case JANUARY -> 1;
            case FEBRUARY ->  2;
            case MARCH -> 3;
            case APRIL -> 4;
            case MAY -> 5;
            case JUNE -> 6;
            case JULY -> 7;
            case AUGUST -> 8;
            case SEPTEMBER -> 9;
            case OCTOBER -> 10;
            case NOVEMBER -> 11;
            case DECEMBER -> 12;
        };
    }

}


}
     */

// _____________________________________________________________

/*
// ternarny operator
public class MyFirstProgram {

    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int biggerOrEqual;

        if (a >= b) {
            biggerOrEqual = a;
        } else {
            biggerOrEqual = b;
        } // tento zapis if else je rovocenny s ternarnym operatorom nizsie

        biggerOrEqual = a >= b ? a : b; // jedna sa o zapis ternarneho operatora
        // definicia premmenej na prvom mieste
        // je acko vacsie rovne ako bcko - podmienka bud true alebo false a konci otaznikom
        // ak je podmienka true ide na poziciu a, ak je false ide na poziciu b v zapise


        System.out.println("Bigger or equal is " +biggerOrEqual);

    }

}

>> Riesenie uloh: Dopis kod funkcie compareNumbers tak, aby vratilo vacsie cislo. Ak su rovnake, vrati a
public class Task {
    public static int compareNumbers(int a, int b) {
        return a >= b ? a : b;
    }
}

>> Riesenie uloh: Dopis funkciu absValue tak, aby vratilo absolutnu hodnotu daneho cisla. Ak je napr. cislo -5, tak absolutna hodnota bude 5.
public class Task {
    public static int absValue(int x) {
        return x < 0 ? -x : x; // ak je x < 0 tak znegujem to minusom co je ekvivalent vynasobenia -1
    }
}

*/

// _____________________________________________________________

/*  SCANNER - interaktivny zapis uzivatelom do programu
import java.util.Scanner;

public class MyFirstProgram {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Hello what is your name?");
        String name = scan.nextLine();
        System.out.println("Nice to get you know " + name + ", my name is JAVA.");
        System.out.println("Please provide your age.");
        int age = scan.nextInt();
        if (age >= 18) {
            System.out.println("You can drive a car.");
        } else {
            System.out.println("You are not eligible to drive a car.");
        }
    }
}
*/

// _____________________________________________________________

/*  CASTING
public class MyFirstProgram {

    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        double c = (double) a / b; // casting - zmena typou premennej
        // v priklade sa premenna a a b zmenila z int na double
        // pouzil sa prikaz v zatvorke pred vzorcom
        System.out.println(c);

        // ak chceme zmenit string na integer:
        String s = "5";
        int i = Integer.parseInt(s);
        System.out.println(i);

        // Existuje aj nieco ako wrapper (trieda)
        Integer j = 5; // int i je primitivny typ, Integer j je objekt
        // s objektom je mozne pouzivat rozne funkcie
        j.toString();
        // existuju este aj Character, Double - vacisnou ako premenna ale s velkym pismenom

    }

}
*/

// _____________________________________________________________


/*
Vytvor 2D pole o velkosti 3x3. Napln ho hviezdickami * a vypis pole obrazovku.

public class Main {
    public static void main(String[] args) {
        char[][] table = new char[3][3];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
               table[i][j] = '*';
            }
        }
        for (char[] row: table) {
            System.out.println(row);
        }
    }
}

 */

// _____________________________________________________________

/*
// DVOJROZMERNE POLIA - Najdi najvacsie cislo v dvojrozmernom poli.

public class MyFirstProgram {

    public static void main(String[] args) {
        int[][] numbers = {{1,8,3}, {4,11,6}};
        int max = findMax(numbers);
        int max2 = findMax2(numbers);
        System.out.println("#1 Maximum Value: " + max);
        System.out.println(("#2 Maximmum Value: " + max2));
    }
    public static int findMax(int[][] numbers) {
        int max = numbers[0][0];
        for (int[] riadok: numbers) {
            for (int element: riadok) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }

    public static int findMax2(int[][] numbers) {
        int max2 = numbers[0][0];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++)
                if (numbers[i][j] > max2) {
                    max2 = numbers[i][j];
                }
        }
        return max2;
    }

}

// _____________________________________________________________

// DVOJROZMERNE POLIA - Vypis najvacsi sucet riadku v dvojrozmernom poli.

public class MyFirstProgram {

    public static void main(String[] args) {
        int[][] numbers = {{1,1,1}, {1,1,2}};
        int max = sumMaxRow(numbers);
        int max2 = sumMaxRow2(numbers);
        System.out.println("#1 Max row count: " + max);
        System.out.println(("#2 Msx row count: " + max2));
    }
    public static int sumMaxRow(int[][] numbers) {
        int maxRowSum = 0;
        for (int[] row : numbers) {
            int rowSum = 0;
            for (int element : row) {
                rowSum += element;
                }
            if (rowSum > maxRowSum) {
                maxRowSum = rowSum;
            }
        }
        return maxRowSum;
    }

    public static int sumMaxRow2(int[][] numbers) {
        int maxRowSum2 = 0;
        for (int i = 0; i < numbers.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < numbers[i].length; j++) {
                rowSum += numbers[i][j];
            }
                if (rowSum > maxRowSum2) {
                    maxRowSum2 = rowSum;
                }
        }
        return maxRowSum2;
    }

}

// _____________________________________________________________

// WHILE cyklus + DO-WHILE cyklus

public class MyFirstProgram {
    public static void main(String[] args) {

//        int i = 10; // klasicky while cyklus
//        while (i >= 1) {
//            System.out.println(i);
//            i--;
//        }

        int i = 10; // do-while cyklus
        do {
            System.out.println(i);
            i--;
        } while (i >= 1);

    }


}

// _____________________________________________________________

// Vypis cisla od 1 po 10 do noveho riadku
// Po kazdom riadku vypis cislo tolko krat aku hodnotu predstavuje
// 1
// 1
// 2
// 22
// 3
// 333

public class MyFirstProgram {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

    }
}

// _____________________________________________________________

// Dopis funkciu sum tak, aby vracala sucet vsetkych cisel od 1 po n. Pouzi while cyklus

public class MyFirstProgram {
    public static void main(String[] args) {
    int n = 5;
    System.out.println(sum(n));

    }
    public static int sum(int n) {
        int result = 0;
        while (n > 0) {
            result += n;
            n--;
        }

        return result;
    }
}

// _____________________________________________________________

// Dopis funkciu countOccurrence tak, aby vratila pocet vyskytov znaku character v retazci text.
// Pouzi while cyklus.

public class MyFirstProgram {
    public static void main(String[] args) {
    String text = "Sku0ska met0ody p0re hla0dani0e 0";
    char character = '0';
    int countOccurrence = countOccurrence(text, character);
    System.out.println("Occurence of '" + character + "in the text variable is " + countOccurrence);
    }


    public static int countOccurrence(String text, char character) {
        int count = 0;
        int index = 0;
        while (index < text.length()) {
            if (text.charAt(index) == character) {
                count++;
            }
            index++;
        }
        return count;
    }

}

// _____________________________________________________________

// Vypis vsetky parne cisla na obrazovku od 0 po n. Pouzi do while.
public class MyFirstProgram {
    public static void main(String[] args) {
        int n = 523;
        int i = 0;
        do {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        } while (i <= n);
    }
}

// _____________________________________________________________

// Dopis funkciu countOddNumbersBeforeEvenNumber,
// ktora v zadanom poli vypise pocet neparnych cisel,
// ktore sa nachadzaju pred prvym parny cislom.
// Ak v poli najdes parne cislo, tak pouzi break.

public class MyFirstProgram {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 3;
        numbers[2] = 5;
        numbers[3] = 8;
        numbers[4] = 10;

        int count = countOddNumbersBeforeEvenNumber(numbers);
        System.out.println("#1 Pocet neparnych cisel pred parnym cislom v poli numbers je " + count);

        int count2 = countOddNumbersBeforeEvenNumber2(numbers);
        System.out.println("#2 Pocet neparnych cisel pred parnym cislom v poli numbers je " + count2);

        int count3 = countOddNumbersBeforeEvenNumber3(numbers);
        System.out.println("#3 Pocet neparnych cisel pred parnym cislom v poli numbers je " + count3);

        int count4 = countOddNumbersBeforeEvenNumber4(numbers);
        System.out.println("#3 Pocet neparnych cisel pred parnym cislom v poli numbers je " + count4);

    }

    public static int countOddNumbersBeforeEvenNumber(int[] numbers) {
        int countOdds = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                break;
            }
            countOdds++;
        }
        return countOdds;
    }

    public static int countOddNumbersBeforeEvenNumber2(int[] numbers) {
        int countOdds = 0;
        for (int element : numbers) {
            if (element % 2 == 0) {
                break;
            }
            countOdds++;
        }
        return countOdds;
    }

    public static int countOddNumbersBeforeEvenNumber3(int[] numbers) {
        int countOdds = 0;
        int i = 0;
        while (i < numbers.length) {
            if (numbers[i] % 2 == 0) {
                break;
            }
            i++;
            countOdds++;
        }
        return countOdds;
    }

    public static int countOddNumbersBeforeEvenNumber4(int numbers[]) {
        int countOdds = 0;
        int i = 0;
        do {
            if (numbers[i] % 2 == 0) {
                break;
            }
            i++;
            countOdds++;
        } while (i < numbers.length);
        return countOdds;
    }
}

// _____________________________________________________________

// Dopis funkciu sumOfEvenNumbers, ktora vypocita sucet vsetkych
// parnych cisel v rozsahu od 1 po n (vratane).
// Pri vypocte vyuzi continue.

public class MyFirstProgram {
    public static void main(String[] args) {
        int n = 5;
        int start = 6;
        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] += start + i;
        }


        int sumAll = sumOfEvenNumbers(numbers);
        System.out.println("#1 Sum of the even numbers in the array interval is " + sumAll);

        int sumAll2 = sumOfEvenNumbers2(numbers);
        System.out.println("#2 Sum of the even numbers in the array interval is " + sumAll2);

        int sumAll3 = sumOfEvenNumbers3(numbers);
        System.out.println("#3 Sum of the even numbers in the array interval is " + sumAll3);

        int sumAll4 = sumOfEvenNumbers4(numbers);
        System.out.println("#4 Sum of the even numbers in the array interval is " + sumAll4);
    }

        public static int sumOfEvenNumbers(int[] numbers) {
            int sum = 0;
            for (int element : numbers) {
                if (element % 2 != 0) {
                    continue;
                }
                sum += element;
            }
            return sum;
        }

        public static int sumOfEvenNumbers2(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] %2 != 0) {
                continue;
            }
            sum += numbers[i];
        }
        return sum;
        }

    public static int sumOfEvenNumbers3(int[] numbers) {
        int sum = 0;
        int i = 0;
        while (i < numbers.length) {
            if (numbers[i] % 2 != 0) {
                i++;
                continue;
            }
            sum += numbers[i];
            i++;
        }
        return sum;
    }

    public static int sumOfEvenNumbers4(int[] numbers) {
        int sum = 0;
        int i = 0;
        do {
            if (numbers[i] % 2 != 0) {
                i++;
                continue;
            }
            sum += numbers[i];
            i++;
        } while (i < numbers.length);
        return sum;
    }

}

// _____________________________________________________________

// Napis funkciu checkPalindrome, ktora dostane ako parameter String a vrati true,
// ak je String palindrom, inak vrati false.
//Poznm: Palindrom je slovo, ktore sa cita rovnako zlava aj sprava. Napriklad slovo "oko" je palindrom.

public class MyFirstProgram {
    public static void main(String[] args) {
        String palindrome = "Modrastek";

        boolean state = checkPalindrome(palindrome);

        if (state) {
            System.out.println("The string variable palindrome value " + palindrome + " is a palindrome.");
        } else {
            System.out.println("The string variable palindrome value " + palindrome + " is NOT a palindrome.");
        }

    }

    public static boolean checkPalindrome(String palindrome) {
        palindrome = palindrome.toLowerCase();
        int palLength = palindrome.length();

        if (palindrome.length() % 2 == 0) {
            for (int i = 0; i < palLength / 2; i++) {
                if (palindrome.charAt(i) != palindrome.charAt(palLength - i - 1)) {
                    return false;
                }
            }
        } else {
            for (int j = 0; j < (palLength - 1) / 2; j++) {
                if (palindrome.charAt(j) != palindrome.charAt(palLength - j - 1)) {
                    return false;
                }
            }
        }
        return true;
    }

}

// _____________________________________________________________

// Vytvor funkciu reverseString, ktora ako parameter bude prijimat String a vrati ho v opacnom poradi.
//Priklad: reverseString("ahoj") => "joha"

public class MyFirstProgram {
    public static void main(String[] args) {
        String reverse = "ahoj";

        String reversedString = reverseString(reverse);
        System.out.println(reversedString);

        String reverseString2 = reverseString2(reverse);
        System.out.println(reverseString2);
    }

    public static String reverseString(String reverse) {
        int stringLength = reverse.length();
        if (stringLength == 0) {
            return "";
        }
        return reverse.charAt(stringLength - 1) + reverseString(reverse.substring(0, stringLength - 1));
    }

    public static String reverseString2(String reverse) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = reverse.length() - 1; i >= 0; i--) {
            stringBuilder.append(reverse.charAt(i));
        }
        return stringBuilder.toString();
    }

}

// _____________________________________________________________

// Dopis funkciu checkAnagram tak, aby vratila true ak su slova anagramy, inak false.
//Angramy su slova, ktore maju rovnake pismena, ale v inom poradi.
//Priklad: anagram a nagaram su anagramy.

import java.util.Arrays;

public class MyFirstProgram {
    public static void main(String[] args) {
        String a = "anagram";
        String b = "anagramm";

        boolean anagramPass = checkAnagram1(a, b);
        System.out.println(anagramPass);

        boolean anagramPass2 = checkAnagram2(a, b);
        System.out.println(anagramPass2);

    }

    public static Boolean checkAnagram1(String a, String b) {
        String aLow = a.toLowerCase();
        String bLow = b.toLowerCase();

        if (a.length() != b.length()) {
            return false;
        }
        for (int i = 0; i < aLow.length(); i++) {
            if (!bLow.contains(String.valueOf(aLow.charAt(i)))) {
                return false;
            }
        }
        return true;
    }


    public static boolean checkAnagram2(String a, String b) {
        char[] arrayA = a.toCharArray();
        char[] arrayB = b.toCharArray();

        Arrays.sort(arrayA);
        Arrays.sort(arrayB);

        return Arrays.equals(arrayA, arrayB);
    }

}

// _____________________________________________________________
// TAZKA ULOHA !!!!!!!!!!!!!!!!! ZOPAKOVAT !!!!!!!!!!!!!

// Vytvor funkciu longestPalindromeSubstring, ktora ako parameter dostane string a vrati
// najdlhsie palindromicke podretazec v danom stringu.
// Ak je takych podretazcov viac, vrati prvy z nich.
//Priklady: longestPalindromeSubstring("abba") by malo vratit "abba",
// longestPalindromeSubstring("abacada") by malo vratit "aba",
// longestPalindromeSubstring("abacadae") by malo vratit `"ada"

public class MyFirstProgram {
    public static void main(String[] args) {
        String test = "abkackadae";

        String testPass = longestPalindromeSubstring(test);
        System.out.println(testPass);
    }


    public static String longestPalindromeSubstring(String test) {
        String longest = "";
        for (int i = 0; i < test.length(); i++) {
            for (int j = i; j <= test.length(); j++) {
                String substring = test.substring(i, j);

                // check if palindrome
                if (checkPalindrome(substring) && substring.length() > longest.length()) {
                    longest = substring;
                }

            }
        }
        return longest;
    }

    public static boolean checkPalindrome(String test) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = test.length() - 1; i >= 0; i--) {
            stringBuilder.append(test.charAt(i));
        }
        return test.equals(stringBuilder.toString());
    }

}

// _____________________________________________________________

// Dopis funkciu validParenthesis, ktora dostane ako parameter retazec obsahujuci zatvorky
// a vrati true ak su zatvorky spravne uzatvorkovane, inak vrati false.
// Zatvorky su buď ( alebo ). Zatvorky su spravne uzatvorkovane ak kazda otvaracia zatvorka ma
// svoju uzatvaraciu zatvorku a naopak.
// Napriklad (()()) je spravne uzatvorkovane, ale (() nie je spravne uzatvorkovane.

public class MyFirstProgram {
    public static void main(String[] args) {
        String s = "(()))(";

        boolean passString = validParenthesis(s);
        System.out.println(passString);
    }

    public static boolean validParenthesis(String s) {
        boolean valid = true;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                count ++;
            } else if (c == ')') {
                count--;
            }

            // kontrola, ci je spravna sekvencia zatvoriek
            // ak nie je, tak klesne pod hodnotu 0
            if (count < 0) {
                valid = false;
                break;
            }
        }

        if (count != 0) {
            return valid = false;
        } return valid;
    }
}

// _____________________________________________________________

// Napis funkciu countDuplicates, ktora dostane ako parameter zoznam
// celych cisel a vrati pocet duplikatov v zozname.
// Duplikatom sa mysli cislo, ktore sa v zozname vyskytuje viac ako raz.


public class MyFirstProgram {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 2, 5, 6, 1, 5};

            int passInt = countDuplicates(numbers);
            System.out.println(passInt);
    }

    public static int countDuplicates(int[] numbers) {
        int count = 0;
        StringBuilder duplicates = new StringBuilder();
        for (int i = 0; i < numbers.length; i++) {
            if (duplicates.toString().contains(String.valueOf(numbers[i]))) {
                continue;
            }

            for (int j = i +1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    count++;
                    duplicates.append(numbers[i]);
                    break;
                }
            }
        }
        return count;
    }

}

// _____________________________________________________________

// Vytvor funkciu sumOfPrimes, ktora bude mat jeden parameter - cislo n.
// Funkcia vrati sucet vsetkych prvocisel mensich ako n.
//Priklad: sumOfPrimes(10) => 17, pretoze 2 + 3 + 5 + 7 = 17


public class MyFirstProgram {
    public static void main(String[] args) {
        int n = 10;

        int nPass = sumOfPrimes(n);
        System.out.println(nPass);
    }


    public static int sumOfPrimes(int n) {
        int sum = 0;

        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        return sum;
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

// _____________________________________________________________

// Napis funckiu isIsogram, ktora dostane ako parameter retazec a vrati true
// ak je retazec isogram, inak vrati false.
//Isogram je slovo, v ktorom sa ziadne pismeno neopakuje.
// Napriklad isogram je isogram, ale isIsogram nie je (slovo obsahuje dve i a dve s).

public class MyFirstProgram {
    public static void main(String[] args) {
        String s = "isogrami";

        boolean sPass = isIsogram(s);
        System.out.println(sPass);
    }

    public static boolean isIsogram(String s) {
        boolean isIsogram = true;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            for (int j = i + 1; j < s.length(); j++) {
                if (c == s.charAt(j)) {
                    isIsogram = false;
                    break;
                }
            }
        }
        return isIsogram;
    }

}

// _____________________________________________________________

// Dopis funkciu rotateMatrix, ktora ma jeden parameter int[][] matrix,
// ktory predstavuje maticu. Funkcia ma vratit maticu, ktora je otocena o 90 stupnov vpravo.
// Matica je vzdy stvorcova.
//Priklad:
//[[1, 2, 3],
//[4, 5, 6],
//[7, 8, 9]]
//->
//[[7, 4, 1],
//[8, 5, 2],
//[9, 6, 3]]

public class MyFirstProgram {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        matrix[1][0] = 4;
        matrix[1][1] = 5;
        matrix[1][2] = 6;
        matrix[2][0] = 7;
        matrix[2][1] = 8;
        matrix[2][2] = 9;

        int[][] passMatrix = rotateMatrix(matrix);

        // how to print matrix
        for (int[] row : passMatrix) {
            for (int value : row) {
                System.out.print(value + "");
            }
            System.out.println(); // move to next line after print each row
        }

    }

    public static int[][] rotateMatrix(int[][] matrix) {
        int[][] rotatedMatrix = new int[matrix.length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = matrix.length - 1; j >= 0; j--) {
                rotatedMatrix[i][matrix.length - 1 - j] = matrix[j][i];
            }
        }
        return rotatedMatrix;
    }
}

// _____________________________________________________________

// Napis funkciu transposeMatrix, ktora dostane ako parameter maticu a
// vrati jej transponovanu maticu. Transponovana matica je matica,
// ktora vznikne tak, ze sa vymenia riadky a stlpce.
//Napriklad:
//[[1, 2, 3],
//[4, 5, 6]]
//->
//[[1, 4],
//[2, 5],
//[3, 6]]

import java.util.Arrays;

public class MyFirstProgram {
    public static void main(String[] args) {

        int[][] matrix = new int[2][3];
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        matrix[1][0] = 4;
        matrix[1][1] = 5;
        matrix[1][2] = 6;

        int[][] passMatrix = transposeMatrix(matrix);

        for (int[] row : passMatrix) {
            for (int value : row) {
                System.out.print(value + "");
            }
            System.out.println();
        }
    }

    public static int[][] transposeMatrix(int[][] matrix) {
        int[][] transposedMatrix = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }
        return transposedMatrix;
    }

}

// _____________________________________________________________

// For cyklus a pole

import java.util.Arrays;

public class MyFirstProgram {
    public static void main(String[] args) {
        int[] numbers = new int[10];

        // chceme do pola dopisat hodnoty
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        System.out.println(Arrays.toString(numbers));

        // chceme vypisat vsetky parne cisla z pola
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i] + " is even number.");
            } else {
                System.out.println(numbers[i] + " is odd number.");
            }
        }
    }
}

// _____________________________________________________________

// Vynimky

import java.util.Scanner;

public class MyFirstProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        while (true) {
            try {
                System.out.println("First step before scanner initialization by user - expected integer 1 <= n <= 10.");
                number = scanner.nextInt();
                System.out.println("Scanner initialized by user with integer = " + number + ".");

                if (number >= 1 && number <= 10) {
                    break;
                } else {
                    System.out.println("Integer shall be in an interval 1 <= n <= 10.");
                }

            } catch (Exception e) {
                System.out.println("Invalid input - repeat cycle.");
                scanner.nextLine();
            }
        }

        System.out.println("Your number is " + number + ".");

    }
}

// _____________________________________________________________

// Ake vynimky pozname

import java.lang.reflect.Array;
import java.util.Arrays;

public class MyFirstProgram {

    // checked vynimky - zachytene vynimky
    // potrebna funkcia
    // ak je za definiciou metody throws Exception, metoda vie poskytnut vynimku
    public static int divide(int a, int b) throws Exception {
        if (b == 0) {
            throw new Exception("Cannot divide by zero.");
        } else {
            return a/b;
        }
    }

    public static void main(String[] args) {

        // runtime alebo unchecket excpetion - program nevypise chybu a skompiluje
        // po slovensky = nezachytene vynimky
        // progam spadne po spusteni
//        int[] numbers = new int[3];
//        numbers[100] = 5;
//        System.out.println(Arrays.toString(numbers));

        // dalsi priklad nezachytenej vynimky
        // arithmetic exception - division by zero
//        int a = 5 / 0;


        // checked exception
        // ak bude v tvare:
        // int n = divide(5, 0); , tak JAVA nepovoli metodu pouzit
        // JAVA bude pozadovat pouzitie vynimky try/catch
        try {
            int n = divide(5, 0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
 */