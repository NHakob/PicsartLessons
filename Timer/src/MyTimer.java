import java.awt.*;
import java.util.Scanner;

public class MyTimer implements Runnable {
    private Integer minute;
    private Integer second;

    public MyTimer() {
        setMinute();
        setSecond();
    }

    private void setMinute() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter minutes");
        this.minute = in.nextInt();
    }

    private void setSecond() {
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("Please enter seconds");
            this.second = in.nextInt();
            if (this.second >= 60) {
                System.out.println("Second can't be greater than 60. PLease enter second again:");
            } else {
                break;
            }
        } while (true);
    }

    private void updateTimer() {
        if (this.second == 0) {
            this.second = 59;
            this.minute--;
        } else {
            this.second--;
        }
    }

    private boolean isTimerEnd() {
        if (this.second == 0 && this.minute == 0) {
            for (int i = 0; i < 5; i++) {
                Toolkit.getDefaultToolkit().beep();
                try {
                    Thread.sleep(600);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.minute < 10) {
            sb.append("0");
        }
        sb.append(this.minute);
        sb.append(":");
        if (this.second < 10) {
            sb.append("0");
        }
        sb.append(this.second);

        return sb.toString();
    }

    @Override
    public void run() {
        while (!isTimerEnd()) {
            updateTimer();
            System.out.println(this);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
