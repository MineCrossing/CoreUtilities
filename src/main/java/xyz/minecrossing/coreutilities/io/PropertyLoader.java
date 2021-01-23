package xyz.minecrossing.coreutilities.io;

import xyz.minecrossing.coreutilities.remote.ConnectionDetails;

public interface PropertyLoader {

    void createProperties();

    ConnectionDetails loadProperties();

}
