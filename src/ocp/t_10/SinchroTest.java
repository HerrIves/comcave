package ocp.t_10;

public class SinchroTest {
    static int synchroNotInt = 0;

    synchronized void setSynchroNotInt() {
        System.out.println("for");
        synchronized (this) {
            synchroNotInt++;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("danach");
    }

    public static void main(String[] args) {
        new Thread(()->new SinchroTest().setSynchroNotInt()).start();
        new Thread(new myRunnable()).start();
    }
}

class myRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("runnable");
        new SinchroTest().setSynchroNotInt();
        System.out.println("runnable end");
    }
}
