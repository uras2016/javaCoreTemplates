package toString;

import java.util.Arrays;

public class Str {

            public static void main(String[] args) {


            final char [] charArrayToString = {'a', 'r', 'r', 'a', 'y'};

            final java.lang.String stringToDisplay = Arrays.toString(charArrayToString)
                    .replace(",", "") // remove the commas
                    .replace("[", "")
                    .replace("]", "")
                    .replace(" ", "")
                    .trim(); // trim empty cells at end
            System.out.println(stringToDisplay);



        }
    }


