public class TestThread {
    public static void main(String[] args){
         OddThread thread = new OddThread();
         EvenThread evenThread = new EvenThread();
         Thread thread1 = new Thread(evenThread);
         thread.start();
         thread1.start();
    }
}
