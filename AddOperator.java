package calculator;
// 덧셈을 연산하는 클래스
// Operator를 implements받아 덧셈 구현
public class AddOperator implements  Operator{
    public double operate(double input1, double input2) {
        return input1 + input2;
    }
}
