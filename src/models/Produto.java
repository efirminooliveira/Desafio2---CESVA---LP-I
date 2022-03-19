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
        this.setQuantidade(quantidade);
        this.setValorUnitario(valorUnitario);
        this.setValorDesconto(valorDesconto);
        this.setValorAcrescimo(valorAcrescimo);
        this.valorTotal = (valorUnitario*quantidade) + valorAcrescimo - valorDesconto;
    }

    public Double getValorAcrescimo() {
        return valorAcrescimo;
    }

    public void setValorAcrescimo(Double valorAcrescimo) {
        this.valorAcrescimo = valorAcrescimo;
    }

    public Double getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(Double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public Double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getValorTotal() {
        return valorTotal;
    }
}
