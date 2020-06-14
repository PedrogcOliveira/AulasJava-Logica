import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("\f");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a cor da banana: ");
        String color = scanner.nextLine();
        Banana banana = new Banana(color);
        System.out.println(banana);

        System.out.println("\nDigite a cor do morango: ");
        String color1 = scanner.nextLine();
        Strawberry strawberry = new Strawberry(color1);
        System.out.println(strawberry);

        System.out.println("\nDigite a cor da laranja: ");
        String color2 = scanner.nextLine();
        Orange orange  = new Orange(color2);
        System.out.println(orange);


    }
}
