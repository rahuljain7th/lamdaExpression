public class RunnableExample {

    public static void main(String args[]) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("running the thread");
            }
        });
        thread.run();

        Thread lambaThread = new Thread(() -> System.out.println("running the lamda thread"));
        lambaThread.run();
    }
}
