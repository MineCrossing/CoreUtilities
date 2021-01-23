package xyz.minecrossing.coreutilities.tasks;

public class Task {

    public void runAsync(Runnable runnable) {
        new Thread(runnable).start();
    }

    public void runLater(Runnable runnable, long delay) {
        new Thread(() -> {
            try {
                Thread.sleep(delay);
                runnable.run();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }

}
