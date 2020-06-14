public class Rectangle {

    private double base;
    private double height;

    public Rectangle(){
    }

    public Rectangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return this.base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double calculateAreaOfRectangle() {
        return this.base * this.height;
    }

    public double calculatePerimeterOfRectangle() {
        return 2 * this.base + 2 * this.height;
    }

    @Override
    public String toString() {
        return "Base: " + this.getBase()
                + "\nAltura: " + this.getHeight()
                + "\nÁrea do retângulo: " + this.calculateAreaOfRectangle()
                + "\nPerímetro do retângulo: " + this.calculatePerimeterOfRectangle();
    }

}