// import java.util.*;
import java.util.Scanner; // Java package used for taking input in java

// Declaration of menu class
public class menu{  
  int cost;
  String order;
  String Total_order = "";
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
            for(int i = 1; i <= 10; i++){
            System.out.println("Enter Your Starter Choices\n");
            
            // Here You can choose the Starter food
            System.out.println("Enter 1 for Tandoori Chicken - ₹ 110 ");
            System.out.println("Enter 2 for Chicken Tikka - ₹ 185 ");
            System.out.println("Enter 3 for Plain Tangri Kabab - ₹ 215 ");
            System.out.println("Enter 4 for Fish Tikka - ₹ 160 ");
            System.out.println("Enter 5 for Onion Pakora - ₹ 60 ");
            System.out.println("Enter 6 for Mattar Tikki - ₹ 70 ");
            System.out.println("Enter 7 for Paneer Pakora - ₹ 100 ");
            System.out.println("Enter 8 for Egg Pakora - ₹ 90 ");
            System.out.println("Enter 9 for Chicken Pakora - ₹ 115 ");
            System.out.println("Enter 10 for Afghani Chicekn - ₹ 175 ");
            System.out.println("Enter 99 for exit");

            Scanner sc0 = new Scanner(System.in);
            int starter = sc0.nextInt();
            
            switch(starter){
              case 1:
                System.out.println("Tandoori Chicken - ₹ 110 \n");
                order = "Tandoori Chicken - ₹ 110";
                cost = 110;
                break;
              case 2:
                System.out.println("Chicken Tikka - ₹ 185\n");
                order = "Chicken Tikka - ₹ 185";
                cost = 185;
                break;
              case 3:
                System.out.println("Plain Tangri Kabab - ₹ 215\n");
                order = "Plain Tangri Kabab - ₹ 215";
                cost = 215;
                break;
              case 4:
                System.out.println("Fish Tikka - ₹ 160\n");
                order = "Fish Tikka - ₹ 160";
                cost = 160;
                break;
              case 5:
                System.out.println("Onion Pakora - ₹ 60\n");
                order = "Onion Pakora - ₹ 60";
                cost = 60;
                break;
              case 6:
                System.out.println("Mattar Tikki - ₹ 70\n");
                order = "Mattar Tikki - ₹ 70";
                cost = 70;
                break;
              case 7:
                System.out.println("Paneer Pakora - ₹ 100\n");
                order = "Paneer Pakora - ₹ 100";
                cost = 100;
                break;
              case 8:
                System.out.println("Egg Pakora - ₹ 90\n");
                order = "Egg Pakora - ₹ 90";
                cost = 90;
                break;
              case 9:
                System.out.println("Chicken Pakora - ₹ 115\n");
                order = "Chicken Pakora - ₹ 115";
                cost = 115;
                break;
              case 10:
                System.out.println("Afghani Chicekn - ₹ 175\n");
                order = "Afghani Chicekn - ₹ 175";
                cost = 175;
                break;
              default:
                System.out.println("\n\n    Thanks For Coming!    \n");
                order = "";
                cost = 0;
                break;
            }
            if(starter == 99){
              System.out.println("Your orders are:- \n" + Total_order + "\n");
              System.out.println("Your Total Cost is :- ₹ " + Total_Cost + "\n");
              break;
            }
            else{
              Total_Cost = Total_Cost + cost;
              Total_order = Total_order + "\n" + order;
            }
            System.out.println("Your orders are:- \n"  + Total_order + "\n");
            System.out.println("Your Total Cost is :- ₹ " + Total_Cost + "\n");
            
          }
            // Here You can choose the Vegetarian food.
            break;
          case 2:
            System.out.println("Veg");

