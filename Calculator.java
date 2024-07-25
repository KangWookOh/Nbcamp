package calculator;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
   private List<Integer> res ;
   private List<Double> circle;
   private static final double pi = 3.14;
   // static을 사용하게 되면 전역변수로써 사용이 가능하지만 상수가 아니므로 언제든 변경될수 있기때문에
    // final을 사용해 해당 값이 저장되면 최종적인 값이 되므로 수정이 불가능하게 된다.

   public Calculator() {
       this.res = new ArrayList<>();
       this.circle = new ArrayList<>();
   }

    int result=0;
    double redius =0;

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
    public double calculateCircleArea(double redius){
        if(redius<0){
            throw new CalculationException("반지름은 양수여야 합니다.");
        }
        double area = pi*redius*redius;
        circle.add(area);
        return  area;
    }
    //getter 구현 메소드
    public List<Integer> getRes() {
        return new ArrayList<>(res);
    }
    public List<Double> getCircle() {
        return new ArrayList<>(circle);
    }
    //setter 구현 메소드
    public void setRes(List<Integer> res) {
        this.res = new ArrayList<>(res);
    }
    public void setCircle(List<Double> circle) {
        this.circle = new ArrayList<>(circle);
    }

    public  void remove(){ // 삭제 메소드 구현
        if(!res.isEmpty()){
            res.remove(0);
            System.out.println("삭제 되었습니다.");
        }
    }
    public void circleRemove(){
        if(!circle.isEmpty()){
            circle.remove(0);
            System.out.println("삭제 되었습니다.");
        }
    }
    public void inquiry(){ // 조회 메소드 구현
        for(int total : res){
            System.out.println(total);
        }
    }
    public void inquiryCricle(){ // 원의 넓이 조회 구현 메소드
        for(double circleTotal : circle){
            System.out.println(circleTotal);
        }
    }


}
