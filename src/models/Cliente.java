package Desafios.Desafio2.src.models;

public class Cliente extends Pessoa {

    public Cliente(String nome, String cpf, String telefone, String eMail) {
        super(nome, cpf, telefone, eMail);
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
