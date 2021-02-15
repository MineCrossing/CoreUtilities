package xyz.minecrossing.coreutilities;

import xyz.minecrossing.coreutilities.tasks.Task;

public class CoreUtilities {

    /**
     * Get an instance of the Task class to manage
     * delayed and async calls.
     *
     * @return An instance of the Task class
     */
    public static Task getTaskManager() {
        return new Task();
    }

    /**
     * Get an instance of the Logger class for
     * outputting different levels of debug.
     *
     * @return An instance of the Logger class
     */
    public static Logger getLogger() {
        return new Logger();
    }

}
