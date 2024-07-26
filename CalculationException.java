package calculator;
//계산중에 발생하는 예외를 정의하는클래스
public class CalculationException extends RuntimeException{
    public CalculationException(String message){
        super(message);
    }
}
