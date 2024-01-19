import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaHomemMulher {
    public static void main (String args []){

        List<Pessoa> listaHomens = new ArrayList<>();
        List<Pessoa> listaMulher = new ArrayList<>();

        //Adicionar pessoas a lista
        listaHomens.add(new Pessoa("José", "-m"));
        listaMulher.add(new Pessoa("Geovanna", "-f"));
        listaHomens.add(new Pessoa("Mario", "-m"));
        listaMulher.add(new Pessoa("Timoteo", "-m"));

        System.out.println("Lista de homens: ");
        exibirPessoas(listaHomens);

        System.out.println("Lista de mulheres: ");
        exibirPessoas(listaMulher);

    }
    private static void exibirPessoas(List<Pessoa> Lista){
        for (Pessoa pessoa : Lista){
            System.out.println("Nome: " + pessoa.getNome()+ ", Sexo: " + pessoa.getSexo());
        }

    }
}
