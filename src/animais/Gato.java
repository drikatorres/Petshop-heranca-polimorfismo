package animais;

import pessoas.Dono;

public class Gato extends Animal{
    private boolean estaDoente;

    public Gato(TipoAnimal tipoAnimal, String nome, int idade, Dono dono, boolean estaDoente) {
        super(tipoAnimal, nome, idade, dono);
        this.estaDoente = estaDoente;
    }

    public Gato(Dono dono, boolean estaDoente) {
        super(dono);
        this.estaDoente = estaDoente;
    }

    public void setEstaDoente(boolean estaDoente) {
        this.estaDoente = estaDoente;
    }

    @Override
    public String toString() {
        return "Gato: " +
                super.toString();
    }
}
