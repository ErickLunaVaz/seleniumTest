public class DemoJoin {
    public static void main(String[] args) {
        NewThread t1 = new NewThread("One");
        NewThread t2 = new NewThread("Two");
        NewThread t3 = new NewThread("Three");

        System.out.println("Is thread one alive: " + t1.t.isAlive());
        System.out.println("Is thread two alive: " + t2.t.isAlive());
        System.out.println("Is thread three alive: " + t3.t.isAlive());

//        Waith for the threads to finish
        try{
            t1.t.join();
            t2.t.join();
            t3.t.join();
        }catch (InterruptedException e){
            System.out.println("Main thread interrupted");
        }

        System.out.println("Is thread one alive: " + t1.t.isAlive());
        System.out.println("Is thread two alive: " + t2.t.isAlive());
        System.out.println("Is thread three alive: " + t3.t.isAlive());

    }
}
