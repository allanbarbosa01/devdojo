package academy.devdojo.maratonajava.introducao;


public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        //while, do while, for
        int count = 0;
        while (count < 10) {
            System.out.println(++count);
        }
        count = 0;
        do {
            System.out.println("Dentro do do-while " + ++count);
        } while (count < 10);

        for (count=0; count < 10;count++) {

            System.out.println("For"+count);
        }
        for (int i=0; i<10; i++) {
            System.out.println("For"+i);
        }
        for (int i=0; i<=10; i++) {
            System.out.println("2 x "+i+" = "+i*2);
        }
        for (int i=0; i<=10; i++) {
            System.out.println("3x "+i+" = "+i*3);
        }
    }
}
