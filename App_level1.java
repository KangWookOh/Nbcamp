package calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App_level1 {
    public static void main(String[] args) {
        List<Integer> res = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);


        int result = 0;
        while (true){
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int input1 =sc.nextInt(); // 첫번째 숫자 입력
            System.out.print("두 번째 숫자를 입력하세요: ");
            int input2 =sc.nextInt(); // 두번째 숫자 입력
            System.out.print("사칙연산 기호를 입력하세요: ");
            char sign = sc.next().charAt(0); // 문자열의 첫번쨰 문자 확인
            switch (sign) {
                case'+':
                    result = input1 + input2;
                    break;
                case'-':
                    result = input1 - input2;
                    break;
                case'*':
                    result = input1 * input2;
                    break;
                case'/':
                    result = input1 / input2;
                    break;
            }
            res.add(result);
            System.out.println("결과: " + result);

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            System.out.println("remove 입력시 가장 먼저 저장된 결과 삭제");
            String answer = sc.next(); // 입력값 받은후 해당 입력값이 if문 과 같다면 해당 if문 수행
            if(answer.equals("exit")){
                break;
            }
            else if(answer.equals("remove")){
                if(!res.isEmpty()){
                    res.remove(0);
                    System.out.println("삭제 되었습니다");
                    break;
                }
            }
          




        }






    }
}
