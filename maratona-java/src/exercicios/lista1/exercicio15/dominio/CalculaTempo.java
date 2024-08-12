package exercicios.lista1.exercicio15.dominio;

public class CalculaTempo {
    private int anoNascimento;
    private int mesNascimento;
    private int diaNascimento;
    private int anoAtual;
    private int mesAtual;
    private int diaAtual;

    public CalculaTempo(int anoNascimento, int mesNascimento, int diaNascimento, int anoAtual, int mesAtual, int diaAtual) {
        this.anoNascimento = anoNascimento;
        this.mesNascimento = mesNascimento;
        this.diaNascimento = diaNascimento;
        this.anoAtual = anoAtual;
        this.mesAtual = mesAtual;
        this.diaAtual = diaAtual;
    }

    public String calcularIdade() {
        int anosVividos = anoAtual - anoNascimento;
        if (mesAtual < mesNascimento || (mesAtual == mesNascimento && diaAtual < diaNascimento)) {
            anosVividos--;
        }
        int mesesVividos = (mesAtual + 12) - mesNascimento;
        if (diaAtual < diaNascimento) {
            mesesVividos--;
        }
        mesesVividos = mesesVividos % 12;
        int diasVividos = diaAtual - diaNascimento;
        if (diasVividos < 0) {
            diasVividos += 30;
        }
        return "Você viveu: " + anosVividos + " anos, " + mesesVividos + " meses e " + diasVividos + " dias.";
    }

}
