package challenge.alura.moeda.conversor.test;



import challenge.alura.moeda.conversor.modelo.ConverteMoeda;
import challenge.alura.moeda.conversor.modelo.GerarJson;
import challenge.alura.moeda.conversor.modelo.Menu;

import java.io.IOException;


public class Teste {
    public static void main(String[] args) throws IOException, InterruptedException {
        String moedaBase = "";
        String moedaAlvo = "";

        Menu menu = new Menu();
        ConverteMoeda converteMoeda = new ConverteMoeda();
        GerarJson gerarJson = new GerarJson();
        System.out.println(menu.getMenu());
        gerarJson.geradorArquivoJson(converteMoeda.Converter(moedaBase, moedaAlvo));
        System.out.println("Finalizando aplicação!");
   }
}
