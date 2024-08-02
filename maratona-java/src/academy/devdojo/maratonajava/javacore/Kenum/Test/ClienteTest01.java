package academy.devdojo.maratonajava.javacore.Kenum.Test;

import academy.devdojo.maratonajava.javacore.Kenum.dominio.Cliente;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoCliente;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Allan", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Leticia",TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);


        Cliente[] clientes = {cliente1, cliente2};
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
            System.out.println(cliente.getTipoPagamento().calcularDesconto(100));;
            TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_JURIDICA");
            System.out.println(tipoCliente.getNomeRelatorio());
            TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Física");
            System.out.println(tipoCliente2);

//            System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
        }

//        System.out.println(cliente1.toString());
//        System.out.println(cliente2.toString());
//        System.out.println(cliente3.toString());
//        System.out.println(cliente4.toString());
    }
}
