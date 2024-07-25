package calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("첫번쨰 숫자를 입력하세요: ");
            int input1 = sc.nextInt(); // 첫번째 input 받기
            System.out.println("두번째 숫자를 입력하세요: ");
            int input2 = sc.nextInt(); // 첫번째 input 받기
            System.out.println("사칙연산 기호를 선택해 주세요(+,-,*,/)");
            char sign = sc.next().charAt(0); // 연산자 받기
            int result = 0;
            calculator.calculate(input1, input2, sign);

            System.out.println("결과: "+calculator.result);
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료, remove 입력 시 가장 먼저 저장된 연산 결과 삭제, inquiry 입력 시 모든 연산 결과 조회)");
            String question = sc.next(); // 입력값을 받다 exit을 받았을 경우 실행을 멈추는 로직
            if(question.equals("exit")) {
                break;
            }
            if(question.equals("remove")) {
                calculator.remove();
            }
            else if(question.equals("inquiry")){
                for(int res: calculator.getRes()){ // getter 사용 하여 배열 순회
                    System.out.println(res);
                }
            }
        }

    }
}