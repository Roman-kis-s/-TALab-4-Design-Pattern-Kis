package Entity;

public abstract class DroidPrototype implements Cloneable{
    private String id;
    String type;

    abstract void say();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }


    @Override
    public DroidPrototype clone() throws CloneNotSupportedException {
        return (DroidPrototype) super.clone();
    }
}
