package Practice;

public class MatrixTraversal3 {
       public int[] print(int[][] input) {
                  int i = 0;
                  int j = 0;
                  int k = 0;
                  int[][] prog = {{1,0},{0,1},{-1,0},{0,-1}};

                  int h_bound = input[0].length;
                  int v_bound = input.length;
                  int h_min_bound = 0;
                  int v_min_bound = 0;
                  int passes = (int)Math.round(h_bound / 2d);

                  int[] res = new int[h_bound*v_bound];

                  for(int pass = 1; pass <= passes; pass++) {
                          res[k++] = input[j][i];
                          for (int[] vector : prog) {
                                  while ((h_min_bound <= i + vector[0] && i + vector[0] < h_bound)
                                          && ((vector[1]!=-1||v_min_bound + 1 <= j + vector[1]) && j + vector[1] < v_bound)
                                          && k < res.length) {
                                          i += vector[0];
                                          j += vector[1];
                                          res[k++] = input[j][i];
                                      }
                             }
                          h_min_bound ++;h_bound--;
                          v_min_bound ++;v_bound--;
                          i++;
                      }
                  return res;
            }
      }
