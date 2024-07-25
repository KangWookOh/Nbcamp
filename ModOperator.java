package calculator;

public class ModOperator implements Operator{
    @Override
    public double operate(double input1, double input2) {
        if(input2 == 0){
            throw new CalculationException("나머지 연산에서 두번째 정수에 0이 입력될 수 없습니다.");
        }
        return input1 % input2;
    }
}
