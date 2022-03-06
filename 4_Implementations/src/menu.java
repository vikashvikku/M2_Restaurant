// import java.util.*;
import java.util.Scanner; // Java package used for taking input in java

// Declaration of menu class
public class menu{  
  int cost;
  int Total_Cost = 0;
    // Declaration of Food method in menu class
    public void Food() 
    {  
        System.out.println("Enter Your Choice\n"); 
        
        // Here You can choose which type of food you want
        System.out.println("Enter 1 for Starter ");
        System.out.println("Enter 2 for Veg ");
        System.out.println("Enter 3 for Non-Veg ");
        System.out.println("Enter 4 for Desserts ");
        System.out.println("Enter 5 for Beverages ");
        System.out.println("Enter 6 for Fast Food ");

         // Declaration and use of Scanner package.
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        // Declaration of switch statement
        switch(choice){
          case 1:
            System.out.println("Starter");
          // Starting for loop for Calculating menu with price.
            for(int i = 1; i <= 4; i++){
            System.out.println("Enter Your Starter Choices\n");
            
            // Here You can choose the Starter food
            System.out.println("Enter 1 for Tandoori Chicken ");
            System.out.println("Enter 2 for Chicken Tikka ");
            System.out.println("Enter 3 for Plain Tangri Kabab ");
            System.out.println("Enter 4 for Fish Tikka ");
            System.out.println("Enter 5 for Onion Pakora ");
            System.out.println("Enter 6 for Mattar Tikki ");
            System.out.println("Enter 7 for Paneer Pakora ");
            System.out.println("Enter 8 for Egg Pakora ");
            System.out.println("Enter 9 for Chicken Pakora ");
            System.out.println("Enter 10 for Afghani Chicekn ");
            Scanner sc0 = new Scanner(System.in);
            int starter = sc0.nextInt();
            
            switch(starter){
              case 1:
                System.out.println("Tandoori Chicken - ₹ 110 \n");
                cost = 110;
                break;
              case 2:
                System.out.println(" Chicken Tikka - ₹ 185\n");
                cost = 185;
                break;
              case 3:
                System.out.println(" Plain Tangri Kabab - ₹ 215\n");
                cost = 215;
                break;
              case 4:
                System.out.println(" Fish Tikka - ₹ 160\n");
                cost = 160;
                break;
              case 5:
                System.out.println(" Onion Pakora - ₹ 60\n");
                cost = 60;
                break;
              case 6:
                System.out.println(" Mattar Tikki - ₹ 70\n");
                cost = 70;
                break;
              case 7:
                System.out.println(" Paneer Pakora - ₹ 100\n");
                cost = 100;
                break;
              case 8:
                System.out.println(" Egg Pakora - ₹ 90\n");
                cost = 90;
                break;
              case 9:
                System.out.println(" Chicken Pakora - ₹ 115\n");
                cost = 115;
                break;
              case 10:
                System.out.println(" Afghani Chicekn - ₹ 175\n");
                cost = 175;
                break;
              default:
                System.out.println(" Thanks For Coming! \n");
                cost = 0;
                break;
            }
            if(starter==99){
              System.out.println("Your Total Cost is :- ₹ " + Total_Cost + "\n");
              break;
            }
            else{
              Total_Cost = Total_Cost + cost;
            }
            System.out.println("Your Total Cost is :- ₹ " + Total_Cost + "\n");
          }
            // Here You can choose the Vegetarian food.
            break;
          case 2:
            System.out.println("Veg");

            for(int i = 1; i <= 4; i++){

            System.out.println("Select Your Food");
            int veg = sc.nextInt();
            switch(veg){
              case 1:
                System.out.println("Plain Rice - ₹ 70 ");
                cost = 70;
                break;
              case 2:
                System.out.println(" Paneer Parantha - ₹ 55");
                cost = 55;
                break;
              case 3:
                System.out.println(" Gobhi Parantha - ₹ 45");
                cost = 45;
                break;
              case 4:
                System.out.println(" Chhola Bhatura - ₹ 40");
                cost = 40;
                break;
              case 5:
                System.out.println(" Daal Makhani - ₹ 110");
                cost = 110;
                break;
              case 6:
                System.out.println(" Jalebi - ₹ 60");
                cost = 60;
                break;
              case 7:
                System.out.println(" Kadhai Paneer - ₹ 200");
                cost = 200;
                break;
              case 8:
                System.out.println(" Malai Kopta - ₹ 210");
                cost = 210;
                break;
              case 9:
                System.out.println(" Matar Paneer - ₹ 195");
                cost = 195;
                break;
              case 10:
                System.out.println(" Mix Veg - ₹ 175");
                cost = 175;
                break;
              default:
                System.out.println(" Invalid Entry ");
                cost = 0;
                break;
            }
            if(veg==99){
              System.out.println("Your Total Cost is :- ₹ " + Total_Cost + "\n");
              break;
            }
            else{
              Total_Cost = Total_Cost + cost;
            }
            System.out.println("Your Total Cost is :- ₹ " + Total_Cost + "\n");
          }
            break;
          // Here You can choose the Non Vegetarian food.
          case 3:
            System.out.println("   Non-Veg  ");

            for(int i = 1; i <= 4; i++){

            System.out.println("Enter Your Nonveg Choices");
            Scanner sc1 = new Scanner(System.in);
            int nonveg = sc1.nextInt();
            switch(nonveg){
              case 1:
                System.out.println("Chicken Rice - ₹ 80 ");
                break;
              case 2:
                System.out.println(" Chicken Butter Masala - ₹ 255");
                break;
              case 3:
                System.out.println(" Hyderabadi Chicken - ₹ 275");
                break;
              case 4:
                System.out.println(" Chicken Kabab - ₹ 110");
                break;
              case 5:
                System.out.println(" Mutton - ₹ 460");
                break;
              case 6:
                System.out.println(" Dehati Chicken - ₹ 320");
                break;
              case 7:
                System.out.println(" Chicken tandoori - ₹ 200");
                break;
              case 8:
                System.out.println(" Kadhai Chicken - ₹ 210");
                break;
              case 9:
                System.out.println(" Fish - ₹ 195");
                break;
              case 10:
                System.out.println(" Egg Curry - ₹ 105");
                break;
              default:
                System.out.println(" Invalid Entry ");
                break;
            }
            if(nonveg==99){
              System.out.println("Your Total Cost is :- ₹ " + Total_Cost + "\n");
              break;
            }
            else{
              Total_Cost = Total_Cost + cost;
            }
            System.out.println("Your Total Cost is :- ₹ " + Total_Cost + "\n");
          }
            break;

            // Here You can choose the Desserts.
          case 4:
            System.out.println("Desserts");

            for(int i = 1; i <= 4; i++){

            System.out.println("Enter Your Deserts Choices");
            Scanner sc2 = new Scanner(System.in);
            int desserts = sc2.nextInt();
            switch(desserts){
              case 1:
                System.out.println("Gulab Jamun - ₹ 20 ");
                break;
              case 2:
                System.out.println(" Kaju ki Barfi - ₹ 25");
                break;
              case 3:
                System.out.println(" Gajar ka halwa - ₹ 45");
                break;
              case 4:
                System.out.println(" Sandesh - ₹ 40");
                break;
              case 5:
                System.out.println(" Modak - ₹ 10");
                break;
              case 6:
                System.out.println(" Aam Shrikhand - ₹ 30");
                break;
              case 7:
                System.out.println(" Malai Ghevar - ₹ 40");
                break;
              case 8:
                System.out.println(" Besan ka ladoo - ₹ 10");
                break;
              case 9:
                System.out.println(" Rassogula - ₹ 25");
                break;
              case 10:
                System.out.println(" Rasmalai - ₹ 25");
                break;
              default:
                System.out.println(" Invalid Entry ");
                break;
            }
            if(desserts==99){
              System.out.println("Your Total Cost is :- ₹ " + Total_Cost + "\n");
              break;
            }
            else{
              Total_Cost = Total_Cost + cost;
            }
            System.out.println("Your Total Cost is :- ₹ " + Total_Cost + "\n");
          }
            break;

            // Here You can choose the Beverages to drink
          case 5:
            System.out.println("Beverages");

            for(int i = 1; i <= 4; i++){

            System.out.println("Enter Your Beverages Choices");
            Scanner sc3 = new Scanner(System.in);
            int beverages = sc3.nextInt();
            switch(beverages){
              case 1:
                System.out.println("Mango shake - ₹ 50 ");
                break;
              case 2:
                System.out.println(" Badam shake - ₹ 45");
                break;
              case 3:
                System.out.println(" Kaju shake - ₹ 50");
                break;
              case 4:
                System.out.println(" Butterscotch Milkshake - ₹ 40");
                break;
              case 5:
                System.out.println(" Fresh Lime Soda - ₹ 20");
                break;
              case 6:
                System.out.println(" Sprite - ₹ 40");
                break;
              case 7:
                System.out.println(" Cocacola - ₹ 45");
                break;
              case 8:
                System.out.println(" Maza - ₹ 40");
                break;
              case 9:
                System.out.println(" Pepsi - ₹ 45");
                break;
              case 10:
                System.out.println(" Cold COffee - ₹ 132");
                break;
              default:
                System.out.println(" Invalid Entry ");
                break;
            }
            if(beverages==99){
              System.out.println("Your Total Cost is :- ₹ " + Total_Cost + "\n");
              break;
            }
            else{
              Total_Cost = Total_Cost + cost;
            }
            System.out.println("Your Total Cost is :- ₹ " + Total_Cost + "\n");
          }
            break;

            // Here You can choose the fast food.
          case 6:
            System.out.println("  Fast Food  ");

            for(int i = 1; i <= 4; i++){

            System.out.println("Enter Your Choices for Fastfood");
            Scanner sc4 = new Scanner(System.in);
            int fast_food = sc4.nextInt();
            switch(fast_food){
              case 1:
                System.out.println("Noodles - ₹ 70 ");
                break;
              case 2:
                System.out.println(" Momos - ₹ 55");
                break;
              case 3:
                System.out.println(" Chicken Chilly - ₹ 45");
                break;
              case 4:
                System.out.println(" Egg Roll - ₹ 40");
                break;
              case 5:
                System.out.println(" Paneer Roll - ₹ 110");
                break;
              case 6:
                System.out.println(" Spring Roll - ₹ 60");
                break;
              case 7:
                System.out.println(" Burger - ₹ 200");
                break;
              case 8:
                System.out.println(" Pizza - ₹ 210");
                break;
              case 9:
                System.out.println(" Hot Dog - ₹ 195");
                break;
              case 10:
                System.out.println(" Sandwich - ₹ 175");
                break;
              default:
                System.out.println(" Invalid Entry ");
                break;
            }
            if(fast_food==99){
              System.out.println("Your Total Cost is :- ₹ " + Total_Cost + "\n");
              break;
            }
            else{
              Total_Cost = Total_Cost + cost;
            }
            System.out.println("Your Total Cost is :- ₹ " + Total_Cost + "\n");
          }
          break;
            // If wrong input entered, then it will show this default case
          default:
            System.out.println("Sorry! Wrong Input");
        } 
    }  
}