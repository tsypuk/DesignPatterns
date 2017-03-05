package java8.template;

import org.junit.Test;

import java8.template.old.FilterLoggerComposition;
import java8.template.old.FilterLoggerInherited;
import java8.template.old.Logger;
import java8.template.old.AFilterLogger;

import static org.junit.Assert.*;

public class FilterTest {

    @Test
    public void testFilter() {
        // Given
        Logger logger = message -> "regular" + message;

        // When
        final String result = logger.log("TEST");

        // Then
        assertEquals("regularTEST", result);
    }

    @Test
    public void testAFilterLogger_accepted() {
        // Given
        Logger logger = message -> message;
        AFilterLogger numberFilterLogger = new AFilterLogger(logger);

        // When
        String result = numberFilterLogger.log("asfAasf");

        // Then
        assertEquals("asfAasf", result);
    }

    @Test
    public void testAFilterLogger_notAccepted() {
        // Given
        Logger logger = message -> message;
        AFilterLogger numberFilterLogger = new AFilterLogger(logger);

        // When
        String result = numberFilterLogger.log("asfFasf");

        // Then
        assertEquals("Not accepted.", result);
    }

    @Test
    public void testAnonymousFilterLogger() {
        // Given
        FilterLoggerInherited filterA = new FilterLoggerInherited(message -> message + "aaa") {
            @Override
            public boolean accept(String message) {
                return message.contains("A");
            }
        };

        // When
        final String message = filterA.log("MESSAGE");

        // Then
        assertEquals("MESSAGEaaa", message);
    }

    @Test
    public void testComposition_accepted() {
        // Given
        FilterLoggerComposition logger = new FilterLoggerComposition(
                message -> message + "aaaa",
                message -> message.startsWith("1"));

        // When
        final String result = logger.log("1TEST");

        // Then
        assertEquals("1TESTaaaa", result);
    }

    @Test
    public void testComposition_notAccepted() {
        // Given
        FilterLoggerComposition logger = new FilterLoggerComposition(
                message -> message + "aaaa",
                message -> message.startsWith("1"));

        // When
        final String result = logger.log("TEST");

        // Then
        assertEquals("Not accepted", result);
    }

}