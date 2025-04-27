package DesignPattern.BehaviouralDesignPattern.ChainOfResponsibilityDesignPattern;

/*
    * The sender (client) doesn't need to know which object will handle the request.
    * Handlers are independent and can be easily added or changed without touching the client code.
    * eg: logger -> specified order and client simply added its request
    * if not handled by info then debug if not then error
    * similar eg vending machine and ATM
    * vending machine -> 1. pepsi 2. coke 3. coffee -> customer asks for coffee, then first pepsi checks
    * doesn't satisfy so next ... last at coffee
*/
public class Logger {
    public static void main(String[] args) {
        LoggerProcessor processor = new InfoLoggerProcessor(new DebugLoggerProcessor(new ErrorLoggerProcessor(null)));

        processor.log(LoggerProcessor.INFO, "for your information");
        processor.log(LoggerProcessor.DEBUG, "for debugging purpose");
        processor.log(LoggerProcessor.ERROR, "error occurred");

    }
}
