public class myThread extends Thread{
    public static int amount = 0;

    public static void main(String[] args) {
        myThread thread = new myThread();
        thread.start();
        // Wait for the thread to finish
        while(thread.isAlive()) {
            System.out.println("Waiting...");
        }
        // Update amount and print its value
        System.out.println("Main: " + amount);
        amount++;
        System.out.println("Main: " + amount);
    }
    public void run() {
        int a = 0;
        for (int i = 0; i < 9; i++) {
            a++;
        }
    }
}
