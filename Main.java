import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      System.out.println("Hello World");
      System.out.println("Hello World 2");
      Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter username");

    String userName = myObj.nextLine();  // Read user input
    System.out.println("Username is: " + userName);  // Output user input
    }
  }