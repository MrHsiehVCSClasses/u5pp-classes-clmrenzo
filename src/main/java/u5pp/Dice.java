public class Dice
{
    private int numSides = 6;
    private int startingSide = 1;
    private String color = "green";


    public Dice (){
        numSides = 6;
        startingSide = 1;
        color= "green";
    }
    
    public Dice(int initSides){
        numSides = initSides;
        startingSide = 1;
        color = "green";
    }

    public Dice (int initSides, int initStartingSide ){
        numSides = initSides;
        startingSide = initStartingSide;
        color = "green";

    }

    public Dice (int initSides, int initStartingSide, String initColor){
        numSides = initSides;
        startingSide = initStartingSide;
        color = initColor;

    }
    public int getSides(){
        return numSides;
    }

    public int getCurrentSide(){
        return startingSide;
    }

    public String getColor(){
        return color;
    }

    public String toString(){
        System.out.println ()"The " + getColor() + getSides() + "- sided dice is showing" + getCurrentSide()) ;
    }
}