            for(int i = 1; i <= 10; i++){

            System.out.println("Select Your Food\n");

            System.out.println("Enter 1 for Plain Rice - ₹ 70 ");
            System.out.println("Enter 2 for Paneer Parantha - ₹ 55 ");
            System.out.println("Enter 3 for Gobhi Parantha - ₹ 45 ");
            System.out.println("Enter 4 for Chhola Bhatura - ₹ 40 ");
            System.out.println("Enter 5 for Daal Makhani - ₹ 110 ");
            System.out.println("Enter 6 for Jalebi - ₹ 60 ");
            System.out.println("Enter 7 for Kadhai Paneer - ₹ 200 ");
            System.out.println("Enter 8 for Malai Kopta - ₹ 210 ");
            System.out.println("Enter 9 for Matar Paneer - ₹ 195 ");
            System.out.println("Enter 10 for  Mix Veg - ₹ 175 ");
            System.out.println("Enter 99 for exit");

            int veg = sc.nextInt();
            switch(veg){
              case 1:
                System.out.println("Plain Rice - ₹ 70 ");
                order = "Plain Rice - ₹ 70";
                cost = 70;
                break;
              case 2:
                System.out.println("Paneer Parantha - ₹ 55");
                order = "Paneer Parantha - ₹ 55";
                cost = 55;
                break;
              case 3:
                System.out.println("Gobhi Parantha - ₹ 45");
                order =  "Gobhi Parantha - ₹ 45";
                cost = 45;
                break;
              case 4:
                System.out.println("Chhola Bhatura - ₹ 40");
                order = "Chhola Bhatura - ₹ 40";
                cost = 40;
                break;
              case 5:
                System.out.println("Daal Makhani - ₹ 110");
                order = "Daal Makhani - ₹ 110";
                cost = 110;
                break;
              case 6:
                System.out.println("Jalebi - ₹ 60");
                order = "Jalebi - ₹ 60";
                cost = 60;
                break;
              case 7:
                System.out.println("Kadhai Paneer - ₹ 200");
                order = "Kadhai Paneer - ₹ 200";
                cost = 200;
                break;
              case 8:
                System.out.println("Malai Kopta - ₹ 210");
                order = "Malai Kopta - ₹ 210";
                cost = 210;
                break;
              case 9:
                System.out.println("Matar Paneer - ₹ 195");
                order = "Matar Paneer - ₹ 195";
                cost = 195;
                break;
              case 10:
                System.out.println("Mix Veg - ₹ 175");
                order = "Mix Veg - ₹ 175";
                cost = 175;
                break;
              default:
                System.out.println(" Invalid Entry ");
                cost = 0;
                order = "";
                break;
            }
            if(veg == 99){
              System.out.println("Your orders are:- \n" + Total_order + "\n");
              System.out.println("Your Total Cost is :- ₹ " + Total_Cost + "\n");
              break;
            }
            else{
              Total_Cost = Total_Cost + cost;
              Total_order = Total_order + "\n" + order;
            }
            System.out.println("Your orders are:- \n"  + Total_order + "\n");
            System.out.println("Your Total Cost is :- ₹ " + Total_Cost + "\n");
            
          }
            break;
          // Here You can choose the Non Vegetarian food.
          case 3:
            System.out.println("   Non-Veg  ");

