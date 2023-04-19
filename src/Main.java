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
        System.out.print("Введите нижнюю границу интегрирования: ");
        double bottomEdge = scanner.nextDouble();
        System.out.print("Введите верхнюю границу интегрирования: ");
        double topEdge = scanner.nextDouble();
        System.out.print("Введите количество шагов разбиения: ");
        int stepCount = scanner.nextInt();
        // Вывод результата интегрирования на экран
        System.out.println("Результат интегрирования: " + integral.rectangleIntegration(calculator, bottomEdge, topEdge, stepCount));
    }
}