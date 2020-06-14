import java.util.Scanner;
public class Main {

    public static void main(String args[]) {

        System.out.println("\f");
        Scanner scanner = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();
        System.out.println("Digite a base da figura: ");
        rectangle.setBase(scanner.nextDouble());
        System.out.println("Digite a altura da figura: ");
        rectangle.setHeight(scanner.nextDouble());
        System.out.println(rectangle);

        System.out.println("Digite a base da figura: ");
        System.out.println("Digite a Altura da figura: ");
        double base = scanner.nextDouble();
        double height = scanner.nextDouble();
        Rectangle rectangle1 = new Rectangle(base,height);
        System.out.println(rectangle1);

        Square square = new Square();
        System.out.println("Digite o nome da figura: ");
        square.setNameOfFigure(scanner.nextLine());
        System.out.println("Digite o lado da figura: ");
        square.setSide(scanner.nextLine());
        System.out.println("Digite a area da figura: ");
        square.setArea(scanner.nextDouble());
        System.out.println("Digite o perimetro da figura: ");
        square.setPerimeter(scanner.nextDouble());
        System.out.println(square);
    }
}