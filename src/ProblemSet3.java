/**
 * Problem Set 3.
 *
 * It's time to put your skills to the test. This problem set focuses on using
 * conditional control structures. It's also your first introduction to methods,
 * so things look a little different. The main method is done for you. Lines 31-40
 * trigger each of the predefined methods, which you can think of as self-contained
 * executable pieces of logic. Write your code for each exercise in the
 * corresponding method.
 *
 * The specifications for each exercise are outlined below. Your job is to write
 * lines of code to produce answers to my questions. Each exercise requires that
 * you ask the user to enter one or more values. Your code must meet the
 * requirements set forth in this section (as well as the Deliverables section).
 *
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

import java.util.Scanner;

public class ProblemSet3 {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        ProblemSet3 ps = new ProblemSet3();

        // comment out or uncomment as needed

        // ps.sign();          // executes Exercise 1
        // ps.parity();        // executes Exercise 2
        // ps.ordered();       // executes Exercise 3
        // ps.gpa();           // executes Exercise 4
        // ps.grade();         // executes Exercise 5
        // ps.cards();         // executes Exercise 6
        // ps.leapYear();      // executes Exercise 7
        // ps.state();         // executes Exercise 8
        // ps.months();        // executes Exercise 9
        ps.salary();        // executes Exercise 10

        in.close();
    }

    /*
     * Exercise 1.
     *
     * Prompt the user to enter an integer. Is it positive, negative, or zero?
     */

    public void sign() {
      System.out.print("\nEnter an integer: ");
      long number = in.nextLong();
      if (number > 0) {
        System.out.println("\nPositive.");
      }else if(number < 0 ){
        System.out.println("\nNegative.");
      }else{
        System.out.println("\nZero.");
      }
    }

    /*
     * Exercise 2.
     *
     * Prompt the user to enter an integer. Is it even or odd?
     */

    public void parity() {
      System.out.print("\nEnter an integer: ");
      long number2 = in.nextLong();
      if ((number2 % 2) == 0 ) {
        System.out.println("\nEven.");
      }else{
        System.out.println("\nOdd.");
      }
    }

    /*
     * Exercise 3.
     *
     * Prompt the user to enter three integers. How are the integers ordered?
     */

    public void ordered() {
      System.out.println("\nEnter three integers.");
      System.out.print("\nEnter integer: ");
      long int1 = in.nextLong();
      System.out.print("Enter integer: ");
      long int2 = in.nextLong();
      System.out.print("Enter integer: ");
      long int3 = in.nextLong();
      if ((int1 < int2) && int2 < int3) {
        System.out.println("\nStrictly increasing.");
      }else if (int1 == int2 && int2 == int3) {
        System.out.println("\nSame.");
      }else if (int1 <= int2 && int2 <= int3) {
        System.out.println("\nIncreasing.");
      }else if (int1 > int2 && int2 > int3) {
        System.out.println("\nStrictly decreasing.");
      }else if (int1 >= int2 && int2 >= int3) {
        System.out.println("\nDecreasing.");
      }else{
        System.out.println("\nUnordered.");
      }
    }

    /*
     * Exercise 4.
     *
     * Prompt the user to enter a letter grade. What's the corresponding GPA?
     */

    public void gpa() {
      final double A_VALUE = 4.00;
      final double B_VALUE = 3.00;
      final double C_VALUE = 2.00;
      final double D_VALUE = 1.00;
      final double F_VALUE = 0.00;
      final double PLUS_BONUS = 0.33;
      final double MINUS_PENALTY = -0.33;
      double gpaBase = 0;
      boolean validLetter = true;

      System.out.print("\nEnter a letter grade: ");
      in.nextLine();
      String letterGrade = in.nextLine();
      letterGrade = letterGrade.toUpperCase();
      char letter = (letterGrade.charAt(0));
      switch (letter) {
        case 'A':
          gpaBase = A_VALUE;
          break;
        case 'B':
          gpaBase = B_VALUE;
          break;
        case 'C':
          gpaBase = C_VALUE;
          break;
        case 'D':
          gpaBase = D_VALUE;
          break;
        case 'F':
          gpaBase = F_VALUE;
          break;
        default:
          System.out.println("\nThat's not a valid letter grade.");
          validLetter = false;
          break;
      }
      if (validLetter) {
        if (letterGrade.length() == 2) {
          if ((letterGrade.charAt(1) == '+') && (letter != 'A' && letter != 'F')) {
            double modifier = PLUS_BONUS;
            double finalGPA = gpaBase + modifier;
            System.out.printf("\nYour GPA is %.2f.\n", finalGPA);
          }else if ((letterGrade.charAt(1) == '-') && (letter != 'F')) {
            double modifier = MINUS_PENALTY;
            double finalGPA = gpaBase + modifier;
            System.out.printf("\nYour GPA is %.2f.\n", finalGPA);
        }else if(((letterGrade.charAt(1) == '+') ||(letterGrade.charAt(1) == '-')) && (letter == 'A')) {
          System.out.printf("\nYour GPA is %.2f.\n", gpaBase);
        }else{
          System.out.println("\nThat's not a valid letter grade.");
        }
      }else{
        System.out.printf("\nYour GPA is %.2f.\n", gpaBase);
      }
    }

  }

    /*
     * Exercise 5.
     *
     * Prompt the user to enter a grade. What's the corresponding letter grade?
     */

    public void grade() {
      final double A_MAX = 100;
      final double A_MIN = 90;
      final double B_MAX = 89;
      final double B_MIN = 80;
      final double C_MAX = 79;
      final double C_MIN = 70;
      final double D_MAX = 69;
      final double D_MIN = 60;
      final double F_MAX = 59;
      final double F_MIN = 0;

      System.out.print("\nEnter a grade: ");
      double numberGrade = in.nextDouble();

      if ((numberGrade >= A_MIN) && (numberGrade <= A_MAX)) {
        System.out.println("\nYou recieved an A.");
      }else if ((numberGrade >= B_MIN) && (numberGrade <= B_MAX)) {
        System.out.println("\nYou recieved a B.");
      }else if ((numberGrade >= C_MIN) && (numberGrade <= C_MAX)) {
        System.out.println("\nYou recieved a C.");
      }else if ((numberGrade >= D_MIN) && (numberGrade <= D_MAX)) {
        System.out.println("\nYou recieved a D.");
      }else if ((numberGrade >=F_MIN) && (numberGrade <=F_MAX)) {
        System.out.println("\nYou recieved an F.");
      } else if (numberGrade < 0) {
         System.out.println("\nGrades below 0 are invalid.");
     } else if (numberGrade > 100) {
         System.out.println("\nGrades above 100 are invalid.");
     }
   }

    /*
     * Exercise 6.
     *
     * Prompt the user to enter a playing card. What card was entered?
     */

    public void cards() {
      boolean validRank = true;
      boolean vaildSuit = true;
      String rankValue = "";
      String suitValue = "";

      System.out.print("\nEnter a Card: ");
      in.nextLine();
      String card = in.nextLine();
      if (card.length() == 2) {
        card = card.toUpperCase();
        char rank = (card.charAt(0));
        char suit = (card.charAt(1));

        switch (rank) {
          case '2':
            rankValue = "Two";
            break;
          case '3':
            rankValue = "Three";
            break;
          case '4':
            rankValue = "Four";
            break;
          case '5':
            rankValue = "Five";
            break;
          case '6':
            rankValue = "Six";
            break;
          case '7':
            rankValue = "Seven";
            break;
          case '8':
            rankValue = "Eight";
            break;
          case '9':
            rankValue = "Nine";
            break;
          case 'T':
            rankValue = "Ten";
            break;
          case 'J':
            rankValue = "Jack";
            break;
          case 'Q':
            rankValue = "Queen";
            break;
          case 'K':
            rankValue = "King";
            break;
          case 'A':
            rankValue = "Ace";
            break;
          default:
            validRank = false;
            System.out.println("That's not a valid rank.");
            break;
        }

        switch (suit) {
          case 'C':
            suitValue = "Clubs";
            break;
          case 'D':
            suitValue = "Diamonds";
            break;
          case 'H':
            suitValue = "Hearts";
            break;
          case 'S':
            suitValue = "Spades";
            break;
          default:
            vaildSuit = false;
            System.out.println("That's not a valid Suit.");
            break;
        }
        if (vaildSuit && validRank) {
          System.out.println("\n" + rankValue + " of " + suitValue + ".");
        }
      }else {
        System.out.println("\nThat's not a valid suit.");
      }

    }

    /*
     * Exercise 7.
     *
     * Prompt the user to enter a year. Is it a leap year or not?
     */

    public void leapYear() {
      System.out.print("\nEnter a year: ");
      long year = in.nextLong();
      boolean yearIsLeapYear = (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0));
      if (yearIsLeapYear) {
        System.out.println("\n" + year + " is a leap year.");
      } else {
        System.out.println("\n" + year + " is not a leap year.");
      }
    }

    /*
     * Exercise 8.
     *
     * Prompt the user to enter a temperature. At that temperature, is water a solid,
     * liquid, or gas?
     */

    public void state() {
      final int fahrenheitBoiling = 212;
      final int fahrenheitFreezing = 32;
      final int celciusBoiling = 100;
      final int celciusFreezing = 0;


      System.out.print("\nEnter a temperature: ");
      int temperature = in.nextInt();
      System.out.print("Enter a scale: ");
      in.nextLine();
      String scale = in.nextLine();
      scale = scale.toUpperCase();

      if (scale.equals("F")) {
        if (temperature >= fahrenheitBoiling) {
          System.out.println("\nGas.");
        }else if (temperature < fahrenheitBoiling && temperature > fahrenheitFreezing) {
          System.out.println("\nLiquid.");
        }else if (temperature <= fahrenheitFreezing) {
          System.out.println("\nSolid.");
        }
      }else if (scale.equals("C")) {
        if (temperature >= celciusBoiling) {
          System.out.println("\nGas.");
        }else if (temperature < celciusBoiling && temperature > celciusFreezing) {
          System.out.println("\nLiquid.");
        }else if (temperature <= celciusFreezing) {
          System.out.println("\nSolid.");
        }
      }else {
        System.out.println("\nThat's not a valid scale.");
      }

    }

    /*
     * Exercise 9.
     *
     * Prompt the user to enter a month. How many days are in that month?
     */

    public void months() {
      System.out.print("\nEnter a month: ");
      String month = in.nextLine();
      month = month.toLowerCase();
      switch (month) {
        case "january":
        case "jan":
        case "janu":
          System.out.println("\n31 days.");
          break;
        case "february":
        case "feb":
        case "febr":
          System.out.println("\n28 or 29 days.");
          break;
        case "march":
        case "mar":
        case "marc":
          System.out.println("\n31 days.");
          break;
        case "april":
        case "apr":
        case "apri":
          System.out.println("\n30 days.");
          break;
        case "may":
          System.out.println("\n31 days.");
          break;
        case "june":
        case "jun":
          System.out.println("\n30 days.");
          break;
        case "july":
        case "jul":
          System.out.println("\n31 days.");
          break;
        case "august":
        case "aug":
        case "augu":
          System.out.println("\n31 days.");
          break;
        case "september":
        case "sep":
        case "sept":
          System.out.println("\n30 days.");
          break;
        case "october":
        case "oct":
        case "octo":
          System.out.println("\n31 days.");
          break;
        case "november":
        case "nov":
        case "nove":
          System.out.println("\n30 days.");
          break;
        case "december":
        case "dec":
        case "dece":
          System.out.println("\n31 days.");
          break;
        default:
          System.out.println("\nThat's not a valid month.");
          break;
        }
    }

    /*
     * Exercise 10.
     *
     * Prompt the user to enter a wage and hours worked. How much money will be made?
     */

    public void salary() {
      final double OT_THRESHOLD = 40;
      final double PAY_MULTIPLIER = 1.5;
      double pay = 0.00;

      System.out.print("\nWage: ");
      double wage = in.nextDouble();
      System.out.print("Hours: ");
      double hours = in.nextDouble();

      if (wage >= 0) {
        if (hours >= 0) {
          double overtime = hours - OT_THRESHOLD;

          if (overtime > 0) {
              double extraPay = overtime * wage * PAY_MULTIPLIER;
              pay = extraPay + (wage * OT_THRESHOLD);
              System.out.printf("\nYou'll make $%,.2f this week.\n\n", pay);
          }else{
              pay = wage * hours;
              System.out.printf("\nYou'll make $%,.2f hours this week.\n\n", pay);
          }
        }else{
          System.out.println("\nYour hours must be greater than or equal to 0.0.");
        }
      }else {
        System.out.println("\nYour wage must be greater than or equal to $0.00/hour.");
      }
  }
}
