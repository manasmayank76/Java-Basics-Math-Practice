public class RandomStats {
    public static void main(String[] args) {
        double[] numbers = new double[5];
        double sum = 0;

        for (int i = 0; i < 5; i++) {
            numbers[i] = Math.random();
            sum += numbers[i];
            System.out.println("Random number " + (i + 1) + ": " + numbers[i]);
        }

        double average = sum / 5;
        double min = numbers[0], max = numbers[0];

        for (int i = 1; i < 5; i++) {
            min = Math.min(min, numbers[i]);
            max = Math.max(max, numbers[i]);
        }

        System.out.println("\nAverage: " + average);
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}
