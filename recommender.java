import java.util.*;

public class Recommender {
    private final Map<String, Map<String, Double>> data;

    public Recommender(Map<String, Map<String, Double>> data) {
        this.data = data;
    }

    public List<Map.Entry<String, Double>> recommend(String user) {
        Map<String, Double> totals = new HashMap<>();
        Map<String, Double> simSums = new HashMap<>();

        for (String other : data.keySet()) {
            if (other.equals(user)) continue;
            double sim = Similarity.pearsonCorrelation(data.get(user), data.get(other));
            if (sim <= 0) continue;

            for (Map.Entry<String, Double> entry : data.get(other).entrySet()) {
                String item = entry.getKey();
                double rating = entry.getValue();

                if (!data.get(user).containsKey(item)) {
                    totals.put(item, totals.getOrDefault(item, 0.0) + rating * sim);
                    simSums.put(item, simSums.getOrDefault(item, 0.0) + sim);
                }
            }
        }

        List<Map.Entry<String, Double>> rankings = new ArrayList<>();
        for (String item : totals.keySet()) {
            rankings.add(Map.entry(item, totals.get(item) / simSums.get(item)));
        }

        rankings.sort((a, b) -> Double.compare(b.getValue(), a.getValue()));
        return rankings;
    }
}
