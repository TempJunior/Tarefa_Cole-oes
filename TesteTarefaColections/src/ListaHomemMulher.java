import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListaHomemMulher {
    public static void main (String args []){
        List<Pessoa> pessoas = new ArrayList<>();
        List<Pessoa> homens = new ArrayList<>();
        List<Pessoa> mulheres = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        int QuantidadePessoas;
          System.out.println("Digite a quantidade de pesssoas: ");
        QuantidadePessoas = s.nextInt();
        for (int i = 0; i < QuantidadePessoas; i++) {

            System.out.print("Digite o nome da pessoa: ");

            String nome = s.next();
            System.out.print("Digite o sexo da pessoa (M/F): ");

            char sexo = s.next().charAt(0);



            Pessoa pessoa = new Pessoa(nome, sexo);

            pessoas.add(pessoa);



            if (sexo == 'M') {

                homens.add(pessoa);

            } else if (sexo == 'F') {

                mulheres.add(pessoa);

            }

        }











        }


    }

