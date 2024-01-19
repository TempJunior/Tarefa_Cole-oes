package PrimeiraParte;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListOrdemAlfabetica {
    public static void main(String args[]) {
        ListaUm();
        ListaDois();
    }
    public static void ListaUm(){
        List<String> um = new ArrayList<>();
        um.add("Geovanna");
        um.add("Joselito");
        um.add("Angelita");
        um.add("Rebeca");

        Collections.sort(um);
        System.out.println(um);
    }
    //Usando metodo Split do jeito que aprendi
    public static void ListaDois(){
        String NomesString = "Geovanna, Joselito, Angelita, Rebeca";
        String[] NomesArray = NomesString.split(", ");
        List<String> NomesList = Arrays.asList(NomesArray);
        Collections.sort(NomesList);

        for(String nome : NomesList){
            System.out.println(nome.trim());
        }
    }
}