package inputMethods;


import javax.swing.*;

public class Exercise1 {
    public static void main(String[] args) {

        String firstName;
        firstName = JOptionPane.showInputDialog("First name", "Enter Your First Name");
        // вторая фраза будет уже прописана в стоке ввода

        String familyName;
        familyName = JOptionPane.showInputDialog("Family", "Enter Your Family Name");
        // аналогично
        System.out.println(firstName + " " + familyName);
        // введенные данные записались в переменные и вывелись на екран по sout

    }
}