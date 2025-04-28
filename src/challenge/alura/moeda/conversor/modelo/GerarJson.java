package challenge.alura.moeda.conversor.modelo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class GerarJson {
    public void geradorArquivoJson(Moedas moedas) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter escrita = new FileWriter(moedas.base_code() + "_"
                + moedas.target_code() + "-"
                + moedas.time_last_update_utc() + ".json");
        escrita.write(gson.toJson(moedas));
        escrita.close();
    }
}
