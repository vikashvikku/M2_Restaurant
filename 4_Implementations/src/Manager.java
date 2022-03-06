// import java.util.*;
import java.util.Scanner; // Java package used for taking input in java

// Declaration of Manager class
public class Manager {

  // Declaration of nmanager method.
  public void manager(){
    System.out.println("Welcome Manager");
    System.out.println("Enter Your Choice whom profile You want to see");
    Scanner sc = new Scanner(System.in);
    int choice = sc.nextInt();
    // Here You can choose the employee profile
    switch(choice){
      case 1:
        System.out.println("Master Chef");
        System.out.println("Enter the person profile");
        Scanner sc1 = new Scanner(System.in);
        int masterchef = sc1.nextInt();
        // Here You can select the profile of the Masterchefs.
        switch(masterchef){
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
            System.out.println("Wrong Input");
        }
        break;

        // Here You can choose the profile of Waiters.
      case 2:
        System.out.println("Waiter");
        System.out.println("Enter the Waiter profile");
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
            System.out.println("Working since - 6 months");
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
          default:
            System.out.println("Wrong Input");
            break;
        }
        break;

        // Here You can choose the profile of Security Guards.
      case 3:
        System.out.println("Scurity Guard");
        System.out.println("Enter Scurity Guard choice profile");
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
            System.out.println("Wrong Choice");
            break;
        }
        break;

        // Here You can choose the profile of Room cleaners.
      case 4:
        System.out.println("Room Cleaner");
        System.out.println("Enter choice of room cleaner profile");
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
            System.out.println("Wrong Choice");
            break;
        }
        break;

        // Here You can choose the Cashier's profile
      case 5:
        System.out.println("Cashier");
        System.out.println("Enter Cashier Profile");
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
            System.out.println("Wrong Choice");
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
