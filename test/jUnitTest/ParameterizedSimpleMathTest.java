package jUnitTest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

@RunWith(value = Parameterized.class) // ranner для использование параметризированных тестов

public class ParameterizedSimpleMathTest {
    private static final SimpleMath simpleMath = new SimpleMath();
    private int numberA;
    private int numberB;
    private int expected;

    public ParameterizedSimpleMathTest(int numberA, int numberB, int expected) {
        this.numberA = numberA;
        this.numberB = numberB;
        this.expected = expected;
    }

    // Declares parameters here
    @Parameterized.Parameters(name = "{index}: multiply ({0}*{1})={2}") // тестовое сообщение
    // if parameter is "[3,4,7,]", then (index) = test run # (from 0), [0]=3, [1]=4, [2]=7

   public static Iterable<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {1, 1, 1},// create 4 massives
                {2, 2, 4},// набор данных для каждой итерации
                {8, 2, 16},// 8 - первый множитель, 2-второй, 16 - результат
                {4, 5, 20}
        }
        );
    } // используем значения для проверки
    @Test
    public void testMult() {
        Assert.assertEquals(expected, simpleMath.mult(numberA, numberB));
    }
}