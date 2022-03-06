import java.util.*;
import java.util.Scanner;

public class menu{  
    public void Food() 
    {  
        System.out.println("Enter Your Choice"); 
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch(choice){
          case 1:
            System.out.println("Starter");
            System.out.println("Enter Your Starter Choices");
            Scanner sc0 = new Scanner(System.in);
            int starter = sc0.nextInt();
            switch(starter){
              case 1:
                System.out.println("Tandoori Chicken - ₹ 110 ");
                break;
              case 2:
                System.out.println(" Chicken Tikka - ₹ 185");
                break;
              case 3:
                System.out.println(" Plain Tangri Kabab - ₹ 215");
                break;
              case 4:
                System.out.println(" Fish Tikka - ₹ 160");
                break;
              case 5:
                System.out.println(" Onion Pakora - ₹ 60");
                break;
              case 6:
                System.out.println(" Mattar Tikki - ₹ 70");
                break;
              case 7:
                System.out.println(" Paneer Pakora - ₹ 100");
                break;
              case 8:
                System.out.println(" Egg Pakora - ₹ 90");
                break;
              case 9:
                System.out.println(" Chicken Pakora - ₹ 115");
                break;
              case 10:
                System.out.println(" Afghani Chicekn - ₹ 175");
                break;
              default:
                System.out.println(" Invalid Entry ");
                break;
            }
            break;
            
          case 2:
            System.out.println("Veg");

            System.out.println("Select Your Food");
            int food = sc.nextInt();
            switch(food){
              case 1:
                System.out.println("Plain Rice - ₹ 70 ");
                break;
              case 2:
                System.out.println(" Paneer Parantha - ₹ 55");
                break;
              case 3:
                System.out.println(" Gobhi Parantha - ₹ 45");
                break;
              case 4:
                System.out.println(" Chhola Bhatura - ₹ 40");
                break;
              case 5:
                System.out.println(" Daal Makhani - ₹ 110");
                break;
              case 6:
                System.out.println(" Jalebi - ₹ 60");
                break;
              case 7:
                System.out.println(" Kadhai Paneer - ₹ 200");
                break;
              case 8:
                System.out.println(" Malai Kopta - ₹ 210");
                break;
              case 9:
                System.out.println(" Matar Paneer - ₹ 195");
                break;
              case 10:
                System.out.println(" Mix Veg - ₹ 175");
                break;
              default:
                System.out.println(" Invalid Entry ");
                break;
            }
            break;
          
          case 3:
            System.out.println("   Non-Veg  ");
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
            break;
          case 4:
            System.out.println("Desserts");
            System.out.println("Enter Your Deserts Choices");
            Scanner sc2 = new Scanner(System.in);
            int desserts = sc.nextInt();
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
            break;
          case 5:
            System.out.println("Beverages");
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
            break;
          case 6:
            System.out.println("  Fast Food  ");
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
          default:
            System.out.println("Sorry! Wrong Input");
        } 
    }  
}