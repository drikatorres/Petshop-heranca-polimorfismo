package pessoas;

import endereco.Endereco;

public class Dono extends Pessoa {

    public Dono(String nome, String cpf, String email, Endereco endereco) {
        super(nome, cpf, email, endereco);
    }

    public Dono(String nome, Endereco endereco) {
        super(nome, endereco);
    }
}
