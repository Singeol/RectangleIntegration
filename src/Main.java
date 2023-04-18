import java.util.Scanner;

public class Main {
    // Метод прямоугольников для численного интегрирования
    public double rectangleIntegration(Calculator calculator, double bottomEdge, double topEdge, int stepCount) {
        // Шаг сетки
        double step = (topEdge - bottomEdge) / stepCount;
        // Переменная для сохранения площади
        double square = 0;
        // Цикл интегрирования
        for (int i = 0; i < stepCount; i++){
            // Определение координаты X текущего прямоугольника
            double x = bottomEdge + step * i;
            // Определение площади текущего прямоугольника
            double Si = step*calculator.func(x);
            // Добавление площади текущего прямоугольника к общей площади
            square += Si;
        }
        // Возврат общей площади
        return square;
    }

    public static void main(String[] args) {
        // Создание объектов сканнера, калькулятора и главного класса
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        Main integral = new Main();
        // Получение границы нижнего интеграла, верхнего интеграла и количества шагов с клавиатуры
        double bottomEdge = scanner.nextDouble();
        double topEdge = scanner.nextDouble();
        int stepCount = scanner.nextInt();
        // Вывод результата интегрирования на экран
        System.out.println(integral.rectangleIntegration(calculator, bottomEdge, topEdge, stepCount));
    }
}