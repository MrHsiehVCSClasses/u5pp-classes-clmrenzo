package u5pp;

import java.util.Scanner;

public class InputHelper {
    // scanner
    private Scanner sc;
    // constructor scanner
    public  InputHelper(Scanner scanner){
        sc = scanner;
        

    }

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
