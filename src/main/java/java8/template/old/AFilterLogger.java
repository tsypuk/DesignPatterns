package java8.template.old;

public class AFilterLogger extends FilterLoggerInherited {

    public AFilterLogger(Logger logger) {
        super(logger);
    }

    @Override
    public boolean accept(String message) {
        return message.contains("A");
    }
}
