package com.launium.sockserver4j;

import org.bbottema.javasocksproxyserver.SocksServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);
    public static SocksServer socksServer = new SocksServer();

    public static void main(String[] args) {
        for (String port : args) {
            LOGGER.info("Listening " + port + "...");
            socksServer.start(Integer.valueOf(port));
        }
    }
}