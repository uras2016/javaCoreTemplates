package inputMethods;


import javax.swing.*;

public class Excercise2 {

    public static void main(String[] args) {
        String firstName;
        firstName = JOptionPane.showInputDialog("First name"); // выпадает окно-сообщение

        String familyName;
        familyName = JOptionPane.showInputDialog("Family name"); // второе окно

        String fullName;
        fullName = "You are" + " " + firstName + " " + " " + familyName;

        JOptionPane.showMessageDialog(null, fullName, "Name", JOptionPane.INFORMATION_MESSAGE);
        // название последнего окна будет Name
    }
}
