public class EvenThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++)
            if (i % 2 == 0)
                System.out.println("\nSố chẵn(EvenThread) là " + i);
            else   System.out.println("\nSố lẻ(EvenThread) là " + i);
        try {
            Thread.sleep(15);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
