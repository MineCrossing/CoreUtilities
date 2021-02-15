package xyz.minecrossing.coreutilities.tasks;

public class Task {

    /**
     * Run a task asynchronously
     *
     * @param runnable The task to be executed
     */
    public void runAsync(Runnable runnable) {
        new Thread(runnable).start();
    }

    /**
     * Run a task at a layer time
     *
     * @param runnable The task to run later
     * @param delay    The delay before running the task
     */
    public void runLater(Runnable runnable, long delay) {
        try {
            Thread.sleep(delay);
            runnable.run();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * Run a task at a layer time asynchronously
     *
     * @param runnable The task to run later
     * @param delay    The delay before running the task
     */
    public void runLaterAsync(Runnable runnable, long delay) {
        new Thread(() -> {
            runLater(runnable, delay);
        }).start();
    }

}