            for(int i = 1; i <= 10; i++){

            System.out.println("Enter Your Nonveg Choices\n");

            System.out.println("Enter 1 for Chicken Rice - ₹ 80 ");
            System.out.println("Enter 2 for Chicken Butter Masala - ₹ 255 ");
            System.out.println("Enter 3 for Hyderabadi Chicken - ₹ 275 ");
            System.out.println("Enter 4 for Chicken Kabab - ₹ 110 ");
            System.out.println("Enter 5 for Mutton - ₹ 460 ");
            System.out.println("Enter 6 for Dehati Chicken - ₹ 320 ");
            System.out.println("Enter 7 for Chicken tandoori - ₹ 200 ");
            System.out.println("Enter 8 for Kadhai Chicken - ₹ 210 ");
            System.out.println("Enter 9 for Fish - ₹ 195 ");
            System.out.println("Enter 10 for Egg Curry - ₹ 105 ");
            System.out.println("Enter 99 for exit");

            Scanner sc1 = new Scanner(System.in);
            int nonveg = sc1.nextInt();
            switch(nonveg){
              case 1:
                System.out.println("Chicken Rice - ₹ 80 ");
                order = "Chicken Rice - ₹ 80";
                cost = 80;
                break;
              case 2:
                System.out.println("Chicken Butter Masala - ₹ 255");
                order = "Chicken Butter Masala - ₹ 255";
                cost = 255;
                break;
              case 3:
                System.out.println("Hyderabadi Chicken - ₹ 275");
                order = "Hyderabadi Chicken - ₹ 275";
                cost = 275;
                break;
              case 4:
                System.out.println("Chicken Kabab - ₹ 110");
                order = "Chicken Kabab - ₹ 110";
                cost = 110;
                break;
              case 5:
                System.out.println("Mutton - ₹ 460");
                order = "Mutton - ₹ 460";
                cost = 460;
                break;
              case 6:
                System.out.println("Dehati Chicken - ₹ 320");
                order = "Dehati Chicken - ₹ 320";
                cost = 320;
                break;
              case 7:
                System.out.println("Chicken tandoori - ₹ 200");
                order = "Chicken tandoori - ₹ 200";
                cost = 200;
                break;
              case 8:
                System.out.println("Kadhai Chicken - ₹ 210");
                order = "Kadhai Chicken - ₹ 210";
                cost = 210;
                break;
              case 9:
                System.out.println("Fish - ₹ 195");
                order = "Fish - ₹ 195";
                cost = 195;
                break;
              case 10:
                System.out.println("Egg Curry - ₹ 105");
                order = "Egg Curry - ₹ 105";
                cost = 105;
                break;
              default:
                System.out.println("Invalid Entry ");
                order = "";
                cost = 0;
                break;
            }
            if(nonveg == 99){
              System.out.println("Your orders are:- \n" + Total_order + "\n");
              System.out.println("Your Total Cost is :- ₹ " + Total_Cost + "\n");
              break;
            }
            else{
              Total_Cost = Total_Cost + cost;
              Total_order = Total_order + "\n" + order;
            }
            System.out.println("Your orders are:- \n"  + Total_order + "\n");
            System.out.println("Your Total Cost is :- ₹ " + Total_Cost + "\n");
            
          }
            break;

            // Here You can choose the Desserts.
          case 4:
            System.out.println("Desserts");

            for(int i = 1; i <= 10; i++){

            System.out.println("Enter Your Deserts Choices\n");

            System.out.println("Enter 1 for Gulab Jamun - ₹ 20 ");
            System.out.println("Enter 2 for Kaju ki Barfi - ₹ 25 ");
            System.out.println("Enter 3 for Gajar ka halwa - ₹ 45 ");
            System.out.println("Enter 4 for Sandesh - ₹ 40 ");
            System.out.println("Enter 5 for Modak - ₹ 10 ");
            System.out.println("Enter 6 for Aam Shrikhand - ₹ 30 ");
            System.out.println("Enter 7 for Malai Ghevar - ₹ 40 ");
            System.out.println("Enter 8 for Besan ka ladoo - ₹ 10 ");
            System.out.println("Enter 9 for Rassogula - ₹ 25 ");
            System.out.println("Enter 10 for Rasmalai - ₹ 25 ");
            System.out.println("Enter 99 for exit");


            Scanner sc2 = new Scanner(System.in);
            int desserts = sc2.nextInt();
            switch(desserts){
              case 1:
                System.out.println("Gulab Jamun - ₹ 20 ");
                order = "Gulab Jamun - ₹ 20";
                cost = 20;
                break;
              case 2:
                System.out.println("Kaju ki Barfi - ₹ 25");
                order = "Kaju ki Barfi - ₹ 25";
                cost = 25;
                break;
              case 3:
                System.out.println("Gajar ka halwa - ₹ 45");
                order = "Gajar ka halwa - ₹ 45";
                cost = 45;
                break;
              case 4:
                System.out.println("Sandesh - ₹ 40");
                order = "Sandesh - ₹ 40";
                cost = 40;
                break;
              case 5:
                System.out.println("Modak - ₹ 10");
                order = "Modak - ₹ 10";
                cost = 10;
                break;
              case 6:
                System.out.println("Aam Shrikhand - ₹ 30");
                order = "Aam Shrikhand - ₹ 30";
                cost = 30;
                break;
              case 7:
                System.out.println("Malai Ghevar - ₹ 40");
                order = "Malai Ghevar - ₹ 40";
                cost = 40;
                break;
              case 8:
                System.out.println("Besan ka ladoo - ₹ 10");
                order = "Besan ka ladoo - ₹ 10";
                cost = 10;
                break;
              case 9:
                System.out.println("Rassogula - ₹ 25");
                order = "Rassogula - ₹ 25";
                cost = 25;
                break;
              case 10:
                System.out.println("Rasmalai - ₹ 25");
                order = "Rasmalai - ₹ 25";
                cost = 25;
                break;
              default:
                System.out.println(" Invalid Entry ");
                order ="";
                cost = 0;
                break;
            }
            if(desserts == 99){
              System.out.println("Your orders are:- \n" + Total_order + "\n");
              System.out.println("Your Total Cost is :- ₹ " + Total_Cost + "\n");
              break;
            }
            else{
              Total_Cost = Total_Cost + cost;
              Total_order = Total_order + "\n" + order;
            }
            System.out.println("Your orders are:- \n"  + Total_order + "\n");
            System.out.println("Your Total Cost is :- ₹ " + Total_Cost + "\n");
            
          }
            break;

