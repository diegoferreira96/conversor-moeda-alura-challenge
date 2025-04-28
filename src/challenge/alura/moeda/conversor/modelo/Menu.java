package challenge.alura.moeda.conversor.modelo;

public class Menu {
    String menu = """
                ****************************************
                Seja bem vindo ao conversor de moeda!
                    1) Dolar =>> Peso argentino  | 2) Peso argentino =>> Dolar
                    3) Dolar =>> Real            | 4) Real =>> Dolar
                    5) Dolar =>> Peso colombiano | 6) Peso colombiano =>> Dolar
                    7) Comparar outras moedas    | 8) Sair
                ****************************************
                Digite uma opção valida:""";

    String listaMoedas = """
                        ****************************************
                        Lista de moedas!
                        - Real Brasileiro   |   BRL
                        - Dólar Americano   |   USD
                        - Euro              |   EUR
                        - Libra esterlina   |   GBP
                        - Iene              |   JPY
                        - Dólar Australiano |   AUD
                        - Franco Suíço      |   CHF
                        - Dólar Canadense   |   CAD
                        - Renminbi (Yuan)   |   CNY
                        ***************************************""";

    public String getMenu() {
        return menu;
    }
    public String getListaMoedas(){return listaMoedas;}
}
