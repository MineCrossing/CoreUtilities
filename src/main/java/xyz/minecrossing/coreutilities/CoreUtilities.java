package xyz.minecrossing.coreutilities;

import xyz.minecrossing.coreutilities.tasks.Task;

public class CoreUtilities {

    public static Task getTaskManager() {
        return new Task();
    }

    public static Logger getLogger() {
        return new Logger();
    }

}
