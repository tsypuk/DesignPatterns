package gof.behavioral.memento;

/**
 * Created by rtsy on 21.03.2016.
 */
public class Memento {
    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }
}