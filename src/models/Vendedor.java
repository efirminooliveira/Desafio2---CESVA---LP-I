package Desafios.Desafio2.src.models;

public class Vendedor {
    private String nome;
    private String cpf;
    private String telefone;
    private String email;
    private Double percentualComissao;

    public Vendedor(String nome, String cpf, String telefone, String email){
        this.nome  = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
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
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
