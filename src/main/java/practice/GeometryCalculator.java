package practice;

public class GeometryCalculator {

    // метод должен использовать абсолютное значение radius
    public static double getCircleSquare(double radius) {

        return Math.PI * Math.pow(Math.abs(radius), 2);
    }

    // если значение radius меньше 0, метод должен вернуть -1
    public static double getSphereVolume(double radius) {

        return Math.abs((4.0 / 3.0) * Math.PI * Math.pow(radius, 3));
    }

    public static boolean isTrianglePossible(double a, double b, double c) {

        if (a + b > c && b + c > a && c + a > b) {
            return true;
        } else {
            return false;
        }
    }

    // перед расчетом площади рекомендуется проверить возможен ли такой треугольник
    // методом isTrianglePossible, если невозможен вернуть -1.0
    public static double getTriangleSquare(double a, double b, double c) {
        if (isTrianglePossible(a, b, c) == true) {
            double p = (a + b + c) / 2.0;
            return Math.sqrt(p * (p - a) * (p - b) * (p - c));
        } return -1;
    }
}
