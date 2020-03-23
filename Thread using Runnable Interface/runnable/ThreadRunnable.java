package thread.runnable;

public class ThreadRunnable {
    public static void main(String[] args) {
      MyThread t1 = new MyThread();
      Thread t2 = new Thread(t1);
      t2.start();
    }
}
class MyThread extends Sample implements Runnable{

    @Override
    public void run() {
        for(int i = 0; i < 10;i++)
        {
            System.out.println(1);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class Sample
{

}