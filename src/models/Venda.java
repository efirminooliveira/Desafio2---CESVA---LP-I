package Desafios.Desafio2.src.models;

import java.util.ArrayList;

public class Venda {
    private Cliente cliente;
    private Vendedor vendedor;
    private ArrayList<Produto> produtos;

    
    public Venda(Cliente cliente, Vendedor vendedor, Produto produto) {
        this.cliente = cliente;
        this.vendedor = vendedor;

        this.produtos = new ArrayList<Produto>();
        this.produtos.add(produto);
    }

    
    public ArrayList<Produto> getProdutos() {
        return produtos;
    }


    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }


    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Vendedor getVendedor() {
        return vendedor;
    }
    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }
    public ArrayList<Produto> getProduto() {
        return produtos;
    }
    public void setProduto(Produto produto) {
        this.produtos.add(produto);
    }

    
    
}
