package calculator;

public interface Operator {
    double operate(double input1, double input2);
    /*

    각각 AddOpertor,SubtractOperator,MultiplyOperator, DivideOperator 를 분리 한후
    ArithmeticCalculator 에 사용하도록 했고
    각 연산 클래스는 Operator의 메소드를 통해 연산을 수행 하며 책임 분리 


     */

}
