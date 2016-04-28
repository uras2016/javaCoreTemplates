package Practice;

import java.math.BigInteger;

class AddNumberBase36 {

    public String add(String a, String b) {

        BigInteger b1 = new BigInteger(a, 36);
        BigInteger b2 = new BigInteger(b, 36);

        return b1.add(b2).toString(36);
    }
}