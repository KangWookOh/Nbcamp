package calculator;

public class DivideOperator implements Operator{
    public double operate(double input1, double input2) {
        if(input2 == 0){
            throw new CalculationException("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
        }
        return input1 / input2;

    }
}
