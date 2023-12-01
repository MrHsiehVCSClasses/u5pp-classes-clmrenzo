package u5pp;

public class Card {
    private String value = "2";
    private String suit = "clubs";

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

    public String getValue(){
        return value;
    }

    public String getSuit(){
        return suit;
    }

    public String toString(){
        return "The "+ getValue() + " of " + getSuit();
    }

    public boolean equals (Card c){
        if (this.getValue().equals(c.getValue()) && this.getSuit().equals(c.getSuit())){
            return true;
        }
        else {
            return false;
        }
    }

    public void changeSuit(String changeSuit){
        if (changeSuit.toLowerCase().equals("clubs") || changeSuit.toLowerCase().equals("spades") || changeSuit.toLowerCase().equals("hearts") || changeSuit.toLowerCase().equals("diamonds")){
            suit = changeSuit.toLowerCase();
        }
    }
    
}