            // Here You can choose the Beverages to drink
          case 5:
            System.out.println("Beverages");

            for(int i = 1; i <= 10; i++){

            System.out.println("Enter Your Beverages Choices\n");

            System.out.println("Enter 1 for Mango shake - ₹ 50 ");
            System.out.println("Enter 2 for Badam shake - ₹ 45 ");
            System.out.println("Enter 3 for Kaju shake - ₹ 50 ");
            System.out.println("Enter 4 for Butterscotch Milkshake - ₹ 40 ");
            System.out.println("Enter 5 for Fresh Lime Soda - ₹ 20 ");
            System.out.println("Enter 6 for Sprite - ₹ 40 ");
            System.out.println("Enter 7 for Cocacola - ₹ 45 ");
            System.out.println("Enter 8 for Maza - ₹ 40 ");
            System.out.println("Enter 9 for Pepsi - ₹ 45 ");
            System.out.println("Enter 10 for Cold COffee - ₹ 132 ");
            System.out.println("Enter 99 for exit");

            Scanner sc3 = new Scanner(System.in);
            int beverages = sc3.nextInt();
            switch(beverages){
              case 1:
                System.out.println("Mango shake - ₹ 50 ");
                order = "Mango shake - ₹ 50";
                cost = 50;
                break;
              case 2:
                System.out.println("Badam shake - ₹ 45");
                order = "Badam shake - ₹ 45";
                cost = 45;
                break;
              case 3:
                System.out.println("Kaju shake - ₹ 50");
                order = "Kaju shake - ₹ 50";
                cost = 50;
                break;
              case 4:
                System.out.println("Butterscotch Milkshake - ₹ 40");
                order = "Butterscotch Milkshake - ₹ 40";
                cost = 40;
                break;
              case 5:
                System.out.println("Fresh Lime Soda - ₹ 20");
                order = "Fresh Lime Soda - ₹ 20";
                cost = 20;
                break;
              case 6:
                System.out.println("Sprite - ₹ 40");
                order = "Sprite - ₹ 40";
                cost = 40;
                break;
              case 7:
                System.out.println("Cocacola - ₹ 45");
                order = "Cocacola - ₹ 45";
                cost = 45;
                break;
              case 8:
                System.out.println("Maza - ₹ 40");
                order = "Maza - ₹ 40";
                cost = 40;
                break;
              case 9:
                System.out.println("Pepsi - ₹ 45");
                order = "Pepsi - ₹ 45";
                cost = 45;
                break;
              case 10:
                System.out.println("Cold COffee - ₹ 132");
                order = "Cold COffee - ₹ 132";
                cost = 132;
                break;
              default:
                System.out.println("Invalid Entry ");
                order = "";
                cost = 0;
                break;
            }
            if(beverages == 99){
              System.out.println("Your orders are:- \n" + Total_order + "\n");
              System.out.println("Your Total Cost is :- ₹ " + Total_Cost + "\n");
              break;
            }
            else{
              Total_Cost = Total_Cost + cost;
              Total_order = Total_order + "\n" + order;
            }
            System.out.println("Your orders are:- \n"  + Total_order + "\n");
            System.out.println("Your Total Cost is :- ₹ " + Total_Cost + "\n");
            
          }
            break;

