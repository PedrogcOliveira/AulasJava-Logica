/**
 * @Author Pedro Guilherme
 * @version 1.0
 * @since 27/05/2020 - 12:00
 */
public class Aluno {

    private double nota1;
    private double nota2;
    private int totalDeAulas;
    private int numeroDePresencas;

    public Aluno() {
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public int getTotalDeAulas() {
        return totalDeAulas;
    }

    public void setTotalDeAulas(int totalDeAulas) {
        this.totalDeAulas = totalDeAulas;
    }

    public int getNumeroDePresencas() {
        return numeroDePresencas;
    }

    public void setNumeroDePresencas(int numeroDePresencas) {
        this.numeroDePresencas = numeroDePresencas;
    }

    /**
     * @return Retorna a nota media de um aluno.
     */
    public double calcularMediaAritmetica(){
        return (this.nota1 + this.nota2) / 2;
    }

    /**
     * @return Retorna o numero de presenças em determinada disciplina.
     */
    public double calcularFrequencia() {
        return (100 * this.numeroDePresencas) / this.totalDeAulas;
    }

    /**
     * @return retorna se o aluno foi aprovado pela nota.
     */
    public String verificarAprovacaoNota() {
        if (this.calcularMediaAritmetica() >= 6) {
            return "Aprovado fiote...";
        } else {
            return "Reprovado, tenta ano que vem...";
        }
    }
    /**
     * @return retorna se há a aporvação através da frequência.
     */
    public String verificarAprovacaoFrequencia() {
        if (this.calcularFrequencia() >= 75) {
            return "Aprovado!";
        } else {
            return "Reprovado!";
        }
    }

    public String verificarConceito() {

        if (this.calcularMediaAritmetica() >= 9) {
            return "Conceito A";
        } else if (this.calcularMediaAritmetica() >= 7) {
            return "Conceito B";
        } else if (this.calcularMediaAritmetica() >= 6) {
            return "Conceito C";
        } return "Conceito D";

    }

    @Override
    public String toString() {
            return "Nota1: " + this.nota1
                 + "\nNota2: " + this.nota2
                 + "\nTotal de aulas: " + this.totalDeAulas
                 + "\nPresenças: " + this.numeroDePresencas
                 + "\nMédia aritmetica: " + this.calcularMediaAritmetica()
                 + "\nFrequência: " + this.calcularFrequencia()
                 + "\nSituação por nota: " + this.verificarAprovacaoNota()
                 + "\nSituação por frequência: " + this.verificarAprovacaoFrequencia()
                 + "\nConceito: " + this.verificarConceito();

    }

}


