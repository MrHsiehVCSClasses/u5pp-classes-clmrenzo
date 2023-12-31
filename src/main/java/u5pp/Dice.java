package u5pp;

public class Dice
{   
    //private instance variables//
    private int numSides = 6;
    private int startingSide = 1;
    private String curColor = "green";

    //constructs multiple dice constructors//
    public Dice (){
        numSides = 6;
        startingSide = 1;
        curColor= "green";
    }
    
    public Dice(int initSides){
        numSides = initSides;
        startingSide = 1;
        curColor = "green";
    }

    public Dice (int initSides, int initStartingSide ){
        numSides = initSides;
        startingSide = initStartingSide;
        curColor = "green";
        if (startingSide > numSides){
            startingSide = 1;
        }
    }

    public Dice (int initSides, int initStartingSide, String initColor){
        numSides = initSides;
        startingSide = initStartingSide;
        curColor = initColor;
        if (startingSide > numSides){
            startingSide = 1;
        }
    }
    //accessors and getters that return things about dice//
    public int getSides(){
        return numSides;
    }

    public int getCurrentSide(){
        return startingSide;
    }

    public String getColor(){
        return curColor;
    }
// returns a string that types a message about the color, sides and the side that is currently showing//
    public String toString(){
        return "The " + getColor() + " " + getSides() + "-sided dice is showing " + getCurrentSide() ;
    }
    public boolean equals(Dice d){
        if (d.getCurrentSide() == this.getCurrentSide()){
            return true;
        }
        else {
            return false;
        }
    }
    // randomly changes the side of the dice//
    public int roll(){
        startingSide = (int) (Math.random()* numSides )+ 1;
        return startingSide;
        
    }
    //changes side//
    public void changeSide(int num) {
        if (num > 1 && num < numSides){
            startingSide = num;
        }
    }
    //changes the amount of sides//
    public void changeNumSides(int num){
        numSides = num;
    }
    //changes color of dice//
    public void changeColor(String color){
        curColor = color;
    }
}

