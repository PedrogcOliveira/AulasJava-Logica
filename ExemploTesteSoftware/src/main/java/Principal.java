import java.util.Scanner;
/**
 * @Author Pedro Guilherme
 * @version 1.0
 * @since 28/05/20 - 16:13
 */
public class Principal {
    public static void main(String[] args) {
        System.out.println("\f");
        Scanner scanner = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.println("Digite a Primeira nota: ");
        aluno.setNota1(scanner.nextDouble());
        System.out.println("Digite a segunda nota: ");
        aluno.setNota2(scanner.nextDouble());
        System.out.println("Digite o total de aulas: ");
        aluno.setTotalDeAulas(scanner.nextInt());
        System.out.println("Digite o número de presenças: ");
        aluno.setNumeroDePresencas(scanner.nextInt());
        System.out.println("Seu conceito é: " + aluno.verificarConceito());
        System.out.println(aluno);
    }
}
