package Desafios.Desafio2.src;

import Desafios.Desafio2.src.models.Cliente;
import Desafios.Desafio2.src.models.Produto;
import Desafios.Desafio2.src.models.Venda;
import Desafios.Desafio2.src.models.Vendedor;

public class App {
    public static void main(String[] args) {

        Cliente  cliente1 = new Cliente("Fulano", "79831264582", "64975648532", "fulano123@mymail.com");
        Vendedor  vendedor1 = new Vendedor("Ciclano", "79831264582", "64975648532", "ciclano2022@mymail.com");

        Produto produto1 = new Produto("Abajur", 3, 20.0, 2.5, vendedor1.getPercentualComissao());
        Produto produto2 = new Produto("Lampada RGB", 3, 70.0, 5.0, vendedor1.getPercentualComissao());

        Venda venda1 = new Venda(cliente1, vendedor1, produto1);
        venda1.setProduto(produto2);

        System.out.println("\n***Envolvidos***");
        System.out.println("Cliente: " + venda1.getCliente().getNome());
        System.out.println("Vendedor: " + venda1.getVendedor().getNome());
        System.out.println("\n***Itens***");
        venda1.getProdutos().forEach((p) -> System.out.println(p.getNome() + " - R$" + p.getValorTotal()));
        System.out.println("Valor total da compra sem o desconto: " + venda1.getValorTotalVenda());

        venda1.aplicarDesconto(0.05);

        System.out.println("\n***Envolvidos***");
        System.out.println("Cliente: " + venda1.getCliente().getNome());
        System.out.println("Vendedor: " + venda1.getVendedor().getNome());
        System.out.println("\n***Itens***");
        venda1.getProdutos().forEach((p) -> System.out.println(p.getNome() + " - R$" + p.getValorTotal()));
        System.out.println("Valor total da venda com o desconto aplicado: R$" + venda1.getValorTotalVenda());


    }
}
