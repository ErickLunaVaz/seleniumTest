public class ProducerConsumerFixed {
    public static void main(String[] args) {
        Q q = new Q();
        new Producer(q);
        new Consumer(q);
        System.out.println("Press ctrl + c to stop.");
    }
}
