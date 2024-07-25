package calculator;

public class CircleCalculator extends Calculator{
    private static final  double PI = 3.14;

    public double calculateCircle(double radius) {
        if(radius < 0){
            throw new CalculationException("반지름은 양수여야 합니다");
        }
        double area = PI * radius * radius;
        circle.add(area);
        return area;
    }
}
