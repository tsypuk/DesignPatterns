package gof.creational.factory;

import org.junit.Test;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Logger;

import static org.junit.Assert.*;

public class FactoryPatternDemoTest {

    @Test
    public void testOneThread()
            throws InterruptedException {
        Shape shape = ShapeFactory.getShape("circle");
        assertTrue(shape.getClass().getSimpleName().equals("Circle"));
    }

    @Test
    public void testMultiThread() {
        Logger logger = Logger.getLogger("test");
        logger.info("Start");
        Runtime runtime = Runtime.getRuntime();
        final int MEGA = 1024 * 1024;
        System.out.println("CPU num: " + runtime.availableProcessors());
        System.out.println("Memory free: " + runtime.freeMemory() / MEGA);
        System.out.println("Memory max: " + runtime.maxMemory() / MEGA);
        System.out.println("Memory total: " + runtime.totalMemory() / MEGA);
        ExecutorService service = Executors.newFixedThreadPool(100);
        for (int i = 0; i < 100_000; i ++)
            service.execute(() -> {
                Shape shape = null;
                try {
                    shape = ShapeFactory.getShape("rectangle");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                assertTrue(shape.getClass().getSimpleName().equals("Rectangle"));
                logger.info("RESULT: " + shape.getClass().getSimpleName().equals("Rectangle"));
            });
        service.shutdown();
        logger.info(String.valueOf(service.isTerminated()));
        logger.info(String.valueOf(service.isShutdown()));

        System.out.println("CPU num: " + runtime.availableProcessors());
        System.out.println("Memory free: " + runtime.freeMemory() / MEGA);
        System.out.println("Memory max: " + runtime.maxMemory() / MEGA);
        System.out.println("Memory total: " + runtime.totalMemory() / MEGA);
    }
}