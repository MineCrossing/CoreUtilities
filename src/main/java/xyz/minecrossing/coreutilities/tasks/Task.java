package xyz.minecrossing.coreutilities.tasks;

public class Task {

    public void runAsync(Runnable runnable) {
        new Thread(runnable).start();
    }

    public void runLater(Runnable runnable, long delay) {
        try {
            Thread.sleep(delay);
            runnable.run();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void runLaterAsync(Runnable runnable, long delay) {
        new Thread(() -> {
            runLater(runnable, delay);
        }).start();
    }

}
