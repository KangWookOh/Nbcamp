package calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
     List<Integer> results ;
     public Calculator(){
         this.results =new ArrayList<>();
     }
    int result =0;
     public int calculate(int num1, int num2,char sign) {
         switch (sign){
             case '+':
                 result = num1 + num2;
                 break;
             case '-':
                 result =num1 - num2;
                 break;
             case '*':
                 result =num1 * num2;
                 break;
             case '/':
                 if(num2 == 0){
                     throw  new IllegalStateException("분모가 0이되면 안됩니다.");
                 }
                 result=  num1 /num2;
                 break;
             default:
                 throw new CalculationException("올바른 연산 기호를 입력하세요");
         }
         results.add(result);
         return result;

     }





}
