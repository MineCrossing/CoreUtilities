package xyz.minecrossing.coreutilities.remote;

public class ConnectionDetails {

    private final String hostname, username, password;
    private final int port;

    /**
     * Constructor for creating the database information
     *
     * @param hostname The IP/hostname of the database server
     * @param port     The port of the database server
     * @param password The password for the database server
     */
    public ConnectionDetails(String hostname, int port, String password) {
        this(hostname, port, "", password);
    }

    /**
     * Constructor for creating the database information
     *
     * @param hostname The IP/hostname of the database server
     * @param port     The port of the database server
     * @param username The username of the database user
     * @param password The password for the database user
     */
    public ConnectionDetails(String hostname, int port, String username, String password) {
        this.hostname = hostname;
        this.port = port;
        this.username = username;
        this.password = password;
    }

    /**
     * Get the hostname of the database server
     *
     * @return The hostname of the database server
     */
    public String getHostname() {
        return hostname;
    }

    /**
     * Get the port of the database server
     *
     * @return The port of the database server
     */
    public int getPort() {
        return port;
    }

    /**
     * Get the password for the database user
     *
     * @return The password for the database user
     */
    public String getPassword() {
        return password;
    }

    /**
     * Get the username of the database user
     *
     * @return The username of the database user
     */
    public String getUsername() {
        return username;
    }
}
