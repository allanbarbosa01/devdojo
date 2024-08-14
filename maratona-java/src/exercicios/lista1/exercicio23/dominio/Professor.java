package exercicios.lista1.exercicio23.dominio;

public class Professor {
    private final String nome;
    private final String disciplina;
    private final double valorHoraAula;
    private final int aulasLecionadas;
    private final double descontoInss = 0.1;

    public Professor(String nome, String disciplina, double valorHoraAula, int aulasLecionadas) {
        this.nome = nome;
        this.disciplina = disciplina;
        this.valorHoraAula = valorHoraAula;
        this.aulasLecionadas = aulasLecionadas;
    }

    public double calculaSalarioBruto() {
        return valorHoraAula * aulasLecionadas;
    }

    public double calculaDesconto() {
        return calculaSalarioBruto() * descontoInss;
    }

    public double calculaSalarioLiquido() {
        return calculaSalarioBruto() - calculaDesconto();
    }

    @Override
    public String toString() {
        return  "Professor: " + nome + "\n" +
                "Disciplina: " + disciplina + "\n" +
                "valor da hora/aula: R$" + valorHoraAula + "\n" +
                "Quantidade de aulas lecionadas: " + aulasLecionadas + "\n" +
                "desconto Inss: " + descontoInss + "%" + "\n" +
                "Salário bruto: R$" + calculaSalarioBruto() + "\n" +
                "Salário liquido: R$" + calculaSalarioLiquido() + "\n" +
                "--------------------------------";
    }
}
