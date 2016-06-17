package Threads.simpleThreads.threadsTemplate2;

public class EggVoice extends Thread {
    @Override
    public void run() {
        for (int i = 0; i<5; i++){
            try {
                sleep(1000);

            } catch (InterruptedException e) {
            }

            System.out.println("An Egg");
            //Слово «яйцо» сказано 5 раз

        }
    }
}
