package testes;

import animais.Cachorro;
import animais.Gato;
import animais.TipoAnimal;
import endereco.Endereco;
import metodos.CadastraAnimais;
import pessoas.Dono;

public class TestePetshop {
    public static void main(String[] args) {

        Endereco enderecoDrika = new Endereco("Amarela", "10A", "77777-7777", "Laranjeiras", "Distrito 9");
        Dono drika = new Dono("Drika", "006.222.888-22", "emaildadrika@email.com", enderecoDrika);

        Endereco enderecoMariazinha = new Endereco("Azul", "15C", "333333-3333", "Pitanga", "Condado");
        Dono mariazinha = new Dono("Mariazinha", "222.222.222-22", "emaildamariazinha@email.com", enderecoMariazinha);

        Cachorro cachorroBeto = new Cachorro(TipoAnimal.CACHORRO, "Beto", 15, drika, false);
        Gato gataPetunia = new Gato(TipoAnimal.GATO, "Petunia", 5, mariazinha, false);

        CadastraAnimais cadastraAnimais = new CadastraAnimais();
        cadastraAnimais.cadastra(cachorroBeto);
        cadastraAnimais.cadastra(gataPetunia);

        cadastraAnimais.imprimeAnimaisCadastrados();

    }
}
