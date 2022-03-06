//import java.util.*;
import java.util.Scanner; // Java package used for taking input in java

// Declaring main class named as Restaurant
class Restaurant{

  // Declaration of method function named login().
  static void login(){
    System.out.println("Login");

    //Declaration of variable.
    String Username;
    String Password;
    Password = "123";
    Username = "wisdom";

    // Declaration and use of Scanner package
    Scanner input1 = new Scanner(System.in);
    System.out.println("Enter Username : ");
    String username = input1.next();
    Scanner input2 = new Scanner(System.in);
    System.out.println("Enter Password : ");
    String password = input2.next();

    // Starting conditional if else statement to check the credentials
    if (username.equals(Username) && password.equals(Password)) {
        System.out.println("Access Granted! Welcome!");

        // Accessing the manager class with the help of object.
        Manager mng = new Manager();
        mng.manager();
    }

    else if (username.equals(Username)) {
        System.out.println("Invalid Password!");
    } else if (password.equals(Password)) {
        System.out.println("Invalid Username!");
    } else {
        System.out.println("Invalid Username & Password!");
    }

}


// main function for running the programs
  public static void main(String []args) {
  System.out.println("\n\n    ***** Welcome to Restaurant ***** \n\n");

  System.out.println("For Manager press 1 ");
  System.out.println("For Customer press 2 ");
  System.out.println("For Exit press 3 ");
  Scanner sc = new Scanner(System.in);
  int enter = sc.nextInt();
  // Using the conditional statement for using/running the program accordingly.
  if(enter == 1){
    // Calling the login() method
    login();
  }
  else if(enter == 2){
    // Accessing the menu class with the help of mn Objects.
  menu mn = new menu();
  mn.Food();
  }
  else{
    // In case wrong inputs it will exit the program after else statement.
    System.out.println("SORRY! Wrong Input");
  }
}
}