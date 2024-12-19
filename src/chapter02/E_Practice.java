package chapter02;

import java.util.Scanner;

public class E_Practice {
    public static void main(String[] args) {

        /*
            1. 점수에 따른 학점 출력(if, else if, else 사용)

            사용자로부터 점수를 입력받아 아래 기준에 따라 학점을 출력하세요
            0 미만 또는 100 초과인 경우 : 유효하지 않은 점수입니다.
            90점 이상 : A
            80점 이상 : B
            70점 이상 : C
            60점 이상 : D
            그 외 : F

            2. 삼각형 모양의 별(*) 출력 (중첩 for 사용)
            *
            **
            ***
            ****
            *****
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("점수를 입력해 주세요 : ");
        int grade = sc.nextInt();

        if (grade < 0 || grade > 100) {
            System.out.println("유효하지 않은 점수입니다");
        } else if (grade >= 90) {
            System.out.println("A");
        } else if (grade >= 80) {
            System.out.println("B");
        } else if (grade >= 70) {
            System.out.println("C");
        } else if (grade >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        for (int i = 1; i <= 5; i++) {  // 줄 수 (1부터 5까지)

            for (int j = 1; j <= i; j++) {    // 각 줄의 별 개수 (각 줄의 별의 개수는 각 줄의 수 보다 "이하"의 값)
                System.out.print("*");
            }
            System.out.println();
        }

        // (2)
        int rows = 5; //출력할 줄 수

        for (int i = 1; i <= rows; i++) {   // 1부터 rows까지 반복 (i : 1 ~ 5)
            // 공백 반복 (4에서 0까지 감소)
            for (int j = 1; j <= rows - i; j++) { // (j : 4 ~ 0)
                System.out.print(" ");
            }
            // 별 반복 (1에서 5까지 증가)
            for (int k = 1; k <= 1; k++) {  // (k : 1 ~ 5)
                System.out.print("*");
            }

            System.out.println(); // 줄 바꿈 처리를 담당
        }

        // cf) do-while문 사용 예제
        // : 사용자 입력값을 반복적으로 받아 조건에 맞는 값을 처리할 때 유용


        int number;

        do {
            System.out.println("1부터 10사이의 숫자를 입력하세요.");
            number = sc.nextInt();
            // 입력값이 1 ~ 10 사이일 때 반복 종료
        } while (number < 1 || number > 10);

        System.out.println("입력한 숫자는 : " + number);

        sc.close();

        // cf) 동일한 입력 공간(Syste.in)을 여러 번 여는 경우
        // : 표준 입력 스트림을 닫고 재실행하는 경우 에러 발생
        // - 운영체제 자원의 스트림이기 때문에 한 번 닫으면 다시 열 수 없음.
    }
}
