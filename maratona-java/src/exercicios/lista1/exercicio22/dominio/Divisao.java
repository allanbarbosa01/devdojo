package exercicios.lista1.exercicio22.dominio;

public class Divisao {
    double dividendo;
    double divisor;

    public Divisao(int dividendo, int divisor) {
        this.dividendo = dividendo;
        this.divisor = divisor;
    }

    public double resto() {
        return dividendo % divisor;
    }
    public double quociente(){
        return dividendo / divisor;
    }

    @Override
    public String toString() {
        return "Resto = " + resto() + " e " + "Quociente = " + quociente();
    }
}
