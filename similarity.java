import java.util.*;

public class Similarity {
    public static double pearsonCorrelation(Map<String, Double> user1, Map<String, Double> user2) {
        List<String> commonItems = new ArrayList<>(user1.keySet());
        commonItems.retainAll(user2.keySet());

        int n = commonItems.size();
        if (n == 0) return 0;

        double sum1 = 0, sum2 = 0, sum1Sq = 0, sum2Sq = 0, pSum = 0;
        for (String item : commonItems) {
            double x = user1.get(item);
            double y = user2.get(item);
            sum1 += x;
            sum2 += y;
            sum1Sq += x * x;
            sum2Sq += y * y;
            pSum += x * y;
        }

        double num = pSum - (sum1 * sum2 / n);
        double den = Math.sqrt((sum1Sq - (sum1 * sum1) / n) * (sum2Sq - (sum2 * sum2) / n));
        if (den == 0) return 0;

        return num / den;
    }
}
