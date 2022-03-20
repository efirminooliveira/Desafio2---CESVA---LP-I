package Desafios.Desafio2.src.models;

abstract class Pessoa {
    protected String nome;
    protected String cpf;
    protected String telefone;
    protected String eMail;

    
    public Pessoa(String nome, String cpf, String telefone, String eMail) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.eMail = eMail;
    }

    
}
