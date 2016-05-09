package gof.behavioral.template;

/**
 * Created by rtsy on 22.03.2016.
 *
 * In Template pattern, an abstract class exposes defined way(s)/template(s) to execute its methods.
 * Its subclasses can override the method implementation as per need but the invocation is to be
 * in the same way as defined by an abstract class. This pattern comes under behavior pattern category.
 * -java.util.Collections#sort()
 -java.io.InputStream#skip()
 -java.io.InputStream#read()
 -java.util.AbstractList#indexOf()
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {

        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}