package java8.template.java8;

import java.util.Objects;

import java8.template.old.Filter;
import java8.template.old.Logger;

public class FilterLoggerHOF {

    public static Logger filterLogger(Logger logger, Filter filter) {
        Objects.requireNonNull(logger);
        Objects.requireNonNull(filter);

        return message -> {
            if (filter.accept(message)) {
                return logger.log(message);
            }
            else {
                return "NOT ACCEPTED";
            }
        };
    }

    public static Logger logger(Logger logger) {
        Objects.requireNonNull(logger);

        return message -> {
            System.out.println(message);
            return message;
        };
    }
}