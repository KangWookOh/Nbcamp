package calculator;

public enum OperatorType {
    ADD('+'),        // 덧셈
    SUBTRACT('-'),   // 뺄셈
    MULTIPLY('*'),   // 곱셈
    DIVIDE('/'),     // 나눗셈
    MOD('%');
    // 나머지 연산
    private char symbol;

    OperatorType(char symbol) {
        this.symbol =symbol;
    }
    // 연산기호로 연산 타입을 반환하는 메소드 구현
    public static OperatorType getOperator(char symbol) {
        for (OperatorType type : OperatorType.values()) {
            if (type.symbol == symbol) {
                return type;
            }
        }
        throw new CalculationException("올바른 연산기호를 입력 하세요");
    }
}
