package calculator;

import java.util.Scanner;

public class App_level1 {
    public static void main(String[] args) {
        int[] res =new int[10];
        int index =0;
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
            System.out.println("결과: " + result);
            //연산 결과 배열의 저장
                if(index < res.length){ // 인데스가 배열의 길이 보다 작으면 인덱스 증가 수행
                    res[index] = result;
                    index++;
                }
                else {
                    for(int i = index; i < res.length; i++){ // 배열이 가득 찬 경우 한칸씩 이동시키고 새로운 결과를 마지막에 저장
                        res[i -i] =res[result];
                    }
                    res[res.length - 1] = result;
                }
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String answer = sc.next(); // 입력값 받은후 해당 입력값이 if문 과 같다면 해당 if문 수행
            if(answer.equals("exit")){
                break;
            }




        }






    }
}
