package inputMethods;


import javax.swing.*;

public class Excercise3 {
    public static void main(String[] args) {
        String firstName;
        firstName = JOptionPane.showInputDialog("First name"); // выпадает окно-сообщение

        String familyName;
        familyName = JOptionPane.showInputDialog("Family name"); // второе окно

        String fullName;
        fullName = "You are" + " " + firstName + " " + " " + familyName;

        JOptionPane.showMessageDialog(null, fullName, "Name", JOptionPane.ERROR_MESSAGE);
        // название последнего окна будет Name и окно будет крассным
        JOptionPane.showMessageDialog(null, fullName, "Name", JOptionPane.PLAIN_MESSAGE);
        // название последнего окна будет Name и окно будет простым
        JOptionPane.showMessageDialog(null, fullName, "Name", JOptionPane.QUESTION_MESSAGE);
        // название последнего окна будет Name и окно будет с вопросительным занчком
        JOptionPane.showMessageDialog(null, fullName, "Name", JOptionPane.WARNING_MESSAGE);
        // название последнего окна будет Name и окно будет со знаком восклицания


    }
}
