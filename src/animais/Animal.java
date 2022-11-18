package animais;

import pessoas.Dono;

public abstract class Animal {
    private int id;
    private TipoAnimal tipoAnimal;

    private String nome;
    private int idade;

    private Dono dono;

    public Animal(TipoAnimal tipoAnimal, String nome, int idade, Dono dono) {
        this.id = id;
        this.tipoAnimal = tipoAnimal;
        this.nome = nome;
        this.idade = idade;
        this.dono = dono;
    }

    public Animal(Dono dono){
        this.dono = dono;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setId(int id) {
        this.id = id;
    }


    public void setIdade(int idade) {
        if(idade < 0){
            System.err.println("A idade do cachorro não pode ser negativa");
        } else if(idade > 29) {
            System.err.println("A idade do cachorro não pode ser superior a 29 anos");
        } else {
            this.idade = idade;
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setDono(Dono dono) {
        this.dono = dono;
    }
    public Dono getDono() {
        return dono;
    }

    public void setTipoAnimal(TipoAnimal tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public TipoAnimal getTipoAnimal() {
        return tipoAnimal;
    }

    public int getId() {
        return id;
    }





    @Override
    public String toString() {
        return "Id: " + id +
                "\nTipo do Animal:" + tipoAnimal +
                "\nNome: " + nome +
                "\nIdade: " + idade +
                "\nDono: " + dono;
    }
}
