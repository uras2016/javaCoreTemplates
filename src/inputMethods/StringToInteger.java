package inputMethods;


import javax.swing.*;

public class StringToInteger {

    public static void main(String[] args) {


        String breadth, height;

        breadth = JOptionPane.showInputDialog("Rectangle Breadth");
        // ввести необходимо цифры, но тип String
        height = JOptionPane.showInputDialog("Rectangle Height");


       /* Integer.parseInt(breadth);  этот метод сконвертирует результат из строки breadth в число
        Integer.parseInt(height);
        */

        int area = Integer.parseInt(breadth)*Integer.parseInt(height);

        String result = "answer=" + area;
        //
        JOptionPane.showMessageDialog(null, result, "RECTANGLE AREA", JOptionPane.PLAIN_MESSAGE);
    } // название последнего окна будет Name и окно будет простым

}