package xyz.minecrossing.coreutilities.remote;

public interface ConnectionManager {

    /**
     * Initialize a connection
     */
    void initialize();

    /**
     * Shutdown a connection to avoid memory leaks
     */
    void shutdown();

}