package exercicios.lista1.exercicio12.dominio;

public class Produto {
    private String nome;
    private double valor;
    private TipoPagamento tipoPagamento;

    public Produto(String nome, double valor, TipoPagamento tipoPagamento) {
        if (valor < 0) {
            throw new IllegalArgumentException("Valor invalido");
        }
        this.nome = nome;
        this.valor = valor;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Produto: \n" + nome + "\nValor: R$" + valor + "\nForma de pagamento: " + tipoPagamento.getDescricao();

    }

    public double getValorFinal() {
        return tipoPagamento.formaPagamento(this.valor);
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }
}