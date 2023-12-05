import java.util.Random;

public class Main {
    public static void main(String[] args) {
        double[] weight = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double sum = 0;
        for (int i = 0; i < weight.length; i++) {
            weight[i] = new Random().nextDouble(40, 100);
            sum += weight[i];

            if (weight[i] <= 80.9 && weight[i] >= 60) {
                System.out.println("Люди с весом в диапозоне 80 - 60 кг: " + weight[i]);
            }

        }
        System.out.println("\n\nСредний вес всех людей: " + sum / 10);

    }
}
