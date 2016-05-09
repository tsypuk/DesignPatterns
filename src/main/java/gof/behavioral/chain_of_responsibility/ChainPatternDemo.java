package gof.behavioral.chain_of_responsibility;

/**
 * Created by rtsy on 21.03.2016.
 * As the name suggests, the chain of responsibility pattern creates a chain of receiver objects for a request.
 * This pattern decouples sender and receiver of a request based on type of request.
 * This pattern comes under behavioral patterns.
 * -java.util.logging.Logger#log()
 -javax.servlet.Filter#doFilter()
 */
public class ChainPatternDemo {

    private static AbstractLogger getChainOfLoggers() {

        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");
        System.out.println("\n");
        loggerChain.logMessage(AbstractLogger.DEBUG, "This is an debug level information.");
        System.out.println("\n");
        loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information.");
    }
}