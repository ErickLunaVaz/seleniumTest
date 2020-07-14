public class Callme {
    synchronized void call(String msg) {
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            System.out.println("Call me thread has been interrupted");
        }

        System.out.println("]");
    }
}