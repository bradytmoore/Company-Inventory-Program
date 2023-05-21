import java.util.ArrayList;
import java.text.DecimalFormat;

public class Camping
{



   Gear[] Gear = new Gear[10]; //assigning gear size "10"
   int counter = 0; //initializing counter for average cost
   String storeName;



   public Camping() { //assinging storename to empty constructor

      storeName = "";
   }

   public Camping(String s){
      setStoreName(s);
   }

   private void setStoreName(String s){

      storeName = s;
   }
   public void addGear (String n, double c, String d) {

         Gear[counter] = new Gear(n, c, d);
         counter++;

   }
   public void printAll(){

         System.out.println("Welcome to:" + storeName);
         for(int i = 0; i < counter; i++)
         {
                  System.out.println("Gear: " + Gear[i]); //pulling from all gear items in array
         }
   }

   public void campingAvg(){

      //assigning cost,sum, and totalAvg to values

      double cost= 000.00;
      double sum = 000.00;
      double totalAvg = 000.00;


      for(int i = 0; i < counter; i++)
      {

         //equation for finding average cost of all gear

         cost = Gear[i].getCost();
         sum = cost +sum;
      }

      totalAvg = sum / counter;

      DecimalFormat deform = new DecimalFormat("#.00");
      System.out.println("The average cost of the gear is " + "$" + deform.format(totalAvg)); //formating the output of gear cost to not include 3rd "0"
      System.out.println("");
   }


}











