package com.coherentsolutions.advanced.java.behavioral.chainofresponsibility.ex2;

public class ChainPatternExample {

    private static Logger getChainOfLoggers() {

        Logger errorLogger = new ErrorLogger(Logger.ERROR);
        Logger infoLogger = new InfoLogger(Logger.INFO);
        Logger debugLogger = new DebugLogger(Logger.DEBUG);

        errorLogger.setNextLogger(infoLogger);
        infoLogger.setNextLogger(debugLogger);

        return errorLogger;
    }

    public static void main(String[] args) {
        Logger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(Logger.DEBUG, "This is a debug level message.");
        loggerChain.logMessage(Logger.INFO, "This is an info level message.");
        loggerChain.logMessage(Logger.ERROR, "This is an error level message.");
    }
}