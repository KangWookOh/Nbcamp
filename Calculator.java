package calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private static Calculator instance;
   protected static    List<Double> res ;
   protected static   List<Double> circle;
   private static final double pi = 3.14;
   // static을 사용하게 되면 전역변수로써 사용이 가능하지만 상수가 아니므로 언제든 변경될수 있기때문에
    // final을 사용해 해당 값이 저장되면 최종적인 값이 되므로 수정이 불가능하게 된다.

   public  Calculator() {
       this.res = new ArrayList<>();
       this.circle = new ArrayList<>();

   }
    //getter 구현 메소드
    public List<Double> getRes() {
        return new ArrayList<>();
    }
    public List<Double> getCircle() {
        return new ArrayList<>();
    }
    //setter 구현 메소드
    public void setRes(List<Double> res) {
        this.res = new ArrayList<>();
    }
    public void setCircle(List<Double> circle) {
        this.circle = new ArrayList<>();
    }

    public  void remove(){ // 삭제 메소드 구현
        if(!res.isEmpty()){
            res.remove(0);
            System.out.println("삭제 되었습니다.");
        }
    }
    public  void circleRemove(){
        if(!circle.isEmpty()){
            circle.remove(0);
            System.out.println("삭제 되었습니다.");
        }
    }
    public void inquiry(){ // 조회 메소드 구현
        for(Double total : res){
            System.out.println(total);
        }
    }
    public  void inquiryCricle(){ // 원의 넓이 조회 구현 메소드
        for(Double circleTotal : circle){
            System.out.println(circleTotal);

        }
    }


}
