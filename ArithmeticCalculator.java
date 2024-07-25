package calculator;


import java.util.HashMap;
import java.util.Map;

public class ArithmeticCalculator extends Calculator {

    private Map<OperatorType, Operator> operators;


    public ArithmeticCalculator() {
        super();
        operators =new HashMap<>();
        operators = new HashMap<>();
        operators.put(OperatorType.ADD, new AddOperator());
        operators.put(OperatorType.SUBTRACT,new SubtractOperator());
        operators.put(OperatorType.MULTIPLY,new MultiplyOperator());
        operators.put(OperatorType.DIVIDE,new DivideOperator());
        operators.put(OperatorType.MOD,new ModOperator());

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
