package Threads.meetings_offlineSemaphor;

public class Producer implements Runnable  {
    private int producedValue = 0;
    private boolean produced = false;

    public int getProducedValue() {
        return producedValue;
    }

    public boolean isProduced() {
        return produced;
    }

    public void setProduced(boolean produced) {
        this.produced = produced;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                if (produced) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

            synchronized (Main.consumer) {
                producedValue++;
                produced = true;
                System.out.println("Produced value: " + producedValue);
                Main.sleep(500);
                Main.consumer.notify();
            }
        }
    }
}