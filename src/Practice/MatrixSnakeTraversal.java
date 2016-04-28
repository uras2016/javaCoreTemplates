package Practice;

import java.util.Arrays;

public class MatrixSnakeTraversal {
    public int[] print(int[][] input) {
        int length=0;
        for (int i=0;i<input.length;i++){
            length+= input[i].length;
        }
        int[] massive = new int[length];

        int i=0;
        int k=0;
        int p=1;//шаг
        for (int j=0;j<input[0].length;j++){
            while (i>= 0 && i < input.length){
                massive[k++] = input[i][j];
                i+=p;
            }
            p=-p;
            i+=p;
        }

        return massive;

    }
}
