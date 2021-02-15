package xyz.minecrossing.coreutilities.io;

import xyz.minecrossing.coreutilities.remote.ConnectionDetails;

public interface PropertyLoader {

    /**
     * Create a properties file
     */
    void createProperties();

    /**
     * Load connection properties from a file
     *
     * @return The connection details from file
     */
    ConnectionDetails loadProperties();

}
