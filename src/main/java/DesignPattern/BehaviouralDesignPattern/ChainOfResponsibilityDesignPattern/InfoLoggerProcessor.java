package DesignPattern.BehaviouralDesignPattern.ChainOfResponsibilityDesignPattern;

public class InfoLoggerProcessor extends LoggerProcessor{
    public InfoLoggerProcessor(LoggerProcessor next) {
        super(next);
    }

    public void log(int logLevel, String msg) {
        if (LoggerProcessor.INFO == logLevel) {
            System.out.println(msg);
        } else {
            super.log(logLevel, msg);
        }
    }
}
