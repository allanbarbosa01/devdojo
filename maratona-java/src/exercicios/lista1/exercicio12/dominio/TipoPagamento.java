package exercicios.lista1.exercicio12.dominio;

public enum TipoPagamento {
    AVISTA_DINHEIRO {
        @Override
        public double formaPagamento(double valor) {
            return (valor - (valor * 0.15));
        }
    }, AVISTA_CARTAO {
        @Override
        public double formaPagamento(double valor) {
            return (valor - (valor * 0.10));
        }
    }, PARCELADO_ATE_2X {
        @Override
        public double formaPagamento(double valor) {
            return valor;
        }
    }, PARCELADO_3XMAIS {
        @Override
        public double formaPagamento(double valor) {
            return (valor + (valor * 0.1));
        }
    };
    public abstract double formaPagamento(double valor);
    }
