package ifStatements.Vasilyev;

import javax.swing.*;

public class UsingFor {
    public static void main(String[] args){
        // Граница суммы, индексная переменная и переменная для записи суммы:
        int count,i,s=0;
        // Считывание границы суммы:
        count=Integer.parseInt(JOptionPane.showInputDialog("Введите границу суммы"));
        // Текстовая переменная:
        String text="Сумма натуральных чисел от 1 до "+count+": ";
        // Вычисление суммы оператором for:
        for(i=1;i<=count;i++){
            s+=i;}
        // Вывод окна сообщения на экран:
        JOptionPane.showMessageDialog(null,text+s);

        s=0;
        for(i=1;i<=count;i++){s+=i;}
        // Вывод окна сообщения на экран:
        System.out.println(text+s);

        s=0;
        for(i=1;i<=count;s+=i,i++);
        // Вывод окна сообщения на экран:
        System.out.println(text+s);

        s=0;
        for(i=1;i<=count;s+=i++);
        // Вывод окна сообщения на экран:
        System.out.println(text+s);

        s=0;i=0;
        for(;i<=count-1;s+=i) {
            i++;
        }
        // Вывод окна сообщения на экран:
        System.out.println(text+s);

        s=0;i=1;
        for(;i<=count;){
            s+=i;
            i++;
        }
        // Вывод окна сообщения на экран:
        System.out.println(text+s);

        s=0;i=0;
        for(;;){
            s+=++i;
            if(i>=count) break;
        }
        // Вывод окна сообщения на экран:
        System.out.println(text+s);





    }
}