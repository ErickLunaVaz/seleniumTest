public class NewThread extends Thread{

    NewThread(){
//        create a new thread
        super("Demo thread");
        System.out.println("child thread: " + this);
        start();
    }

//    this is the entry point for the second thread

    @Override
    public void run() {
        try{
            for(int i = 5; i > 0; i--){
                System.out.println("child thread: " + i);
                Thread.sleep(500);
            }
        }catch(InterruptedException e){
            System.out.println("child interrupted");
        }
        System.out.println("exiting child thread");
    }
}
