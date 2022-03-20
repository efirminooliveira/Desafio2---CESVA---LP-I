package Desafios.Desafio2.src.models;

public class Produto {
    private String nome;
    private Integer quantidade;
    private Double valorUnitario;
    private Double valorDesconto;
    private Double valorAcrescimo;
    private Double valorTotal;

    public Produto(String nome, Integer quantidade, Double valorUnitario, Double valorDesconto, Double valorAcrescimo) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
        this.valorDesconto = valorDesconto;
        this.valorAcrescimo = valorAcrescimo;
        this.valorTotal = (valorUnitario*quantidade) + valorAcrescimo - valorDesconto;
    }

    public String getNome(){
        return nome;
    }

    public Double getValorAcrescimo() {
        return valorAcrescimo;
    }

    public void setValorAcrescimo(Double valorAcrescimo) {
        this.valorAcrescimo = valorAcrescimo;
        atualizarValorTotalProduto();
    }

    public Double getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(Double valorDesconto) {
        this.valorDesconto = valorDesconto;
        atualizarValorTotalProduto();
    }

    public Double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
        atualizarValorTotalProduto();
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
        atualizarValorTotalProduto();
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void atualizarValorTotalProduto(){
        this.valorTotal = (valorUnitario*quantidade) + valorAcrescimo - valorDesconto;
    }
}
