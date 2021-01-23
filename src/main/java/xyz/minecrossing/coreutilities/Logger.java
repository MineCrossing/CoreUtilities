package xyz.minecrossing.coreutilities;

public class Logger {

    public static void info(String msg) {
        System.out.println("[INFO] " + msg);
    }

    public static void warning(String msg) {
        System.out.println("[WARNING] " + msg);
    }

    public static void error(String msg) {
        System.out.println("[ERROR] " + msg);
    }

    public static void debug(String msg) {
        System.out.println("[DEBUG] " + msg);
    }

    public static void out(String msg) {
        System.out.println(msg);
    }

}
