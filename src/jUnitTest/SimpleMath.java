package jUnitTest;



public class SimpleMath {   // юнит тестирование

    public int add(final int numberA,final int numberB){
        return numberA + numberB;
    }

    public int sub(final int numberA,final int numberB){
        return numberA - numberB;
    }
    public int mult(final int numberA,final int numberB){
        return numberA * numberB;
    }

    public int modulo(final int numberA,final int numberB){
        int modulo = numberA;
        while (modulo >= numberB){
            modulo-=numberB;
        }
        return modulo;
    }
    public int div(final int numberA,final int numberB){
        throw new UnsupportedOperationException("Div operation is not implemented yet");
    }
}
