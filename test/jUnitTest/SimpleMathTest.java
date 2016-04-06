package jUnitTest;

import org.junit.*;

import static org.junit.Assert.assertEquals;

public class SimpleMathTest {

// чтобы не создавать обьект класса в каждом методе установим такой метод-предусловие
    public static SimpleMath simpleMath;// выносим обьевление обьекта класса в переменную для всего класса

    // @Before - инициализация проходит перед каждым методом
    @BeforeClass

    public static void setUpClass() throws Exception {
        simpleMath = new SimpleMath();
        System.out.println("setUp method was runned!"); // проверяем что этот метод
                                        // инициализируеться перед каждым проверяемым методом
    }



    @Test(timeout = 3000)
    public void testAdd() throws Exception {
        final int a =4;   // предусловия - что?
        final int b = 7;
        //final SimpleMath simpleMath = new SimpleMath();
        final int result = simpleMath.add(a, b); // тестовые шаги

        // автоматическая проверка условий класс Assert

        assertEquals(a + b, result); // проверяет два значения на равенство
        // 1 число - ожидаемое, второе - result
    }
   // @Ignore // можем игнорировать этот метод

    @Test(timeout = 3000)
    public void testAub() throws Exception{
        final int a=42;
        final int b=15;
       // SimpleMath simpleMath = new SimpleMath(); - обьект класса
                                     // определили в начале и инициализировали в методе before
        final int result = simpleMath.sub(a, b);

        assertEquals(a - b, result);

    }


    @Test(timeout = 3000)
    public void testModule() throws Exception {
        final int a=17;
        final int b=3;
        final int result = simpleMath.modulo(a, b);
        assertEquals(a%b, result);

    }

    @Test(expected = UnsupportedOperationException.class)
    public void testDiv() throws Exception {
        final int a=17;
        final int b=3;

        simpleMath.div(a, b);



    }

    @After
    public void tearDown() throws Exception {
        System.out.println("After was runned");

    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        System.out.println("AfterClass was runned");

    }
}