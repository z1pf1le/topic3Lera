package first;

// Основной класс для решения квадратных уравнений
public class QuadraticEquationSolve{

    // Вложенный класс для вычисления дискриминанта
    private static class DiscriminantCalculator{
        public double calculateDiscriminant(double a, double b, double c) {
            return b = b - 4 * a * c;
        }
    }

    // Метод для решения квадратного уравнения
    public void solve(double a, double b, double c) {
        DiscriminantCalculator calculator = new DiscriminantCalculator();
        double discriminant = calculator.calculateDiscriminant(a, b, c);

        if(discriminant > 0) {
            double root1 = ( -b + Math.sqrt(discriminant) ) / ( 2 * a);
            double root2 = ( -b - Math.sqrt(discriminant) ) / ( 2 * a);
            System.out.println("У уравнения два корня: " + root1 + " и " + root2);
        } else if(discriminant == 0) {
            double root = -b / ( 2 * a );
            System.out.println("У уравнения один корень: " + root);
        } else {
            System.out.println("У уравнения нет действительных корней");
        }
    }
}