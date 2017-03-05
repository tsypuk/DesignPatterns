package java8.template.old;

import java.util.Objects;

/**
 * Object composition is used. Decoupling of two different responsibilities.
 * (Logging and Filtering).
 */
public class FilterLoggerComposition implements Logger{

    private final Logger logger;
    private final Filter filter;

    public FilterLoggerComposition(Logger logger, Filter filter) {
        this.logger = Objects.requireNonNull(logger);
        this.filter = Objects.requireNonNull(filter);
    }

    @Override
    public String log(String message) {

        if (filter.accept(message)) {
            return logger.log(message);
        }
        return "Not accepted";
    }
}
