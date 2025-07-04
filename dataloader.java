import java.util.*;

public class DataLoader {
    public static Map<String, Map<String, Double>> loadSampleData() {
        Map<String, Map<String, Double>> data = new HashMap<>();

        data.put("Alice", Map.of("Item1", 5.0, "Item2", 3.0, "Item3", 2.5));
        data.put("Bob", Map.of("Item1", 2.0, "Item2", 2.5, "Item3", 5.0, "Item4", 2.0));
        data.put("Carol", Map.of("Item1", 2.5, "Item3", 4.0, "Item4", 4.5, "Item5", 5.0));
        data.put("Dave", Map.of("Item2", 3.5, "Item4", 3.0));

        return data;
    }
}
