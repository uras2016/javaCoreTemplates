package loop;


public class ForLoopAdd {
    // for (start_value; end_value; increment_number){ cod here} - increment - шаг
// в {} указываеться код, который будет повторяться
    public static void main(String[] args) {


        int a;
        int endValue = 11;
        int addition = 0;

        for (a = 1; a < endValue; a++) { // начинаем с 0, пока а меньше 11, шаг 1
            addition = addition + a; // функция будет выполняться столько раз,
            // пока а дойдет до 11
            System.out.println(addition); // печатаем происходящее
        }
        System.out.println("Total = " + addition); // сумма цифр от 0 до 10 = 55
    }
}