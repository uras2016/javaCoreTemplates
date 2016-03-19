package ifStatements;

public class SwitchStatement { // используеться для проверки переменной на наличие ряда значений
    public static void main(String[] args) {
        /* switch (variable_to_test){
        case value:
        code_here;
        break;

        case value:
        code_here;
        break;

        default:
        values_not_caught_above;
        } */
        int user = 18;

    switch (user){
        case 18: //слово case и значение, на которое хотим проверить переменную, потом :
                 // если значение совпадает со значением переменной, то следует выполнить такую функцию
            System.out.println("You are 18");
            break;
        case 19:
            System.out.println("You are 19");
            break;
        case 20:
            System.out.println("You are 20");
            break;
        default: /* указываеться не обязательно. Если переменная может bvtnm значения,
                    которые не были описаны в switch*/
            System.out.println("You are not 18, 19 or 20");
    }


    }
}