package exercicios.lista1.exercicio23.dominio;

public class ProfessorB {
    public String nome;
    public String disciplina;
    public double valorHoraAula;
    public int aulasLecionadas;
    public double descontoInss = 0.1;

    public ProfessorB(String nome, String disciplina, double valorHoraAula, int aulasLecionadas) {
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
        return "Professor: " + nome + "\n" +
                "Disciplina: " + disciplina + "\n" +
                "valor da hora/aula: R$" + valorHoraAula + "\n" +
                "Quantidade de aulas lecionadas: " + aulasLecionadas + "\n" +
                "desconto Inss: " + descontoInss + "%" + "\n" +
                "Salário bruto: R$" + calculaSalarioBruto() + "\n" +
                "Salário liquido: R$" + calculaSalarioLiquido() + "\n" +
                "--------------------------------";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public double getValorHoraAula() {
        return valorHoraAula;
    }

    public void setValorHoraAula(double valorHoraAula) {
        this.valorHoraAula = valorHoraAula;
    }

    public int getAulasLecionadas() {
        return aulasLecionadas;
    }

    public void setAulasLecionadas(int aulasLecionadas) {
        this.aulasLecionadas = aulasLecionadas;
    }

    public double getDescontoInss() {
        return descontoInss;
    }

    public void setDescontoInss(double descontoInss) {
        this.descontoInss = descontoInss;
    }
}
