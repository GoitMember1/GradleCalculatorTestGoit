public class SumCalculator {
    public int sum(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be a non negative integer");
        }
        return n * (n + 1) / 2;
    }
}