package Desafios.Desafio2.src.models;

public class Vendedor extends Pessoa{

    private Double percentualComissao;

    public Vendedor(String nome, String cpf, String telefone, String eMail) {
        super(nome, cpf, telefone, eMail);
        this.percentualComissao = 0.05;
    }

    public Double getPercentualComissao(){
        return percentualComissao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return eMail;
    }

    public void setEmail(String eMail) {
        this.eMail = eMail;
    }
}
