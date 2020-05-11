import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    AsciiChars.printNumbers();
    AsciiChars.printUpperCase();
    AsciiChars.printLowerCase();

    Scanner userInput = new Scanner(System.in);

    System.out.println("Please enter your name: ");
    String name = userInput.nextLine();
    System.out.printf("Hello %s, would you like to continue? Y/N: ", name);

    String cont = userInput.nextLine();

    if (cont.toLowerCase().equals("y") || cont.toLowerCase().equals("yes")) {
      System.out.println("Let's get started:");
      Survey.askQuestions();
      userInput.close();
    } else {
      System.out.println("Please come back to finish the survey!");
      userInput.close();
      return;
    }
  }
}