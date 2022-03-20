package Desafios.Desafio2.src.models;

import java.util.ArrayList;

public class Venda {
    private Cliente cliente;
    private Vendedor vendedor;
    private ArrayList<Produto> produtos;
    private Double valorTotalVenda;

    
    public Venda(Cliente cliente, Vendedor vendedor, Produto produto) {
        this.cliente = cliente;
        this.vendedor = vendedor;

        this.produtos = new ArrayList<Produto>();
        this.produtos.add(produto);
        this.produtos.forEach(p -> this.valorTotalVenda += p.getValorTotal());
    }

    
    public ArrayList<Produto> getProdutos() {
        return produtos;
    }


    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
        this.produtos.forEach(p -> this.valorTotalVenda += p.getValorTotal());
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

    
    
}
