package calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArithmeticCalculator arithmeticCalculator =new ArithmeticCalculator();
        CircleCalculator circleCalculator = new CircleCalculator();

        while (true){
            System.out.println("사칙연산을 진행하시겠습니까? 원의 넓이를 구하시겠습니까?(사칙연산: calc 원의 넓이 : circle)");
            String mode = sc.next();
            if(mode.equals("calc")){

                System.out.println("첫번쨰 숫자를 입력하세요: ");
                int input1 = sc.nextInt(); // 첫번째 input 받기

                System.out.println("두번째 숫자를 입력하세요: ");
                int input2 = sc.nextInt(); // 첫번째 input 받기
                System.out.println("사칙 연산 기호를 입력 하세요 ex(+,-,*,/,%)");
                char sign = sc.next().charAt(0); // 연산자 받기
                try {
                    OperatorType operatorType = OperatorType.getOperator(sign);
                    double result = arithmeticCalculator.calculate(input1, input2,operatorType);
                    System.out.println("결과: "+ result);
                }catch (CalculationException e){
                    System.out.println(e.getMessage());
                }
                System.out.println("더 계산하시겠습니까? (exit 입력 시 종료, remove 입력 시 가장 먼저 저장된 연산 결과 삭제, inquiry 입력 시 모든 연산 결과 조회)");
                String question = sc.next();
                if(question.equals("exit")) {
                    break;
                }
                else if(question.equals("remove")) {
                    arithmeticCalculator.remove();
                    continue;
                }
                else if(question.equals("inquiry")){
                    arithmeticCalculator.inquiry();
                    continue;
                }

            }
            else if(mode.equals("circle")){
                System.out.print("원의 반지름을 입력하세요: ");
                double radius = sc.nextDouble();
                try {
                    double area =circleCalculator.calculateCircle(radius);
                    System.out.println("원의 넓이 : "+area);
                }
                catch (CalculationException e){
                    System.out.println(e.getMessage());
                }
                System.out.println("더 계산하시겠습니까? (exit 입력 시 종료, remove 입력 시 가장 먼저 저장된 연산 결과 삭제, inquiry 입력 시 모든 연산 결과 조회)");
                String answer = sc.next();
                if(answer.equals("exit")){
                    break;
                }
                else if(answer.equals("remove")){
                    circleCalculator.circleRemove();
                }
                else if (answer.equals("inquiry")){
                    circleCalculator.inquiryCricle();
                }
            }
            else{
                System.out.println("다시 입력 해주세요! ");
                continue;
            }



        }
}
}