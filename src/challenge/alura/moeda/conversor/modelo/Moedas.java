package challenge.alura.moeda.conversor.modelo;

public record Moedas(String base_code, String target_code,
                    String conversion_rate, String conversion_result,
                    String time_last_update_utc, String time_next_update_utc) {
}
