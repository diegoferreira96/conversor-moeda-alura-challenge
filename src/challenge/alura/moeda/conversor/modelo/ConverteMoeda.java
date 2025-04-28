package challenge.alura.moeda.conversor.modelo;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class ConverteMoeda {
    public Moedas Converter(String moedaBase, String moedaAlvo) {
        String chave = "ef43c38f0b040630afaceea2";
        int opcaoMenu = 0;
        double valorDinheiro = 0;

        Scanner leitura = new Scanner(System.in);
        opcaoMenu = leitura.nextInt();
        System.out.println("Digite o valor: ");
        valorDinheiro = leitura.nextDouble();

        try {
            if (opcaoMenu > 0 && opcaoMenu < 9) {
                switch (opcaoMenu) {
                        case 1:
                            moedaBase = "USD";
                            moedaAlvo = "ARS";
                            break;

                        case 2:
                            moedaBase = "ARS";
                            moedaAlvo = "USD";
                            break;

                        case 3:
                            moedaBase = "USD";
                            moedaAlvo = "BRL";
                            break;

                        case 4:
                            moedaBase = "BRL";
                            moedaAlvo = "USD";
                            break;

                        case 5:
                            moedaBase = "USD";
                            moedaAlvo = "COP";
                            break;

                        case 6:
                            moedaBase = "COP";
                            moedaAlvo = "USD";
                            break;

                        case 7:
                            Menu opcaoMoedas = new Menu();
                            Scanner resposta = new Scanner(System.in);
                            System.out.println(opcaoMoedas.getListaMoedas());
                            System.out.println("Digite a moeda Base: ");
                            moedaBase = resposta.nextLine();
                            System.out.println("Digite a moeda Alvo: ");
                            moedaAlvo = resposta.nextLine();
                            break;

                        case 8:
                            System.out.println("Programa encerrado!");
                            System.exit(0);

                        default:
                            System.out.println("Valor inválido, informe novamente");
                    }


                    URI conversao = URI.create("https://v6.exchangerate-api.com/v6/" + chave + "/pair/" + moedaBase + "/" + moedaAlvo + "/" + valorDinheiro);

                    HttpRequest request = HttpRequest.newBuilder()
                            .uri(conversao)
                            .build();

                    HttpResponse<String> response = HttpClient
                            .newHttpClient()
                            .send(request, HttpResponse.BodyHandlers.ofString());

                    System.out.println(response.body());
                    return new Gson().fromJson(response.body(), Moedas.class);
            }

        } catch (NumberFormatException e) {
            System.out.println("Exceção de formato numérico ");
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Exceção de Argumento Ilegal");
        } catch (JsonSyntaxException e) {
            System.out.println("Exceção de sintaxe JSON");
        } catch (IllegalStateException e) {
            System.out.println("Exceção de Estado Ilegal");
        } catch (NullPointerException e) {
            System.out.println("Exceção de ponteiro nulo");
        } catch (IOException e) {
            System.out.println("IOException");
        } catch (InterruptedException e) {
            System.out.println("InterruptedException");
        }
        return null;
        }

    }





