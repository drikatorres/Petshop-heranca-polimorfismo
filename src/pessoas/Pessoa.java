package pessoas;

import endereco.Endereco;

public abstract class Pessoa {
    private int id;
    private String nome;
    private String cpf;
    private String email;

    private Endereco endereco;

    public Pessoa(String nome, String cpf, String email, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.endereco = endereco;
    }

    public Pessoa(String nome, Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;
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

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (this.id == 0){
            this.id = id;
        }
    }

    @Override
    public String toString() {
        return "Pessoa: " +
                "\nId: " + id +
                "\nNome: " + nome +
                "\nCpf: " + cpf +
                "\nE-mail: " + email +
                "\nEndereco: " + endereco;
    }
}
