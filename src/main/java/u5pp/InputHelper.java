package u5pp;

import java.util.Scanner;
// constructor that creates a scanner //
public class InputHelper {
    // scanner
    private Scanner sc;
    // constructor scanner
    public  InputHelper(Scanner scanner){
        sc = scanner;
        

    }
// checks integer input//
    public int getIntegerInput(String prompt, int min, int max) {
        int minimum = min;
        int z ;
        int maximum = max;
        System.out.println(prompt);
        z= Integer.parseInt(sc.nextLine());
        //series of while loops//
        while (z < minimum) {
            System.out.println("Invalid input - too low. Please try again.");
            System.out.println(prompt);
            z= Integer.parseInt(sc.nextLine());
            
        }
        //while (z != )//
        return z;

    }
//checks yes no input//
    public boolean getYesNoInput(String prompt){
        String x = "l";
        System.out.println(prompt);
        x=sc.nextLine();
        while (x.equals("")){
            System.out.println("Invalid input - empty line. Please try again.");
            System.out.println(prompt);
            x=sc.nextLine();
        }
        while (!x.substring(0,1).equals("y") && !x.substring(0,1).equals("Y") && !x.substring(0,1).equals("n") && !x.substring(0,1).equals("N")) {
            System.out.println("Invalid input - does not start with \"y\" or \"n\". Please try again.");
            System.out.println(prompt);
            x=sc.nextLine();
        }
        if (x.substring(0,1).equals("y") || x.substring(0, 1).equals("Y")){
            return true;
        }
        if (x.substring(0,1).equals("n") || x.substring(0, 1).equals("N")){
            return false;
        }
        // so it runs//
        return true;
    }
    
}
