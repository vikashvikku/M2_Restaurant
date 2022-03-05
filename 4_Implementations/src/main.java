import java.util.*;
import java.util.Scanner;
//import menu;

class Restaurant{

  static void login(){
    System.out.println("Login");
    String Username;
    String Password;
    Password = "123";
    Username = "wisdom";
    Scanner input1 = new Scanner(System.in);
    System.out.println("Enter Username : ");
    String username = input1.next();
    Scanner input2 = new Scanner(System.in);
    System.out.println("Enter Password : ");
    String password = input2.next();

    if (username.equals(Username) && password.equals(Password)) {

        System.out.println("Access Granted! Welcome!");
    }

    else if (username.equals(Username)) {
        System.out.println("Invalid Password!");
    } else if (password.equals(Password)) {
        System.out.println("Invalid Username!");
    } else {
        System.out.println("Invalid Username & Password!");
    }

}

/*static void Hello(){
  System.out.println("Hello WOrld");
  Scanner S1 = new Scanner(System.in);
  System.out.println("Enter Add");
  int use = S1.nextInt();
  int use2 = S1.nextInt();
  int use3 = use + use2;
  System.out.println(use3);
      
}*/




  public static void main(String []args) {
  System.out.println("\n\n    ***** Welcome to Restaurant ***** \n\n");
  //int enter = 1;
  System.out.println("For Manager press 1 ");
  System.out.println("For Customer press 2 ");
  System.out.println("For Exit press 3 ");
  Scanner sc = new Scanner(System.in);
  int enter = sc.nextInt();
  if(enter == 1){
    login();
  }
  else{
  //login();
  // Hello();
  menu mn = new menu();
  mn.Food();
  }
}
}