/*
Name: Brady Moore
Current Date: 9/16/2021
Sources Consulted:

https://www.w3schools.com/java/java_class_attributes.asp
^ Java Class Attributes

https://stackoverflow.com/questions/8098601/java-count-occurrence-of-each-item-in-an-array
^ Java Count Occurrence of Each Item in an Array

https://www.tutorialspoint.com/junit/junit_basic_usage.htm
^ For clarification on usage of JUnit testing

Course Notes

By submitting this work, I attest that it is my original work and that I did
not violate the University of Mississippi academic policies set forth in the
M book.
*/

import java.util.ArrayList;

public class P1Driver {


    public static void main(String[] args) {


//all below; hard coding for name, cost, and description for objects in array
        // used "camping1" due to program not compiling under "camping"

    ArrayList<Camping> camping = new ArrayList<Camping>();

    Camping camping1 = new Camping("Bear Creek Camping Store. Here is our current inventory");
    camping.add(camping1);
      camping1.addGear("Ozark Trail Tent", 650.15, "Tent that sleeps 9.");
      camping1.addGear("Maglite Cell Flashlight", 50.50, "3-Cell D Battery.");
      camping1.addGear("Magellan Outdoors Sleeping Bag", 90.10, "Rectangular sleeping bag.");
      camping1.addGear("Columbia Newton Ridge Hiking Boots", 150.15, "Great boots for extended hiking.");
      camping1.addGear("YETI Cooler", 215.20, "The best cooler for all climates.");
      camping1.addGear("Ust Aluminum Carabiner", 7.70, "Simple carabiner for your camping needs.");
      camping1.addGear("Nalgene Wide Water Bottle", 15.70, "32 oz plastic water bottle.");
      camping1.addGear("CamelBak Hydration Pack", 120.60, "Small backpack with water bladder.");
      camping1.addGear("Trekking Hiking Poles", 60.45, "3-Foot Hiking pole made of oak");
      camping1.addGear("REI Trailbreak Pack", 130.50, "Large-sized hiking pack with 12 compartments");
      System.out.println("");


        for(int i = 0; i < camping.size(); i++) { //finding size of "camping"




   }
        camping1.printAll(); //printing all name, cost, and descriptions for every object in array

        System.out.println();
        System.out.println("The amount of gear we have in stock is 10");
        System.out.println();






      camping1.campingAvg(); //printing average cost of all gear

        System.out.println("Thank you for shopping with us. Have a great day!");

    }
}