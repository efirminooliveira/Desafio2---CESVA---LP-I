package Desafios.Desafio2.src.models;

import java.util.ArrayList;

public class Venda {
    private Cliente cliente;
    private Vendedor vendedor;
    private ArrayList<Produto> produtos;
    private Double valorTotalVenda;

    
    public Venda(Cliente cliente, Vendedor vendedor, Produto produto) {
        this.valorTotalVenda = 0.0;

        this.produtos = new ArrayList<Produto>();
        this.produtos.add(produto);
        this.produtos.forEach(p -> this.valorTotalVenda += p.getValorTotal());

        this.cliente = cliente;
        this.vendedor = vendedor;
    }

    
    public ArrayList<Produto> getProdutos() {
        return produtos;
    }


    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
        this.produtos.forEach((p) -> this.valorTotalVenda += p.getValorTotal());
    }


    public Cliente getCliente() {
        return cliente;
    }
    public Vendedor getVendedor() {
        return vendedor;
    }

    public ArrayList<Produto> getProduto() {
        return produtos;
    }
    public void setProduto(Produto produto) {
        this.produtos.add(produto);
        this.valorTotalVenda += produto.getValorTotal();
    }

    public Double getValorTotalVenda(){
        return valorTotalVenda;
    }

    public void aplicarDesconto(Double desconto){
        if(desconto >= 0.01 && desconto <= 0.1){
            this.valorTotalVenda = this.valorTotalVenda - (this.valorTotalVenda*desconto);
            System.out.println("\nDesconto de " + desconto*100 + "% aplicado na venda.\n");
        }else{
            System.out.println("O valor para desconto deve ser superior a 1% e igual ou inferor a 10%");
        }
    }

    
    
}
