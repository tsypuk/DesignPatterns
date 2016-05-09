package gof.behavioral.iterator;

import gof.behavioral.iterator.impl.NameRepository;

/**
 * Created by rtsy on 21.03.2016.
 * Iterator pattern is very commonly used design pattern in Java and .Net programming environment.
 * This pattern is used to get a way to access the elements of a collection object
 * in sequential manner without any need to know its underlying representation.
 * -java.util.Iterator
 -java.util.Enumeration
 */
public class IteratorPatternDemo {

    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();

        for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}