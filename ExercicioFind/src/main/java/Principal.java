import java.util.Scanner;
/**
 * @author Pedro Guilherme
 * @version 1.0
 * @since 07/06/2020 - 14:25
 * @category Model
 */
public class Principal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Cachorro cachorro = new Cachorro();
        BancoArray agenda = new BancoArray();
        Cachorro cachorro1 = null;

        int opcao = 0;

        do {
            System.out.println("\n1-Cadastrar\n2-Ver cães\n3-Deletar\n4-Filtrar\n5-Ver quantidade\n6-Esvaziar agenda\n7-Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    cachorro = new Cachorro();
                    System.out.println("Digite um nome: ");
                    cachorro.setNome(scanner.next());
                    System.out.println("Digite uma raça: ");
                    cachorro.setRaca(scanner.next());
                    System.out.println("Digite a idade : ");
                    cachorro.setIdade(scanner.nextInt());
                    System.out.println("Digite o peso: ");
                    cachorro.setPeso(scanner.nextDouble());
                    System.out.println("Digite a altura : ");
                    cachorro.setAltura(scanner.nextInt());

                    agenda.cadastrar(cachorro);
                    System.out.println("Cão cadastrado com sucesso!!!");
                    break;
                case 2:
                    if(agenda.verificarQuantidade() != 0) {
                        agenda.buscar().forEach(System.out::println);
                    } else {
                        System.out.println("Não há cães cadastrados!");
                    }
                    break;
                case 3:
                    System.out.println("Digite uma posição para excluir : ");
                    int index = scanner.nextInt();
                    agenda.excluir(index);
                    System.out.println("Cão excluído com sucesso!");
                    break;
                case 4:
                    cachorro = new Cachorro();
                    System.out.println("Digite o nome do cachorro que deseja filtrar: ");
                    cachorro.setNome(scanner.next());
                    cachorro = agenda.filtrar(cachorro, 1);
                    System.out.println(cachorro != null ? cachorro: "Cão não encontrado");

                    System.out.println("Digite a raça do cachorro que deseja filtrar: ");
                    cachorro.setRaca(scanner.next());
                    cachorro = agenda.filtrar(cachorro, 2);
                    System.out.println(cachorro != null ? cachorro: "Cão não encontrado");

                    System.out.println("Digite a idade  do cachorro que deseja filtrar: ");
                    cachorro.setIdade(scanner.nextInt());
                    cachorro = agenda.filtrar(cachorro, 3);
                    System.out.println(cachorro != null ? cachorro: "Cão não encontrado");
                    break;
                case 5:
                    System.out.println("Tem: " + agenda.verificarQuantidade() + " Cão(s)");
                    break;
                case 6:
                    agenda.apagarAgenda();
                    System.out.println("Agenda Limpa!!!");
                    break;
                case 7:
                    System.exit(0);
                    break;
            }

        } while (opcao!=7);
    }
}
