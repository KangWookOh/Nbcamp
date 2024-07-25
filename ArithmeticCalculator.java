package calculator;


import java.util.HashMap;
import java.util.Map;

public class ArithmeticCalculator extends Calculator {

    private Map<OperatorType, Operator> operators;


    public ArithmeticCalculator() {
        // 생성자 호출 후 사칙 연산을 위해 초기화
        super();
        operators =new HashMap<>();
        operators.put(OperatorType.ADD, new AddOperator());
        operators.put(OperatorType.SUBTRACT,new SubtractOperator());
        operators.put(OperatorType.MULTIPLY,new MultiplyOperator());
        operators.put(OperatorType.DIVIDE,new DivideOperator());
        operators.put(OperatorType.MOD,new ModOperator());

    }
    /*
        두 숫자와 연산자를 받아서 연산수행
        <T> 숫자 타입 (Integer, Double 등)
     */
    public <T extends Number> double calculate(T input1, T input2,OperatorType operatorType) {
        Operator operator = operators.get(operatorType);
        if(operator==null){
            throw new CalculationException("올바른 연산기호를 입력 하세요");
    }
        double result = operator.operate(input1.doubleValue(), input2.doubleValue());
        res.add(result);
        return result;
    }
}
