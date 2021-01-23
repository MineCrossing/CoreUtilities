package xyz.minecrossing.coreutilities.remote;

public class ConnectionDetails {

    private final String hostname, username, password;
    private final int port;

    public ConnectionDetails(String hostname, String password, int port) {
        this(hostname, "", password, port);
    }

    public ConnectionDetails(String hostname, String username, String password, int port) {
        this.hostname = hostname;
        this.username = username;
        this.password = password;
        this.port = port;
    }

    public String getHostname() {
        return hostname;
    }

    public String getPassword() {
        return password;
    }

    public int getPort() {
        return port;
    }

    public String getUsername() {
        return username;
    }
}
