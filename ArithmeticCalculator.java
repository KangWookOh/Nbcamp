package calculator;


import java.util.HashMap;
import java.util.Map;

public class ArithmeticCalculator extends Calculator {

    private Map<Character, Operator> operators;


    public ArithmeticCalculator() {
        super();
        operators =new HashMap<>();
        operators.put('+', new AddOperator());
        operators.put('-', new SubtractOperator());
        operators.put('*', new MultiplyOperator());
        operators.put('/', new DivideOperator());
        operators.put('%', new ModOperator());
    }
    public double calculate(double input1, double input2, char sign) {
        Operator operator = operators.get(sign);
        if (operator == null) {
            throw new CalculationException("올바른 연산기호를 입력 하세요");
        }
        double result = operator.operate(input1, input2);
        res.add(result);
        return result;




    }
}
