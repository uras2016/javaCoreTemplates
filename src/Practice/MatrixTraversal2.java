package Practice;
public class MatrixTraversal2 {
public int[] print(int[][] input) {
int hStartIndex = 0;
int vStartIndex = 0;
int hLastIndex = input[0].length - 1;
int vLastIndex = input.length - 1;
int[] result = new int[(hLastIndex + 1) * (vLastIndex + 1)];
int resultIndex = 0;
while (resultIndex < result.length) {

for (int j = hStartIndex; j <= hLastIndex; j++) {
               result[resultIndex++] = input[vStartIndex][j];
                   }
                   vStartIndex++;

                   for (int j = vStartIndex; j <= vLastIndex; j++) {
                        result[resultIndex++] = input[j][hLastIndex];
                 }
                 hLastIndex--;
               if (resultIndex > result.length - 1) break;

                    for (int j = hLastIndex; j >= hStartIndex; j--) {
                        result[resultIndex++] = input[vLastIndex][j];
                    }
                      vLastIndex--;
                   if (resultIndex > result.length - 1) break;

                for (int j = vLastIndex; j >= vStartIndex; j--) {
                         result[resultIndex++] = input[j][hStartIndex];
                 }
                   hStartIndex++;
                }

                 return result;

            }
          }
