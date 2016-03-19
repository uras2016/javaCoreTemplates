package loop;


public class ForLoop {

    // for (start_value; end_value; increment_number){ cod here} - increment - шаг
// в {} указываеться код, который будет повторяться
    public static void main(String[] args) {


        int a;
        int endValue = 11;

        for (a=0; a < endValue; a++){ // начинаем с 0, пока а меньше 11, шаг 1
            System.out.println("Loop value" + a); // функция будет выполняться столько раз,
                                                  // пока а дойдет до 11
        }


    }

}