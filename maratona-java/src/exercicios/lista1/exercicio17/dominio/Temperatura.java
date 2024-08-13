package exercicios.lista1.exercicio17.dominio;

public class Temperatura {
    private double fahrenheit;

    public Temperatura(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public double converterTemperatura() {
        return (5 * (fahrenheit - 32) / 9);
    }

    @Override
    public String toString() {
        return String.format("Temperatura:\nFahrenheit = %.2f°F\nCelcius = %.2fºC", fahrenheit, converterTemperatura());

    }
}
