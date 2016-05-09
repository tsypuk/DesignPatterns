package gof.behavioral.chain_of_responsibility;

/**
 * Created by rtsy on 21.03.2016.
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}