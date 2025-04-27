package DesignPattern.BehaviouralDesignPattern.ChainOfResponsibilityDesignPattern;

public abstract class LoggerProcessor {

    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    LoggerProcessor nextLogger;

    public LoggerProcessor(LoggerProcessor next) {
        this.nextLogger = next;
    }

    public void log(int logLevel, String msg) {
        if (nextLogger != null) {
            nextLogger.log(logLevel, msg);
        }
    }
}
