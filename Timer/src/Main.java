public class Main {
    public static void main(String[] args) {
        Thread timerThread = new Thread(new MyTimer());
        timerThread.start();
    }
}
