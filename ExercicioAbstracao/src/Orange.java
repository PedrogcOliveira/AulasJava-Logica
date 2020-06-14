public class Orange extends Fruit {

    public Orange(String color) {
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
        return "Gosto de Laranja...";
    }

    @Override
    public String peel() {
        return "Se retira a casca com uma faca, descascando em volta da fruta";
    }

    @Override
    public String toString() {
        return "Cor: " + this.color
             + "\nGosto da fruta: " + this.eat()
             + "\nDescascar: " + this.peel();
    }
}
