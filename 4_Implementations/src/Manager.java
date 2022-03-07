// import java.util.*;
import java.util.Scanner; // Java package used for taking input in java

// Declaration of Manager class
public class Manager {

  // Declaration of manager method.
  public void manager(){
    System.out.println("        Welcome Manager   \n\n");
    System.out.println("Enter Your Choice whom profile You want to see\n");
    // These are the list of Working Department.
    System.out.println("Enter 0 for Manager Profile");
    System.out.println("Enter 1 for Master Chef Department");
    System.out.println("Enter 2 for Waiter Department");
    System.out.println("Enter 3 for Security Guard Department");
    System.out.println("Enter 4 for Room Cleaner Department");
    System.out.println("Enter 5 for Cashier Department\n");

    // Here You can choose the Working Department whom you want to see the profile.
    Scanner sc = new Scanner(System.in);
    int choice = sc.nextInt();
  
    switch(choice){
      // This the the profile of manager.
      case 0:
        System.out.println("Manager Profile");

        System.out.println("Name - Mr. Rahul Singh");
        System.out.println("Age - 30 years");
        System.out.println("Education : - MBA");
        System.out.println("Working since - 7 years and 9 months");
        System.out.println("Salary = RS. 105000");
        System.out.println("Contact mail:- rahulamba@gmail.com");
        break;

      case 1:
        System.out.println("Master Chef\n");
        System.out.println("Enter the person profile\n");

        // These are the list of Masterchefs.
        System.out.println("Enter 1 for Mr. ABC profile ");
        System.out.println("Enter 2 for Mr. BCD profile");
        System.out.println("Enter 3 for Mr. CDE profile\n");

        Scanner sc1 = new Scanner(System.in);
        int masterchef = sc1.nextInt();
        // Here You can select the profile of the Masterchefs.
        switch(masterchef){

          // *** Masterchef ***
          case 1:
            System.out.println("Name - Mr. ABC");
            System.out.println("Age - 31 years");
            System.out.println("Speciality : - Kadhai Paneer");
            System.out.println("Working since - 2 years and 3 months");
            System.out.println("Salary = RS. 55000");
            System.out.println("Contact mail:- ABC@gmail.com");
            break;
          case 2:
            System.out.println("Name - Mr. BCD");
            System.out.println("Age - 28 years");
            System.out.println("Speciality : - Chicken Tandoori");
            System.out.println("Working since - 1 years and 2 months");
            System.out.println("Salary = RS. 45000");
            System.out.println("Contact mail:- BCD@gmail.com");
            break;
          case 3:
            System.out.println("Name - Mr. CDE");
            System.out.println("Age - 37 years");
            System.out.println("Speciality : - Noodles");
            System.out.println("Working since - 5 years and 5 months");
            System.out.println("Salary = RS. 65000");
            System.out.println("Contact mail:- CDE@gmail.com");
            break;
          default:
            System.out.println("SORRY! Wrong Input");
        }
        break;

      // *** Waiter ***
      case 2:
        System.out.println("Waiter\n");
        System.out.println("Enter the Waiter profile\n");

        // These are the list of Waiters;
        System.out.println("Enter 1 for Mr. PQRS profile ");
        System.out.println("Enter 2 for Mr. QRSTprofile ");
        System.out.println("Enter 3 for Mr. RSTU profile ");
        System.out.println("Enter 4 for Mr. STUV profile ");
        System.out.println("Enter 5 for Mr. TUVW profile ");
        System.out.println("Enter 6 for Mr. UVWX profile ");
        System.out.println("Enter 7 for Mr. VWXY profile ");
        System.out.println("Enter 8 for Mr. WXYZ profile ");
        System.out.println("Enter 9 for Mr. XYZA profile ");
        System.out.println("Enter 10 for Mr. YZAB profile \n");

        // Here You can choose the profile of Waiters.
        Scanner sc2 = new Scanner(System.in);
        int waiter = sc2.nextInt();
        switch(waiter){
          case 1:
            System.out.println("Name - Mr. PQRS");
            System.out.println("Age - 38 years");
            System.out.println("Working since - 6 years and 7 months");
            System.out.println("Salary = RS. 40000");
            System.out.println("Contact mail:- PQRS@gmail.com");
            break;
          case 2:
            System.out.println("Name - Mr. QRST");
            System.out.println("Age - 28 years");
            System.out.println("Working since - 1 years and 9 months");
            System.out.println("Salary = RS. 25000");
            System.out.println("Contact mail:- QRST@gmail.com");
            break;
          case 3:
            System.out.println("Name - Mr. RSTU");
            System.out.println("Age - 20 years");
            System.out.println("Working since - 0 Years 6 months");
            System.out.println("Salary = RS. 15000");
            System.out.println("Contact mail:- RSTU@gmail.com");
            break;
          case 4:
            System.out.println("Name - Mr. STUV");
            System.out.println("Age - 33 years");
            System.out.println("Working since - 3 years and 2 months");
            System.out.println("Salary = RS. 33500");
            System.out.println("Contact mail:- STUV@gmail.com");
            break;
          case 5:
            System.out.println("Name - Mr. TUVW");
            System.out.println("Age - 29 years");
            System.out.println("Working since - 2 years");
            System.out.println("Salary = RS. 31000");
            System.out.println("Contact mail:- TUVW@gmail.com");
            break;
          case 6:
            System.out.println("Name - Mr. UVWX");
            System.out.println("Age - 23 years");
            System.out.println("Working since - 0 years and 3 months");
            System.out.println("Salary = RS. 12000");
            System.out.println("Contact mail:- UVWX@gmail.com");
            break;
          case 7:
            System.out.println("Name - Mr. VWXY");
            System.out.println("Age - 35 years");
            System.out.println("Working since - 3 years and 5 months");
            System.out.println("Salary = RS. 38500");
            System.out.println("Contact mail:- VWXY@gmail.com");
            break;
          case 8:
            System.out.println("Name - Mr. WXYZ");
            System.out.println("Age - 29 years");
            System.out.println("Working since - 4 years and 5 months");
            System.out.println("Salary = RS. 34500");
            System.out.println("Contact mail:- WXYZ@gmail.com");
            break;
          case 9:
            System.out.println("Name - Mr. XYZA");
            System.out.println("Age - 18 years");
            System.out.println("Working since - 0 years and 1 months");
            System.out.println("Salary = RS. 15000");
            System.out.println("Contact mail:- XYZA@gmail.com");
            break;
          case 10:
            System.out.println("Name - Mr. YZAB");
            System.out.println("Age - 46 years");
            System.out.println("Working since - 3 years and 7 months");
            System.out.println("Salary = RS. 37500");
            System.out.println("Contact mail:- YZAB@gmail.com");
            break;
          default:
            System.out.println("SORRY! Wrong Input");
            break;
        }
        break;

      // *** Security Guard ***
      case 3:
        System.out.println("Scurity Guard\n");
        System.out.println("Enter Scurity Guard choice profile\n");

        // These are the list of Security Guards.
        System.out.println("Enter 1 for Rakesh Kumar profile ");
        System.out.println("Enter 2 for Aryan Sharma ");
        System.out.println("Enter 3 for Gautam Singh \n");

        // Here You can choose the profile of Security Guards.
        Scanner sc3 = new Scanner(System.in);
        int guard = sc3.nextInt();
        switch(guard){
          case 1:
            System.out.println("Name - Rakesh Kumar");
            System.out.println("Age - 39 years");
            System.out.println("Working since - 5 years and 4 months");
            System.out.println("Salary = RS. 20000");
            System.out.println("Contact mail:- NA");
            break;
          case 2:
            System.out.println("Name - Aryan Sharma");
            System.out.println("Age - 35 years");
            System.out.println("Working since - 4 years and 3 months");
            System.out.println("Salary = RS. 18000");
            System.out.println("Contact mail:- NA");
            break;
          case 3:
            System.out.println("Name - Gautam Singh");
            System.out.println("Age - 30 years");
            System.out.println("Working since - 2 years and 3 months");
            System.out.println("Salary = RS. 15000");
            System.out.println("Contact mail:- NA");
            break;
          default:
            System.out.println("SORRY! Wrong input");
            break;
        }
        break;

      // *** Room CLeaner ***
      case 4:
        System.out.println("Room Cleaner\n");
        System.out.println("Enter choice of room cleaner profile\n");

        // These are the list of Room Cleaners.
        System.out.println("Enter 1 for Ravindra Kumar profile ");
        System.out.println("Enter 2 for Raju Srivastav profile ");
        System.out.println("Enter 3 for Ramu Singh profile \n");

        // Here You can choose the profile of Room cleaners.
        Scanner sc4 = new Scanner(System.in);
        int cleaner = sc4.nextInt();
        switch(cleaner){
          case 1:
            System.out.println("Name - Ravindra Kumar");
            System.out.println("Age - 37 years");
            System.out.println("Working since - 2 years and 4 months");
            System.out.println("Salary = RS. 11000");
            System.out.println("Contact mail:- NA");
            break;
          case 2:
            System.out.println("Name - Raju srivastav");
            System.out.println("Age - 39 years");
            System.out.println("Working since - 3 years and 3 months");
            System.out.println("Salary = RS. 13000");
            System.out.println("Contact mail:- NA");
            break;
          case 3:
            System.out.println("Name - Ramu Singh");
            System.out.println("Age - 42 years");
            System.out.println("Working since - 2 years and 3 months");
            System.out.println("Salary = RS. 12000");
            System.out.println("Contact mail:- NA");
            break;
          default:
            System.out.println("SORRY! Wrong Input");
            break;
        }
        break;

      // *** Cashier ***
      case 5:
        System.out.println("Cashier\n");
        System.out.println("Enter Cashier Profile\n");

        // These are the list of Cashier's.
        System.out.println("Enter 1 for Mr. XYZ profile ");
        System.out.println("Enter 2 for Mr. YST profile ");
        System.out.println("Enter 3 for Mr. VWX profile \n");

        // Here You can choose the Cashier's profile
        Scanner sc5 = new Scanner(System.in);
        int cashier = sc5.nextInt();
        switch(cashier){
          case 1:
            System.out.println("Name - Mr. XYZ");
            System.out.println("Age - 25 years");
            System.out.println("Working since - 2 years and 4 months");
            System.out.println("Salary = RS. 30000");
            System.out.println("Contact mail:- XYZ@gmail.com");
            break;
          case 2:
            System.out.println("Name - Mr. YST");
            System.out.println("Age - 23 years");
            System.out.println("Working since - 1 years and 1 months");
            System.out.println("Salary = RS. 26000");
          System.out.println("Contact mail:- YST@gmail.com");
            break;
          case 3:
            System.out.println("Name - Mr. VWX");
            System.out.println("Age - 31 years");
            System.out.println("Working since - 4 years and 3 months");
            System.out.println("Salary = RS. 33000");
            System.out.println("Contact mail:- VWX@gmail.com");
            break;
          default:
            System.out.println("SORRY! Wrong Input");
            break;
        }
        break;

        // If Your input don't matches, then default case will execute.
      default:
        System.out.println("Wrong Choice");
        break;
    }
  }
}
