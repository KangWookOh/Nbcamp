package calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();


        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("사칙연산을 진행하시겠습니까? 원의 넓이를 구하시겠습니까?(사칙연산: calc 원의 넓이 : circle)");
            String mode = sc.next();
            if(mode.equals("calc")){
                System.out.println("첫번쨰 숫자를 입력하세요: ");
                int input1 = sc.nextInt(); // 첫번째 input 받기

                System.out.println("두번째 숫자를 입력하세요: ");
                int input2 = sc.nextInt(); // 첫번째 input 받기
                System.out.println("사칙 연산 기호를 입력 하세요: ");
                char sign = sc.next().charAt(0); // 연산자 받기
                try {
                    int result = calculator.calculate(input1, input2, sign);
                    System.out.println("결과: "+ calculator.result);
                }catch (CalculationException e){
                    System.out.println(e.getMessage());
                }
                System.out.println("더 계산하시겠습니까? (exit 입력 시 종료, remove 입력 시 가장 먼저 저장된 연산 결과 삭제, inquiry 입력 시 모든 연산 결과 조회)");
                String question = sc.next();
                if(question.equals("exit")) {
                    break;
                }
                else if(question.equals("remove")) {
                    calculator.remove();
                    continue;
                }
                else if(question.equals("inquiry")){
                    calculator.inquiry();
                    continue;
                }

            }
            else if(mode.equals("circle")){
                System.out.print("원의 반지름을 입력하세요: ");
                double radius = sc.nextDouble();
                try {
                    double area =calculator.calculateCircleArea(radius);
                    System.out.println("원의 넓이 : "+area);
                }
                catch (CalculationException e){
                    System.out.println(e.getMessage());
                }
            }
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료, remove 입력 시 가장 먼저 저장된 연산 결과 삭제, inquiry 입력 시 모든 연산 결과 조회)");
            String answer = sc.next();
            if(answer.equals("exit")){
               break;
            }
            else if(answer.equals("remove")){
                calculator.circleRemove();
                continue;
            }
            else if (answer.equals("inquiry")){
                calculator.inquiryCricle();
                continue;
            }

        }
}
}