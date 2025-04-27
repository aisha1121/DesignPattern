package DesignPattern.BehaviouralDesignPattern.ChainOfResponsibilityDesignPattern;

public class DebugLoggerProcessor extends LoggerProcessor{
    public DebugLoggerProcessor(LoggerProcessor next) {
        super(next);
    }

    public void log(int logLevel, String msg) {
        if (LoggerProcessor.DEBUG == logLevel) {
            System.out.println(msg);
        } else {
            super.log(logLevel, msg);
        }
    }
}
