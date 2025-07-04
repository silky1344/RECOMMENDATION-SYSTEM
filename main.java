import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Map<String, Double>> data = DataLoader.loadSampleData();
        Recommender recommender = new Recommender(data);

        String user = "Alice";
        List<Map.Entry<String, Double>> recommendations = recommender.recommend(user);

        System.out.println("Recommendations for " + user + ":");
        for (Map.Entry<String, Double> entry : recommendations) {
            System.out.printf("%s: %.2f\n", entry.getKey(), entry.getValue());
        }
    }
}
