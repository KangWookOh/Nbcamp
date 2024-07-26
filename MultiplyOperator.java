package calculator;
//곱셈을 연산하는 클래스
// Operator를 implements받아 곱셈 구현
public class MultiplyOperator implements Operator{
    public double operate(double input1, double input2) {
        return input1*input2;
    }
}
