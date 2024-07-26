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
    public void circleGreaterThan(double value){
        circle.stream()
                .filter(circle->circle>value) // filter가 주어진 조건의 원하는 요소만 추출하는 메소드를 사용하여 기준값보다 큰 요소들을 뽑아냄
                .forEach(System.out::println); //해당 요소들을 순회하고 난 후 출력하는 forEach 메소드

    }
}
