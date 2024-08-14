package exercicios.lista1.exercicio24.dominio;

public class ViagemDeCarro {
    private final int minutosDeViagem;
    private final int velocidadeMedia;

    public ViagemDeCarro(int minutosDeViagem, int velocidadeMedia) {
        this.minutosDeViagem = minutosDeViagem;
        this.velocidadeMedia = velocidadeMedia;
    }

    public double distanciaPercorrida() {
        return (minutosDeViagem / 60.0) * velocidadeMedia;
    }

    public double litrosDeGasolina() {
        return distanciaPercorrida() / 12;
    }

    public String tempoDeViagem() {
        int horas = minutosDeViagem / 60;
        int minutos = minutosDeViagem % 60;
        return String.format("%02d:%02d", horas, minutos);
    }

    @Override
    public String toString() {
        return String.format(
                " - Viagem de carro - \n" +
                        "Tempo de viagem: %s Horas\n" +
                        "Velocidade média: %d Km/h\n" +
                        "Distância percorrida: %.2f Km\n" +
                        "Combustível gasto: %.2f Litros",
                tempoDeViagem(),
                velocidadeMedia,
                distanciaPercorrida(),
                litrosDeGasolina()
        );
    }
}
