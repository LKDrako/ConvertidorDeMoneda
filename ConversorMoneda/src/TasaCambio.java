import java.util.Map;
public record TasaCambio(String base_code, Map<String, Double> conversion_rates) {
}