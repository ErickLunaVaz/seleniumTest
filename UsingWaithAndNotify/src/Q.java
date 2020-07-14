public class Q {
    int n;
    boolean valueSet = false;



    synchronized int get() {
        while (!valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Interrupted exception catched in Queue while getting");
            }

        }
        valueSet = false;
        System.out.println("Got: " + n);
        notify();
        return n;
    }

    synchronized void put(int n) {
        while (valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Interrupted exception catched in Queue while putting");
            }
        }
        this.n = n;
        valueSet = true;
        System.out.println("Just put " + n);
        notify();
    }
}
