//18 - Francisco tem 1,10m e cresce 3 centímetros por ano, enquanto Sara tem 1,50m e cresce 1 centímetros por ano.
// Faça um algoritmo que calcule e imprima na tela em quantos anos serão necessários para que Francisco seja maior que Sara.

package exercicios.lista1.exercicio18.dominio;

public class Altura {
    private int alturaFrancisco;
    private int alturaSara;
    private int txCrescimentoFrancisco = 7;
    private int txCrescimentoSara = 1;

    public Altura(int alturaFrancisco, int alturaSara) {
        this.alturaFrancisco = alturaFrancisco;
        this.alturaSara = alturaSara;

    }
    public int calcularAnosParaSuperar(){
        int anos = 0;
        while (alturaFrancisco <= alturaSara){
            alturaFrancisco += txCrescimentoFrancisco;
            alturaSara += txCrescimentoSara;
            anos ++;
        }
        return anos;
    }

    @Override
    public String toString() {
        return "Altura: \n" +
                "Sara tem " + alturaSara + " Cm\n" +
                "Francisco tem " + alturaFrancisco + " Cm\n" +
                "Francisco irá superar Sara em " + calcularAnosParaSuperar() + " Anos";
    }
}
