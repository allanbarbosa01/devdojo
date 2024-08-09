package exercicios.lista1.exercicio12.dominio;

public enum TipoPagamento {
    A_VISTA_DINHEIRO("À Vista em dinheiro ou Pix") {
        @Override
        public double formaPagamento(double valor) {
            return (valor * 0.85);
        }
    }, A_VISTA_CARTAO("A vista no cartão de crédito") {
        @Override
        public double formaPagamento(double valor) {
            return (valor * 0.9);
        }
    }, PARCELADO_ATE_2X("Parcelado no cartão em até 2 vezes sem juros") {
        @Override
        public double formaPagamento(double valor) {
            return valor;
        }
    }, PARCELADO_3X_MAIS("Parcelado no cartão em 3 vezes ou mais (Juros de 10%)") {
        @Override
        public double formaPagamento(double valor) {
            return (valor * 1.1);
        }
    };
    private final String descricao;
    TipoPagamento(String descricao) {
        this.descricao = descricao;
    }
    public String getDescricao() {
        return descricao;
    }
    public abstract double formaPagamento(double valor);
    }
