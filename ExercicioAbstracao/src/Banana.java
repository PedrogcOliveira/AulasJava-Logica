public class Banana extends Fruit {

    public Banana(String color){
        this.color = color;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor() {
        super.setColor();
    }

    @Override
    public String eat() {
        return "Gosto de Banana.";
    }

    @Override
    public String peel() {
        return "Se retira a casca com a mão";
    }

    @Override
    public String toString() {
        return "Cor: " + this.color
                + "\nGosto da fruta: " + this.eat()
                + "\nDescascar: " + this.peel();
    }
}
