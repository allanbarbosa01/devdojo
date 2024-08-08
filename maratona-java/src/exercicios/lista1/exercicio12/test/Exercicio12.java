/* 12 - Faça um algoritmo que leia o valor de um produto e determine o valor que deve ser pago, conforme a escolha da forma de pagamento
 pelo comprador e imprima na tela o valor final do produto a ser pago. Utilize os códigos da tabela de condições de pagamento para efetuar o cálculo adequado.

Tabela de Código de Condições de Pagamento



 1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto

 2 - À Vista no cartão de crédito, recebe 10% de desconto

 3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros

 4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%

*/

package exercicios.lista1.exercicio12.test;

import exercicios.lista1.exercicio12.dominio.Produto;
import exercicios.lista1.exercicio12.dominio.TipoPagamento;

public class Exercicio12 {
    public static void main(String[] args) {
        Produto produto = new Produto("Computador",5500, TipoPagamento.AVISTA_DINHEIRO);
        System.out.println(produto);
//        System.out.println(TipoPagamento.AVISTA_DINHEIRO);
        System.out.println("Total a pagar: R$"+produto.getTipoPagamento().formaPagamento(5500));

    }
}
