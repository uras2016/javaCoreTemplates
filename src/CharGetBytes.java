import java.util.Arrays;

public class CharGetBytes {
    public static void main(String[] args) {


        char c = 'Ш';
        int a =15;
        String s =String.valueOf(c);
        byte[] k =s.getBytes();
        System.out.println(Arrays.toString(k));
    }
}