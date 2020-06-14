public abstract class Fruit {

    protected String color;

    public String getColor(){
        return color;
    }
    public void setColor(){
        this.color = color;
    }

    public abstract String eat();
    public abstract String peel();

}
