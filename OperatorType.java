package calculator;
// 각 연산자에 해당하는 기호를 정의하는 열거형 클래스
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
    // 연산기호가 맞지 않을때 예외 발생 처리

    public static OperatorType getOperator(char symbol) {
        for (OperatorType type : OperatorType.values()) {
            if (type.symbol == symbol) {
                return type; // 연산자 타입 리턴
            }
        }
        throw new CalculationException("올바른 연산기호를 입력 하세요");
    }
}
