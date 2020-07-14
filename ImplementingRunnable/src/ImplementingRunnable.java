public class ImplementingRunnable implements Runnable{
    Thread t;

    ImplementingRunnable(){
//        create a new, second thread
        t = new Thread(this, "Demo thread");
        System.out.println("child thread " + t);
        t.start();
    }

//    this is the entry point for the second thread
    @Override
    public void run() {
        try {
            for(int i = 5; i > 0; i--){
                System.out.println("child thread " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e){
            System.out.println("child thread interrupted");
        }
        System.out.println("exiting child thread");
    }
}
