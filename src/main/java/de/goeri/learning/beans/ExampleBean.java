package de.goeri.learning.beans;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by Goeran on 19.08.16.
 */
public class ExampleBean {
    private static Logger log = LogManager.getLogger(ExampleBean.class);

    public static void logSomething(String key, String value) throws Exception {
        log.info("Got a message with key: " + key + " and value: " + value);
    }
}
