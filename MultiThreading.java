public class MultiThreading {
    public static void main(String[] args) {
        MyThread myThread = new MyThread("kek");
        myThread.start();
    }
    private static class MyThread extends Thread {
        public MyThread(String name) {
            super(name);
        }
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName());
        }
    }
}