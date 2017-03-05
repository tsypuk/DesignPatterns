package java8.template.old;

@FunctionalInterface

public interface Filter {
    boolean accept(String message);
}
