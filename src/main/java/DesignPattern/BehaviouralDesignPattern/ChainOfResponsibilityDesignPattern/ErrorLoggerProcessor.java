package DesignPattern.BehaviouralDesignPattern.ChainOfResponsibilityDesignPattern;

public class ErrorLoggerProcessor extends LoggerProcessor{
    public ErrorLoggerProcessor(LoggerProcessor next) {
        super(next);
    }

    public void log(int logLevel, String msg) {
        if (LoggerProcessor.ERROR == logLevel) {
            System.out.println(msg);
        } else {
            super.log(logLevel, msg);
        }
    }
}
