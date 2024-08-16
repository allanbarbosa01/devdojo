package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        System.out.println(divisao(1, 0));
        System.out.println("Código finalizado");

    }

    /**
     *
     * @param a
     * @param b não pode ser zero
     * @throws IllegalArgumentException caso b seja zero
     * @return
     */

    private static int divisao(int a, int b) {
        if(b == 0) {
            throw new IllegalArgumentException("Impossivel dividir por 0");
        }
        return a / b;

    }
}
