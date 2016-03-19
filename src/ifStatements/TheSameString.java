package ifStatements;

import javax.swing.*;

public class TheSameString {
    public static void main(String[] args) {

      /*  String user_name = "Bill";
        if (user_name.equals("Bill")){
            //do something
        }*/

        System.out.print("Choose a color: Black, White, Red, Blue");
        String color = JOptionPane.showInputDialog("Choose a color: Black, White, Red, Blue");
        System.out.println(color);



        if (color.equals("Black")) { // метод .equals("") сравнивает строки
            System.out.println("You must be a Goth");
        } else if (color.equals("White")) {
            System.out.println("You are a very pure person");
        } else if (color.equals("Red")) {
            System.out.println("You are fun and outgoing");
        } else if (color.equals("Blue")) {
            System.out.println("You're not a Chelsea fan, are you?");
        }
    }
}