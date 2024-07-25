package calculator;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
   private List<Integer> res ;
   public Calculator() {
       this.res = new ArrayList<>();
   }

    int result=0;
    public int calculate(int input1, int input2,char sign){

        switch(sign){
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
                if (input2 == 0) {
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
    //getter 구현 메소드
    public List<Integer> getRes() {
        return res;
    }
    //setter 구현 메소드
    public void setRes(List<Integer> res) {
        this.res = new ArrayList<>();
    }
    public  void remove(){ // 삭제 메소드 구현 
        if(!res.isEmpty()){
            res.remove(0);
            System.out.println("삭제 되었습니다.");
        }
    }


}
