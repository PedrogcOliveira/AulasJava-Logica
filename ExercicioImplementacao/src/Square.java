public class Square implements GeometricalFigure {

    private String nameOfFigure;
    private String side;
    private double area;
    private double perimeter;

    @Override
    public String getNameOfFigure() {
        return nameOfFigure;
    }

    public String getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public double getPerimeter() {
        return perimeter;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public void setNameOfFigure(String nameOfFigure) {
        this.nameOfFigure = nameOfFigure;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    @Override
    public String toString() {
        return "\nNome da figura: " + this.nameOfFigure
              +"\nLado da figura: " + this.side
              +"\nArea da figura: " + this.area
              +"\nPerímetro da figura: " + this.perimeter;
    }
}
