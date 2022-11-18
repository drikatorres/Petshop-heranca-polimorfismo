package animais;

import pessoas.Dono;

public class Cachorro extends Animal {
    private boolean estaDoente;
    public Cachorro(Dono dono, boolean estaDoente) {
        super(dono);
        this.estaDoente = estaDoente;
    }

    public Cachorro(TipoAnimal tipoAnimal, String nome, int idade, Dono dono, boolean estaDoente) {
        super(tipoAnimal, nome, idade, dono);
        this.estaDoente = estaDoente;
    }

    public void setEstaDoente(boolean estaDoente) {
        this.estaDoente = estaDoente;
    }


    public String toString() {
        return "Cachorro: " +
                super.toString();
    }

}
