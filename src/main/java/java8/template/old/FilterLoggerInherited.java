package java8.template.old;

import java.util.Objects;

/**
 * Inheritance use instead composition. Do not do so.
 * Problem is public abstract class.
 * Single responsibility principle is avoided.
 */
public abstract class FilterLoggerInherited implements Logger, Filter {
    private final Logger logger;

    public FilterLoggerInherited(Logger logger) {
        this.logger = Objects.requireNonNull(logger);
    }

    @Override
    public String log(String message) {
        if (accept(message)) {
            return logger.log(message);
        }
        return "Not accepted.";
    }

    public abstract boolean accept(String message);
}
