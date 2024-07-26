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
    public void resultGreaterThan(double value) {
        res.stream()
                .filter(res-> res > value) // filter가 주어진 조건의 원하는 요소만 추출하는 메소드를 사용하여 기준값보다 큰 요소들을 뽑아냄
                .forEach(System.out::println); //해당 요소들을 순회하고 난 후 출력하는 forEach 메소드
        
    }
}
