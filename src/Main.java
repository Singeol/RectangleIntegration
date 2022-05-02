import java.util.Scanner;

public class Main {
    public double rectangleIntegration(Calculator calculator, double bottomEdge, double topEdge, int stepCount) {
        double step = (topEdge - bottomEdge) / stepCount;
        double square = 0;
        for (int i = 0; i < stepCount; i++){
            double x = bottomEdge + step * i;
            double Si = step*calculator.func(x);
            square += Si;
        }
        return square;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        Main integral = new Main();
        double bottomEdge = scanner.nextDouble();
        double topEdge = scanner.nextDouble();
        int stepCount = scanner.nextInt();
        System.out.println(integral.rectangleIntegration(calculator, bottomEdge, topEdge, stepCount));
    }
}
