// TASK #17 - Create a method which will print fibonacci numbers.
// Method shall work for user defined scanned max. number.
// Note: 1 2 3 5 8 13 21 34 55 etc.

import java.util.Scanner;

public class Main {
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





//_______________________________________________________________________
//_______________________________________________________________________
//______________   ULOHY ________

/*
//_______________________________________________________________________
// ULOHA #1 spytaj sa pouzivatela na jeho meno a potom ho privitaj
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Ahoj, ako sa volas?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Vitaj u nas " + name);

    }
}
//_______________________________________________________________________
// ULOHA #2 eidtni program tak aby pozdravil iba ludi, ktori sa volaju Alice alebo Bob
// ak sa clovek vola inak, tak napis, ze ho nepoznas

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Prosim identifikuj sa svojim menom.");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        if (name.equals("Alice") || name.equals("Bob")) {
            System.out.println("Vitaj u nas " + name);
        } else {
            System.out.println("Toto meno nepoznam.");
        }

    }
}
//_______________________________________________________________________
// ULOHA #3 editni program tak aby to fungovalo aj keby prisiel clovek alice, bob, ALICE, BOB

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Identifikuje sa svojim menom.");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        if (name.equalsIgnoreCase("Alice") || name.equalsIgnoreCase("Bob")) {
            System.out.println("Vitaj u nas " + name);
        } else {
            System.out.println("Meno sa nenachadza.");
        }
    }
}
//_______________________________________________________________________
// ULOHA #4 Spytaj sa pouzivatela na cislo N a potom vypis sumu cisel od 1 po N

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Zadajte cislo od 1 po N pre vypocet ich sumy.");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println("Suma cisel je " + sum);

    }
}
//_______________________________________________________________________
// ULOHA #5 prerob tento kod tak, ze vytvoris nato metodu, ktora bude mat jeden parameter
// a metoda vrati sumu

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Zadaj cislo v intervale od 1 po N pre ich sumu.");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int sum = calculateSum(num); // v tomto kroku volam metodu
        System.out.println("Suma cisel od 1 po " + num + " je " + sum + ".");
    }
    public static int calculateSum(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        return sum;
    }
}
//_______________________________________________________________________
// ULOHA #6 prerob metodu calculationSum tak, aby nic nevracala a rovno vypise vysledok

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Zadaj cislo v intervale od 1 po N pre ich sumu.");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        calculateSum(num);
    }
    public static void calculateSum(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println("Suma cisel od 1 po " + num + " je " + sum + ".");
    }
}
//_______________________________________________________________________
// ULOHA #7 - vytvor metodu tak aby vypocitala iba sumu iba parnych cisel (od 1 po N)
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Zadajte cislo v intervale od 1 po N pre vypocet sumy parnych cisel.");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = calculateEven(number);
        System.out.println("Suma parnych cisel = " + sum);
    }

    public static int calculateEven(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
         if (i % 2 == 0) {
             sum += i;
         }
        }
        return sum;
    }
}
//_______________________________________________________________________
// ULOHA #8 - napis metodu ktora z hocijakeho celeho cisla vrati absolutnu hodnotu daneho cisla
// nemozes pouzit kniznicu

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Zadajte cislo. Program vzdy vrati absolutnu hodnotu cisla.");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int absNum1 = absoluteValue1(number); // podmienka if
        System.out.println("#1 Absolutna hodnota cisla " + number + " je = " + absNum1);

        int absNum2 = absoluteValue2(number); // ternanrny operator
        System.out.println("#2 Absolutna hodnota cisla " + number + " je = " + absNum2);

        int absNum3 = absoluteValue3(number); // funkcia z kniznice
        System.out.println("#3 Absolutna hodnota cisla " + number + " je = " + absNum3);
    }

    public static int absoluteValue1(int number) {
        if (number < 0) {
            return -1 * number;
        }
        return number;
    }

    public static int absoluteValue2(int number) {
        return number < 0 ? -1 * number : number;
    }

    public static int absoluteValue3(int number) {
        return Math.abs(number);
    }
}
//_______________________________________________________________________
// ULOHA #9.1 - napis metodu ktora z ktorehokolvek cisla vrati faktorial daneho cisla

public class Main {
    public static void main(String[] args) {
        int number = 3;
        System.out.println(factorialCalc(number));
    }

    public static int factorialCalc(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

//        Initialization:
//            result is initialized to 1.
//            The loop variable i is initialized to 1.
//        First iteration:
//            i = 1
//            result *= i → result = 1 * 1 = 1
//        Second iteration:
//            i = 2
//            result *= i → result = 1 * 2 = 2
//        Third iteration:
//            i = 3
//            result *= i → result = 2 * 3 = 6
//        Fourth iteration:
//            i = 4
//            result *= i → result = 6 * 4 = 24
//        Fifth iteration:
//            i = 5
//            result *= i → result = 24 * 5 = 120
//        Loop termination:
//            Since i is no longer less than or equal to number, the loop terminates.
//            After the loop completes, result contains the factorial of number, which is 120.

// ULOHA #9.2 - napis metodu ktora z ktorehokolvek cisla vrati faktorial daneho cisla (matematicky upravena metoda)

public class Main {
    public static void main(String[] args) {
        int number = 3;
        System.out.println(factorialCalc(number));
    }

    public static int factorialCalc(int number) {
        int result = 1;
        for (int i = number; i > 0; i--) {
            result *= i;
        }
        return result;
    }

//        Initialization:
//            result is initialized to 1.
//            The loop variable i is initialized to 3.
//        First iteration:
//            i = 3; 3> 0; subtract i by 1 = 2
//            result *= 3 → result = 1 * 3 = 3
//        Second iteration:
//            i = 2; 2 > 0; subtract i by 1 = 1
//            result *= i → result = 3 * 2 = 6
//        Third iteration:
//            i = 1; 1 > 0; subtract i by 1 = 0
//            result *= i → result = 6 * 1 = 6
//        Fourth iteration:
//            i = 0; 0 == 0 (false) - stop the loop
//        Loop termination:
//            Since i is no longer greater than 0, the loop terminates.
//            After the loop completes, result contains the factorial of number.

}
//_______________________________________________________________________
// ULOHA #10 - napis metodu ktora zisti aka je sanca ze pri n hodoch mincou padne stale hlava
// vysledok vypis v percentach

public class Main {
    public static void main(String[] args) {
        int number = 5; // number of coin tossing
        // for number = 3 the probability is = 1/2 * 1/2 * 1/2 = 1/8 = 0.125 = 12.5%
        probability1(number); // sending number variable value to the method
        probability2(number); // sending number variable value to the method
    }

    public static void probability1(int number) {
        double chance = 0.5; // probability each side of the coin is tossed = 1/2
        double result = 1; // initialized variable to start as the total probability is 1
        for (int i = 1; i <= number; i++) {
            result *= chance;
            // The loop iterates 'number' times, each time multiplying the 'result' by 'chance'.
            // After each iteration, the result represents the probability of getting 'number' consecutive heads.
            // Initialization:
            //      result is initialized to 1.
            //      The loop variable i is initialized to 1.
            // First iteration:
            //      i = 1; 1 < 3 (true); increment i by 1 = 2
            //      result *= 0.5 → result = 1 * 0.5 = 0.5
            // Second iteration:
            //      i = 2; 2 < 3 (true); increment i by 1 = 3
            //      result *= 0.5 → result = 0.5 * 0.5 = 0.25
            // Third iteration:
            //      i = 3; 3 <= 3 (true); increment i by 1 = 4
            //      result *= 0.5 → result = 0.25 * 0.5 = 0.125
            // fourth iteration:
            //      i = 4; 4 !<= 3 (false);
            // Loop termination:
            //      Since i is no <= number(3), the loop terminates.
            //      After the loop completes, result contains the probability.
        }
        String percentage = (result * 100) + "%";
        System.out.println("#1 Pravedepodobnost, ze z " + number + "hodov padne hlava je " + percentage + ".");
    }

    public static void probability2(int number) {
        double result = Math.pow(0.5, number);
        String percentage = (result * 100) + "%";
        System.out.println("#2 Pravedepodobnost, ze z " + number + "hodov padne hlava je " + percentage + ".");
    }
}
//_______________________________________________________________________
// ULOHA #11 - // napisat funkciu ktora vypise prvy N fibonacciho cisel

public class Main {
    public static void main(String[] args) {
    int number = 5;
    fibonacci(number);
    }

    public static void fibonacci(int number) {
        int a = 0;
        int b = 1;
        int c;
        System.out.println(0);
        for (int i = 1; i <= number; i++) {
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }
}
//_______________________________________________________________________
// ULOHA #12 - napis ulohu, ktora rekurzivne vypise cisla v intervale (1; 100) od cisla N
// bez for cyklu

public class Main {

    public static void main(String[] args) {
        int number = 98;
        long number2 = 5L;
        // pouzil sa long pre vyssie cisla, int premenna by nestacila kvoli jej rozsahu
        // long nezvladne viac ako 20L, int zvladne este menej
        // pre vyssie cisla je potrebne pouzit BigInteger
        // hodnoty 0 alebo zaporne hodnoty su stack overflow a nepredvidatelne chovanie
        recursivePrinting(number);
        System.out.println("");
        System.out.println(recursiveFactorial(number2));

    }

    public static void recursivePrinting(int number) {
        if (number >= 1 && number <= 100) {
            System.out.println(number);
            recursivePrinting(number + 1);
        }
    }

    public static long recursiveFactorial(long number2) {
 // pre definiciu metody pouzit long namiesto int pretoze v intervale 1-100 by nestacil rozsah
 // cokolvek vyssie ako 20L uz nezvladne ani long a je nutne pouzit BigInteger
        if (number2 == 1) {
            return number2;
        }
        return number2 * recursiveFactorial(number2 -1);
    }
}
//_______________________________________________________________________
// TASK #13 - help iceream man count the sum of sold icecream.
// If customer orders even count of icecream, one icecream cost = 1.5 EUR.
// If customer orders odd count of icream, one icecream cost = 1.25 EUR.
// Example:
// 1 icecream = 1.25 EUR
// 2 icecream = 3 EUR
// 3 icecream = 3.75 EUR

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int order = 0;

        while (true) {
            try {
                System.out.println("How many ice cream would you like?");
                order = scanner.nextInt();

                if (order >= 1) {
                    System.out.println("Yes, you can certainly have " + order + " ice cream.");
                    break;
                } else {
                    System.out.println("Please enter a positive integer value for the number of ice cream.");
                }

            } catch (Exception e) {
                System.out.println("You need to tell me number of ice cream you want to order.");
                scanner.nextLine();
            }
        }

        double totalCost = calculateOrderCost(order);
        System.out.println("The order cost is " + totalCost + " EUR.");
    }

    public static double calculateOrderCost(int order) {
        double pricePerEvenIceCream = 1.5;
        double pricePerOddIceCream = 1.25;

        if (order % 2 == 0) {
            return order * pricePerEvenIceCream;
        } else {
            return order * pricePerOddIceCream;
        }
    }
}
//_______________________________________________________________________
// TASK #13 - Create a method which will have two paramters: 'start' and 'stop'.
// The method shall calculate sum and avg of numbers between start and stop.
// Display the results.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int start = 0;
        int stop = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Please enter the start number (integer 1 <= n <= 100).");
                start = scanner.nextInt();
                System.out.println("You have selected " + start + " as the start number.");
                System.out.println();
                System.out.println("Please enter the stop number (integer 1 <= n <= 100).");
                scanner.nextLine();
                stop = scanner.nextInt();
                System.out.println("You have selected " + stop + " as the stop number.");
                System.out.println();

                if (start <= stop && start >= 1 && start <= 100 && stop >= 1 && stop <= 100) {
                    break;
                } else {
                    System.out.println("Invalid interval. Please ensure that start <= stop and both numbers are within the range 1 <= n <= 100.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input, expected integer.");
                scanner.nextLine(); // Consume invalid input
            }
        }

        String passCalculateSumAvg = calculateSumAvg(start, stop);
        System.out.println(passCalculateSumAvg);
    }

    public static String calculateSumAvg(int start, int stop) {
        double sumNumbers = 0;
        double avgNumbers = 0;
        int countInterval = 0;

        for (int i = start; i <= stop; i++) {
            sumNumbers += i;
            countInterval++;
        }

        if (start == stop) {
            avgNumbers = start; // If start == stop, then the average is just start itself
        } else {
            avgNumbers = sumNumbers / countInterval;
        }

        return "Sum of the selected numbers is = " + sumNumbers + ", and avg of the numbers = " + avgNumbers + ".";
    }
}
//_______________________________________________________________________
// TASK #14 - create a program which will ask user to enter any int number.
// Once number 7 is entered, the program shall end.
// Use scanner function.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        do {
            System.out.println("Enter number:");
            number = scanner.nextInt();
            System.out.println(number);
            scanner.nextLine();
        } while (number != 7);
        System.out.println("Program ended");

    }
}
//_______________________________________________________________________
// TASK #15(v1) - Scan input from user in a cycle, which would only print numbers in loop.
// Once user enters 'q' char, end the program.
// Count sum of input numbers and avg and print the result before the program ends.

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //--0010 - initialize scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Scanner initialized --0010.");

        //--0020 - initialize variable n to later store array length
        int n = 1;
        System.out.println("Int n initialized --0020 = " + n);

        //--0030 - initialize array variable to store user entered numbers
        int[] array = new int[n];
        System.out.println("Array initialized --0030 = " + Arrays.toString(array));


        //--0040 initialize do-while loop
        do {
            System.out.println("Do logic initialized --0040.");

            //--0050 - just text to instruct user
            System.out.println("Input any number in the interval 1 <= n <= 100. (step --0050)");

            //--0060 - just text to instruct user
            System.out.println("Enter character = 'q' to quit the program. (step --0060)");

            //--0070 - enter user input and rewrite the variable
            String input = scanner.nextLine();
            System.out.println("Step --0070 initialized.");

            //--0080 - initialize exception logic
            // to evaluate if entered number is integer
            // if not integer, go to step --0180 Exception e
            // if integer, go to --0090
            try {

                System.out.println("Step --0080 initialized - try/catch logic exception.");
                // --0081 Attempt to parse the input as an integer
                int parsedInput = Integer.parseInt(input);
                System.out.println("Scanner input parsed into integer step --0081.");

                //--0090 - just text to inform user
                System.out.println("User input = " + input + ". (step --0090)");

                    //--0100 - if logic to check if input number is in interval 1 to 100
                    // if yes, only then process the logic of storing scanned number
                    // if not, then go to else logic --0150 and process --0160 and --0170
                    // return back to --0060
                    if (parsedInput >= 1 && parsedInput <= 100) {

                        System.out.println("Step --0100 initialized, if statement to check interval.");
                       //--0110 - if in interval 1 to 100
                        // it shall directly store scanned number into last available array position
                        array[n - 1] = parsedInput;
                        System.out.println("Step --0110 - pass parsed input into array.");

                        //--0111 - inform user what numbers are in the array
                        System.out.println("Step --0111 Array = " + Arrays.toString(array));

                        //--0120 - increase array size for expected next entry
                        array = increaseArraySize(array);
                        System.out.println("Method increaseArraySize completed - step --0120.");
                        System.out.println("New array after step --0120 = " + Arrays.toString(array));


                        //--0130 - increase n parameter so that step --0110 logic works
                        System.out.println("Paramter n before increase = " + n);
                        n++;
                        System.out.println("Parameter n increased n++ step --0130 = " + n);
                        System.out.println("----------------------------------------------");


                        //--0150 - else logic if entered number not in 1 to 100
                    } else {

                        //--0160 - if not in the interval, inform user of incorrect input.
                        // return back to step --0050
                        System.out.println("Invalid number interval. (step --0160)");


                    }

            //--0180 initialize exception if integer is not entered
            } catch (Exception e) {

                System.out.println("Exception e initialized - integer not entered (step --0180).");

                // --0190 - Check if the input is equal to "q"
                if ("q".equalsIgnoreCase(input)) {
                    System.out.println("Character 'q' detected, code break to end program. (step -0190)");
                    break;

                }
                //--0210 - inform user of invalid character entered
                // in case it is not number and not equal to character q
                // program shall return back to step --0050
                System.out.println("Invalid input character. (Step -- 0210 - return back to --0050.)");
                System.out.println("-----------------------------------------");
            }

        //--0220 - if not true, then stop the program and start calculate sum and avg
        } while (true); {

            if (n > 1) {
                //--0230 - calling method to calculate sum and avg
                System.out.println("Step --0220 done, while = false, step --0230 and method calculateSumAvg to be called next.");
                System.out.println("-----------------------------------------------");
                calculateSumAvg(array, n);
            }

        }

    }

    public static int[] increaseArraySize(int[] array) {
        int newArraySize = array.length + 1; // incrementing array size by 1
        int[] newArray = Arrays.copyOf(array, newArraySize);
        // using java class Arrays to dynamically copy old array into new one
        // newArraySize dynamically changes the array size
        return newArray;
    }

    public static void calculateSumAvg(int[] array, int n) {
        --n; // best approach would be to decrease the array, but for the simplicity of today...
        double sum = 0;
        double avg = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];

        }
        avg = sum / n;

        System.out.println("::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("For the input numbers = " + Arrays.toString(array) + "the results are:");
        System.out.println("Sum of the numbers is = " + sum + ".");
        System.out.println("Average of the numbers is = " + avg + ".");
    }

}

// TASK #15(v2) - Scan input from user in a cycle, which would only print numbers in loop.
// Once user enters 'q' char, end the program.
// Count sum of input numbers and avg and print the result before the program ends.

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the program.");
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        StringBuilder listNumbers = new StringBuilder();

        do {
            System.out.println("------------------------------");
            System.out.println("Please enter integer numbers.");
            System.out.println("Please enter char 'q' to end and exit the program.");
            String input = scanner.nextLine();
            System.out.println("User input accepted.");

            try {
                if (input.equalsIgnoreCase("q")) {
                    System.out.println("User input = 'q', the program will exit.");
                    break;
                }

                int parsedInput = Integer.parseInt(input);

                listNumbers.append(parsedInput);
                listNumbers.append(" ");
                System.out.println("User input parsed into memory.");

                System.out.println("Current memory StringBuilder values are = "  + listNumbers.toString());

            } catch (Exception e) {
                System.out.println("Incorrect value entered by user. Use integer to add value, or 'q' to quit.");
            }

        } while (true);

        calculateSumAvg(listNumbers);

    }

    public static void calculateSumAvg(StringBuilder listNumbers) {
        if (listNumbers.length() == 0) {
            System.out.println("No valid data entered. Program ended.");
            return;
        }

        String[] numbersArray = listNumbers.toString().split(" ");
        double sum = 0;
        double count = 0;
        System.out.println("StringBuilder transformed into string array = " + Arrays.toString(numbersArray));

        for (int i = 0; i < numbersArray.length; i++) {
            int number = Integer.parseInt(numbersArray[i]);
            sum += number;
            count++;
        }

            double avg = sum / count;
            System.out.println("Sum and average results of the entered numbers are:");
            System.out.println("Sum = " + sum);
            System.out.println("Average = " + avg);
    }
}

// TASK #15(v3) - Scan input from user in a cycle, which would only print numbers in loop.
// Once user enters 'q' char, end the program.
// Count sum of input numbers and avg and print the result before the program ends.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        double count = 0;
        System.out.println("Welcome to the program.");

        while (true) {

            System.out.println("-----------------------");
            System.out.println("Enter numeric value, or enter q to exit and end program.");
            String value = scanner.nextLine();

            if (value.equalsIgnoreCase("q")) {
                System.out.println("User request to end program.");
                break;
            }

            try {
                double number = Double.parseDouble(value);
                sum += number;
                count++;

            } catch (Exception e) {
                System.out.println("User entered invalid input.");
            }

        }

        if (count > 0) {
            double average = sum / count;
            System.out.println("Sum of the entered numbers = " + sum + ".");
            System.out.println("Average of the entered numbers = " + average + ".");

        } else {
        System.out.println("User has not entered any value.");
        }
    }
}
//_______________________________________________________________________
// TASK #16 - print all prime numbers from 1 to 1000.

public class Main {
    public static void main(String[] args) {
        int start = 2;
        int end = 1000;

        // Special case for 2 (loop shall start + 1)
        System.out.println(2);

        for (int i = start + 1; i <= end; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }
    }
}
//_______________________________________________________________________
 */


