package xyz.minecrossing.coreutilities;

public class Logger {

    /**
     * Print information to console
     *
     * @param msg The text to print to console
     */
    public static void info(String msg) {
        custom("INFO", msg);
    }

    /**
     * Print a success message to console
     *
     * @param msg The message to print console
     */
    public static void success(String msg) {
        custom("SUCCESS", msg);
    }

    /**
     * Print a warning to console
     *
     * @param msg The message to print console
     */
    public static void warning(String msg) {
        custom("WARNING", msg);
    }

    /**
     * Print an error messsage to console
     * @param msg The message to print console
     */
    public static void error(String msg) {
        custom("ERROR", msg);
    }

    /**
     * Print a marked debug message to console
     * @param msg The message to print console
     */
    public static void debug(String msg) {
        custom("DEBUG", msg);
    }

    /**
     * Print a custom prefixed message to console
     * @param prefix The prefix of the message
     * @param msg The message to print console
     */
    public static void custom(String prefix, String msg) {
        out("[" + prefix + "] " + msg);
    }

    /**
     * Shortcut method to print out a message to the console
     *
     * @param msg The message to print console
     */
    public static void out(String msg) {
        System.out.println(msg);
    }

}
