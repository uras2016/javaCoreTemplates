package array;

public class ArrayWithManyColumns {
    public static void main(String[] args) {

        int[][] massive = new int[6][5]; // массив на 6 строк и 5 колонок


        // указываем членов первой строки
        massive[0][0] = 10;
        massive[0][1] = 12;
        massive[0][2] = 43;
        massive[0][3] = 11;
        massive[0][4] = 22;
        // указываем членов второй строки
        massive[1][0] = 20;
        massive[1][1] = 45;
        massive[1][2] = 56;
        massive[1][3] = 1;
        massive[1][4] = 33;

        int rows = 6;
        int columns = 5;

        int i, j;

        // выводим на экран членов массива
        for (i = 0; i < rows; i++) {
            for (j = 0; j < columns; j++) {
                System.out.println(massive[i][j] + " ");
                // записываем значения для каждой позиции
            }

            System.out.println(" ");
        }
    }
}
