package exercicios.lista1.exercicio16.dominio;

public class Triangulo {
    private int lado1, lado2, lado3;

    public Triangulo(int lado1, int lado2, int lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public String verificaTriangulo() {
        if (!isTrianguloValido()) {
            return "Não é um triângulo válido";
        }
        if (lado1 == lado2 && lado1 == lado3) {
            return "Equilátero";
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            return "Isósceles";
        } else
            return "Escaleno";
    }

    private boolean isTrianguloValido() {
        return lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1;
    }
}