package exercicios.lista1.exercicio12.test;

import exercicios.lista1.exercicio12.dominio.Produto;
import exercicios.lista1.exercicio12.dominio.TipoPagamento;

import java.util.Scanner;
//opção inserindo o produto:

public class Exercicio12b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do produto: ");
        String nome = sc.nextLine();
        System.out.println("Digite o valor do produto");
        double valor = sc.nextDouble();
        System.out.println("Escolha a forma de pagamento:");
        System.out.println("1 - À Vista em Dinheiro ou Pix");
        System.out.println("2 - À Vista no cartão de crédito");
        System.out.println("3 - Parcelado no cartão em duas vezes");
        System.out.println("4 - Parcelado no cartão em três vezes ou mais");
        int opcao = sc.nextInt();
        TipoPagamento tipoPagamento = null;
        switch (opcao) {
            case 1:
                tipoPagamento = TipoPagamento.A_VISTA_DINHEIRO;
                break;
            case 2:
                tipoPagamento = TipoPagamento.A_VISTA_CARTAO;
                break;
            case 3:
                tipoPagamento = TipoPagamento.PARCELADO_ATE_2X;
                break;
            case 4:
                tipoPagamento = TipoPagamento.PARCELADO_3X_MAIS;
                break;
            default:
                System.out.println("Opção inválida!");
                System.exit(0);
        }
        Produto produto = new Produto(nome, valor, tipoPagamento);
        System.out.println(produto);
        System.out.println("Total a pagar: " + produto.getValorFinal());
        sc.close();
    }
}
