import java.util.*;

public class Survey {
  public static int reduceNum(int num) {
    int res = Math.abs(num);
    while (res > 65) {
      res = res - 65;
    }
    return res;
  }

  public static void getNumbers(String favePet, int petAge, int luckyNum, int qbNum, int carYear, String faveAct,
      int userRand) {

    Random random = new Random();
    int randomNum = random.nextInt(65);
    int randomNum2 = random.nextInt(65);
    int magicNum = 0;
    int num1 = Integer.MIN_VALUE;
    int num2 = Integer.MIN_VALUE;
    int num3 = Integer.MIN_VALUE;
    int num4 = Integer.MIN_VALUE;
    int num5 = Integer.MIN_VALUE;

    if (qbNum > 0) {
      magicNum = qbNum * randomNum;
    } else {
      magicNum = luckyNum * randomNum;
    }
    while (magicNum > 75) {
      magicNum = magicNum - 75;
    }

    num1 = reduceNum((int) favePet.charAt(2));
    num2 = reduceNum(carYear + luckyNum);
    num3 = reduceNum(userRand - randomNum2);
    num4 = reduceNum(faveAct.charAt(0));
    num5 = reduceNum(petAge + carYear);

    System.out.printf("Lottery Numbers: %d, %d, %d, %d, %d %n", num1, num2, num3, num4, num5);
    System.out.println("Magic Ball: " + magicNum);
  }

  public static void askQuestions() {
    Scanner in = new Scanner(System.in);
    boolean repeat = true;

    while (repeat) {
      System.out.println("What is your favorite pet's name? ");
      String favePet = in.nextLine();

      System.out.println("How old is your favorite pet? ");
      int petAge = in.nextInt();

      System.out.println("What is your lucky number? ");
      int luckyNum = in.nextInt();

      System.out.println("Do you have a favorite basketball player? Y/N ");
      int qbNum = 0;
      if (in.nextLine().toLowerCase().equals("yes") || in.nextLine().toLowerCase().equals("y")) {
        System.out.println("What is their number? ");
        qbNum = in.nextInt();
      }

      System.out.println("What is two-digit model year of your car? ");
      int carYear = in.nextInt();
      in.nextLine();
      System.out.println("What is the first name of your favorite actor or actress? ");
      String faveAct = in.nextLine();

      System.out.println("Enter a random number between 1 and 50: ");
      int userRand = in.nextInt();

      Survey.getNumbers(favePet, petAge, luckyNum, qbNum, carYear, faveAct, userRand);

      System.out.println("Try again? Y/N ");
      if (in.nextLine().toLowerCase().equals("no") || in.nextLine().toLowerCase().equals("n")) {
        repeat = false;
      }
    }

    in.close();
  }
}