/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Luis Corona
 */
import java.util.Scanner;

public class App {

    static Scanner in = new Scanner(System.in);
    static final String wisconsin = "Wisconsin";
    static final String eauClaire = "Eau Claire";
    static final String dunn = "Dunn";
    static final String illinois = "Illinois";
    static final float illinoisTax = (float) .08;
    static final float wisconsinTax = (float) .05;

    public static void main(String[] args) {
        App app = new App();
        String order = app.readOrder();
        String state = app.readState();
        String county = app.readCounty();
        float output = app.createOutput(order);
        app.printOutput(output,state, county);
    }

    private void printOutput(float output, String state, String county) {
        if(state.equals(wisconsin)){
            if(county.equals(eauClaire)){
                String message = String.format("The tax is $%.2f.\n" + "The total is $%.2f.",
                        output*(.05+.005), output+(output*(.05+.005)));
                System.out.print(message);
                System.exit(0);
            }

            if(county.equals(dunn)){
                String message = String.format("The tax is $%.2f.\n" + "The total is $%.2f.",
                        output*(.05+.004), output+(output*(.05+.004)));
                System.out.print(message);
                System.exit(0);
            }
            else{
                String message = String.format("The tax is $%.2f.\n" + "The total is $%.2f.",
                        output*(.05), output+(output*(.05)));
                System.out.print(message);
                System.exit(0);
        }

        }
        if(state.equals(illinois)){
            String message = String.format("The tax is $%.2f.\n" + "The total is $%.2f.",
                    output*(.08), output+(output*(.08)));
            System.out.print(message);
            System.exit(0);
        }
        else{
            String message = String.format("The total is $%s.",
                    output);
            System.out.print(message);
            System.exit(0);
        }
        String message = String.format("The total is $%.2f", output);
        System.out.print(message);
    }

    private float createOutput(String order) {
        float orderInt = Float.parseFloat(order);
        return orderInt;
    }

    private String readOrder() {
        System.out.print("What is the order amount? ");
        String order = in.nextLine();
        return order;
    }

    private String readState() {
        System.out.print("What state do you live in? ");
        String state = in.nextLine();
        return state;
    }

    private String readCounty() {
        System.out.print("What county do you live in? ");
        String county = in.nextLine();
        return county;
    }
}



