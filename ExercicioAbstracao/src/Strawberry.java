public class Strawberry extends Fruit {

    public Strawberry(String color) {
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
        return "Gosto de Morango!!";
    }

    @Override
    public String peel() {
        return "Não se descasca, somente tira o 'cabelinho'.";
    }

    @Override
    public String toString() {
        return "Cor: " + this.color
                + "\nGosto da fruta: " + this.eat()
                + "\nDescascar: " + this.peel();
    }
}
