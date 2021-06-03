package com.karpovanton.moremetals;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;

/**
 * A utility class for logging
 */
public class Log {
    // An internal reference to the logger
    private static final Logger logger = MoreMetals.LOGGER;

    /**
     * Logs the message at debug level
     * @param message Log message
     */
    public static void debug(String message) {
        logger.log(Level.DEBUG, message);
    }

    /**
     * Logs the message at info level
     * @param message Log message
     */
    public static void info(String message) {
        logger.log(Level.INFO, message);
    }

    /**
     * Logs the message at warning level
     * @param message Log message
     */
    public static void warn(String message) {
        logger.log(Level.WARN, message);
    }

    /**
     * Logs the message at error level
     * @param message Log message
     */
    public static void error(String message) {
        logger.log(Level.ERROR, message);
    }

    /**
     * Logs the message at fatal level
     * @param message Log message
     */
    public static void fatal(String message) {
        logger.log(Level.FATAL, message);
    }
}
