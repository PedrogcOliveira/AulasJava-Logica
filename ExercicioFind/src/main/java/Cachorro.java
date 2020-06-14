/**
 * @author Pedro Guilherme
 * @version 1.0
 * @since 07/06/2020 - 14:02
 * @category Model
 */
public class Cachorro {

    private String nome;
    private String raca;
    private double peso;
    private int altura;
    private int idade;

    public Cachorro() {
    }

    /**
     *
     * @param nome
     * @param raca
     * @param peso
     * @param altura
     * @param idade
     */
    public Cachorro(String nome, String raca, double peso, int altura, int idade) {
        this.nome = nome;
        this.raca = raca;
        this.peso = peso;
        this.altura = altura;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return retorna o IMC do cachorro cadastrado.
     */
    public double calculoImcCachorro() {
       return (this.altura * 2) / this.peso;
    }

    @Override
    public String toString() {
        return "\nNome = " + this.nome
             + "\nRaça = " + this.raca
             + "\nIdade = " + this.idade
             + "\nAltura = " + this.altura
             + "\nPeso = " + this.peso
             + "\nValor IMC = " + this.calculoImcCachorro();
    }
}
