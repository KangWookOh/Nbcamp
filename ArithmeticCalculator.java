package calculator;

public class ArithmeticCalculator extends Calculator{


    public int calculate(int input1, int input2, char sign){
        int result =0;
        switch (sign){
            case '+':
                result = input1 + input2;
                break;
            case '-':
                result = input1 - input2;
                break;
            case '*':
                result = input1 * input2;
                break;
            case '/':
                if(input2 == 0){
                    throw new CalculationException("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                }
                result = input1 / input2;
                break;
            default:
                throw new CalculationException("올바른 연산기호를 입력하세요");
        }
        res.add(result);
        return result;

    }
}
