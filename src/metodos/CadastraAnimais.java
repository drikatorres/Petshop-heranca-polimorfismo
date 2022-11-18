package metodos;

import animais.Animal;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CadastraAnimais {
    private static List<Animal> animaisCadastrados = new ArrayList<>();
    private static int sequence = 1;

    public void cadastra(Animal animal){
        setId(animal);

        if (Objects.nonNull(animal) && Objects.nonNull(animal.getDono())) {
            animaisCadastrados.add(animal);
        } else {
            System.err.println("O animal está como nulo ou está sem o dono!");
        }
    }

    private void setId(Animal animal) {
        animal.setId(sequence);
        animal.getDono().setId(sequence);
        animal.getDono().getEndereco().setId(sequence);
        sequence ++;
    }
    public void imprimeAnimaisCadastrados(){
        System.out.println("############## ANIMAIS CADASTRADOS #################");
        for (Animal animal: animaisCadastrados) {
            System.out.println(animal);
        }
        System.out.println("########## FIM DOS ANIMAIS CADASTRADOS #############");
    }


}