            // Here You can choose the fast food.
          case 6:
            System.out.println("  Fast Food  ");

            for(int i = 1; i <= 10; i++){

            System.out.println("Enter Your Choices for Fastfood\n");

            System.out.println("Enter 1 for Noodles - ₹ 70 ");
            System.out.println("Enter 2 for Momos - ₹ 55 ");
            System.out.println("Enter 3 for Chicken Chilly - ₹ 45 ");
            System.out.println("Enter 4 for Egg Roll - ₹ 40 ");
            System.out.println("Enter 5 for Paneer Roll - ₹ 110 ");
            System.out.println("Enter 6 for Spring Roll - ₹ 60 ");
            System.out.println("Enter 7 for Burger - ₹ 200 ");
            System.out.println("Enter 8 for Pizza - ₹ 210 ");
            System.out.println("Enter 9 for Hot Dog - ₹ 195 ");
            System.out.println("Enter 10 for Sandwich - ₹ 175 ");
            System.out.println("Enter 99 for exit");

            Scanner sc4 = new Scanner(System.in);
            int fast_food = sc4.nextInt();
            switch(fast_food){
              case 1:
                System.out.println("Noodles - ₹ 70 ");
                order = "Noodles - ₹ 70";
                cost = 70;
                break;
              case 2:
                System.out.println("Momos - ₹ 55");
                order = "Momos - ₹ 55";
                cost = 55;
                break;
              case 3:
                System.out.println("Chicken Chilly - ₹ 45");
                order = "Chicken Chilly - ₹ 45";
                cost = 45;
                break;
              case 4:
                System.out.println("Egg Roll - ₹ 40");
                order = "Egg Roll - ₹ 40";
                cost = 40;
                break;
              case 5:
                System.out.println("Paneer Roll - ₹ 110");
                order = "Paneer Roll - ₹ 110";
                cost = 110;
                break;
              case 6:
                System.out.println("Spring Roll - ₹ 60");
                order = "Spring Roll - ₹ 60";
                cost = 60;
                break;
              case 7:
                System.out.println("Burger - ₹ 200");
                order = "Burger - ₹ 200";
                cost = 200;
                break;
              case 8:
                System.out.println("Pizza - ₹ 210");
                order = "Pizza - ₹ 210";
                cost = 210;
                break;
              case 9:
                System.out.println("Hot Dog - ₹ 195");
                order = "Hot Dog - ₹ 195";
                cost = 195;
                break;
              case 10:
                System.out.println("Sandwich - ₹ 175");
                order = "Sandwich - ₹ 175";
                cost = 175;
                break;
              default:
                System.out.println("Invalid Entry ");
                order = "";
                cost = 0;
                break;
            }
            if(fast_food == 99){
              System.out.println("Your orders are:- \n" + Total_order + "\n");
              System.out.println("Your Total Cost is :- ₹ " + Total_Cost + "\n");
              break;
            }
            else{
              Total_Cost = Total_Cost + cost;
              Total_order = Total_order + "\n" + order;
            }
            System.out.println("Your orders are:- \n"  + Total_order + "\n");
            System.out.println("Your Total Cost is :- ₹ " + Total_Cost + "\n");
            
          }
          break;
            // If wrong input entered, then it will show this default case
          default:
            System.out.println("Sorry! Wrong Input");
        } 
    }  
}