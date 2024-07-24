package calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        // 10개를 저장할수 있는 배열 생성 및 초기화
        List<Integer> results = new ArrayList<Integer>();
        // 배열의 저장된 결과 값 세기
        int count = 0;
        //배열 에 저장할 인덱스
        int index = 0;
       Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("첫번쨰 숫자를 입력하세요: ");
            int input1 = sc.nextInt(); // 첫번째 input 받기
            System.out.println("두번째 숫자를 입력하세요: ");
            int input2 = sc.nextInt(); // 첫번째 input 받기
            System.out.println("사칙연산 기호를 선택해 주세요(+,-,*,/");
            char sign = sc.next().charAt(0); // 연산자 받기
            int result = 0;
            switch (sign) {
                case '+':
                    result = input1 + input2; // +연산
                    break;
                case '-':
                    result = input1 - input2; //-연산
                case '*':
                    result = input1 * input2; //*연산
                case '/':
                    if(input2!=0){ // 조건문을 걸어 나누기 일경우 2번째 입력값이 0이 아닌경우 연산을 수행하고 0일경우 프린트문 출력후 리턴
                        result = input1 / input2; //+연산
                    }
                    else
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    continue;
                default:
                    System.out.println("올바른 연산 기호를 입력하세요"); // 위의 사칙연산 문이 아닌 다른 연산문일시 계속 진행하는 로직
                    continue;
            }
            results.add(result);
            System.out.println("결과: "+result);
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료, remove 입력 시 삭제");
            String question = sc.nextLine(); // 입력값을 받다 exit을 받았을 경우 실행을 멈추는 로직
            if(question.equals("exit")) {
                break;
            }
            else if(question.equals("remove")){
                if(results.isEmpty()){
                    results.remove(0);
                    System.out.println("삭제 되었습니다.");
                }
            }
            else if(question.equals("inquiry")){
                for(int res: results){
                    System.out.println(res);
                }
            }
        }

    }
}
