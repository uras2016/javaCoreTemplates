package Threads.simpleThreads.threadsTemplate2;

public class ChickenVoice {
    static EggVoice eggVoice;   //Побочный поток

    public static void main(String[] args) {
        eggVoice = new EggVoice(); // thread creation

        System.out.println("Start negotiation");

        eggVoice.start(); // run thread

        for (int i =0; i<5;i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println("Chicken");
            //Слово «курица» сказано 5 раз
        }



            if (eggVoice.isAlive()){
                try {
                    eggVoice.join();   //Подождать пока оппонент закончит высказываться.
                } catch (InterruptedException e) {

                }

                System.out.println("An Egg was first");

            }else {                    //если оппонент уже закончил высказываться
                System.out.println("Chicken was first");

            }

            System.out.println("Finish negotiation");
        }
    }

