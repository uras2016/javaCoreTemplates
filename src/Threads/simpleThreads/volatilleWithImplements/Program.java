package Threads.simpleThreads.volatilleWithImplements;

public class Program {

    //Переменая, которой оперирует инкременатор

    public static int mValue = 0;

    public static Incremenator incr;

    public static void main(String[] args) {
        //обьект потока
        incr = new Incremenator();
          // созд потока

        System.out.println("Значение = ");

        incr.start();  // запуск потока


        //Троекратное изменение действия инкременатора
        //с интервалом в i*2 секунд


        for (int i =0; i<=3;i++){
            try {
                Thread.sleep(i*2*1000);    //Ожидание в течении i*2 сек.
            } catch (InterruptedException e) {
            }

            incr.changeAction();
        }

        incr.interrupt();

    }
}
