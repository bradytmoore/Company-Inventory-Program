

public class Gear {
    private String description;
    private double cost;
    private String name;

//constructors for Gear method

    public Gear() {

        name = ""; //empty constructor variables for items in the array in driver class
        cost = 0.0;
        description = "";
    }
    public Gear(String n,double c, String d) {
        setName(n); //nonempty constructor variables for items in the array in driver class
        setCost(c);
        setDescription(d);

        //next 3 methods are assigning name, description, and cost to n,d, and c for formatting later
    }
    public void setName(String n){
        name = n;
    }

    public void setCost(double c){
        cost = c;
    }
    public void setDescription(String d) {
        description = d;
    }

    //getting value stored in the class for next 3 methods
    public String getName(){
        return name;
    }

    public double getCost(){
        return cost;
    }

    public String getDescription(){
        return description;
    }
    //Using toString to format how the variables in the array are displayed
    public String toString(){

        String str = "[Name: " + name + "]" + "[ Cost: " + cost + "]" + "[ Description:" + description + "]";

        return str;

    }


}
