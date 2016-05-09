package gof.creational.prototype;

/**
 * Created by rtsy on 20.02.2016.
 */
public abstract class Shape implements Cloneable {

    private Long id;
    protected String type;

    abstract void draw();

    public String getType(){
        return type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Object clone() {
        Object clone = null;

        try {
            clone = super.clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;
    }
}