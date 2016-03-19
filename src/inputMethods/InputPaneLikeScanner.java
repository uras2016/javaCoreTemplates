package inputMethods;

import javax.swing.*;

public class InputPaneLikeScanner {

    public static void main(String[] args) {
        String firstName;
        firstName = JOptionPane.showInputDialog("First name"); // выпадает окно-сообщение

        String familyName;
        familyName = JOptionPane.showInputDialog("Family name"); // второе окно

        String fullName;
        fullName = "You are" + firstName + " " + " " + familyName;

        JOptionPane.showMessageDialog(null, fullName); /* null значит, что сообщение больше ни с чем
                                                        не ассоциируется*/

        System.exit(0); // убеждаемся, что программа закончила работу и освободила память

    }
}
