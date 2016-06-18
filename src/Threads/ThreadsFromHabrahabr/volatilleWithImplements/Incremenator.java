package Threads.ThreadsFromHabrahabr.volatilleWithImplements;
/*
Значение переменной, объявленной без volatile, может кэшироваться отдельно для каждого потока,
        и значение из этого кэша может различаться для каждого из них. Объявление переменной
        с ключевым словом volatile отключает для неё такое кэширование и все запросы к переменной
        будут направляться непосредственно в память.*/


public class Incremenator extends Thread{
    private volatile boolean mIsIncrement = true;
    private volatile boolean mFinish = false;


  public void changeAction(){     //Меняет действие на противоположное
      mIsIncrement=!mIsIncrement;
  }


    public void finish(){        //Инициирует завершение потока
        mFinish = true;
    }



    @Override
    public void run() {

        do {
            if (!Thread.interrupted()){   ////Проверка прерывания
                if (mIsIncrement){
                    Program.mValue++;   //Инкремент
                }else Program.mValue--;  //Декремент
                System.out.print(Program.mValue + " ");

            }else
                return;   //Завершение потока
            try {
                Thread.sleep(1000);             //Приостановка потока на 1 сек.
            } catch (InterruptedException e) {
                return;                          //Завершение потока после прерывания
            }
        }while (true);
    }
}
