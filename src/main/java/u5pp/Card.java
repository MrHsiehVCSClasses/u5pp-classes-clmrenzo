package u5pp;

public class Card {
    //private instance variables//
    private String value = "2";
    private String suit = "clubs";
// creates card constructors//
    public Card(){
        value = "2";
        suit = "clubs";
    }

    public Card (String initSuit){
        value = "2";
        suit = initSuit;
    }
    
    public Card (String initSuit, String initValue){
        value = initValue;
        suit = initSuit;
    }
// accessors and getters//
    public String getValue(){
        return value;
    }

    public String getSuit(){
        return suit;
    }

    public String toString(){
        return "The "+ getValue() + " of " + getSuit();
    }
//boolean that chesks something cool//
    public boolean equals (Card c){
        if (this.getValue().equals(c.getValue()) && this.getSuit().equals(c.getSuit())){
            return true;
        }
        else {
            return false;
        }
    }
//changes suit//
    public void changeSuit(String changeSuit){
        if (changeSuit.toLowerCase().equals("clubs") || changeSuit.toLowerCase().equals("spades") || changeSuit.toLowerCase().equals("hearts") || changeSuit.toLowerCase().equals("diamonds")){
            suit = changeSuit.toLowerCase();
        }
    }
    //changes value//
    public void changeValue(String changeValue){
        changeValue = changeValue.toLowerCase();
        if (changeValue.equals("2") || changeValue.equals("3") ||changeValue.equals("4") || changeValue.equals("5") || changeValue.equals("6") || changeValue.equals("7") || changeValue.equals("8") || changeValue.equals("9") || changeValue.equals("10") || changeValue.equals("jack") || changeValue.equals("queen") || changeValue.equals("king") ||changeValue.equals("ace")){
            value = changeValue.toLowerCase();
        }
    
        else{
            
        }
    }
}