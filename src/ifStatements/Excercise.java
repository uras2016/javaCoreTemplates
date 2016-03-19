package ifStatements;


import javax.swing.*;


public class Excercise {

    public static void main(String[] args) {

        System.out.print("Enter your age:");
        String number = JOptionPane.showInputDialog("Enter your age:");
        System.out.println(number);

        int digit = Integer.parseInt(number);
        System.out.println(" ");

        if (digit >= 0 && digit <=10) {
            System.out.println( digit + "is between 0 and 10");
        }
        else if (digit >= 11 && digit <=20) {
            System.out.println( digit + "is between 11 and 20");
        }
        else if (digit >= 21 && digit <30) {
            System.out.println( digit + "is between 21 and 30");
        }
        else if (digit >=30) {
            System.out.println("You are 30 or over");
        }


    }
}