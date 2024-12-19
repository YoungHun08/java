package a;

// 1번 문제
// -


// -

// 6번 문제
// :

// 7번 문제
// : remove

// 8번 문제
// : while

// 9번 문제
// : 4

// 10번 문제
// : 2

// 11번 문제
// : Child

// 12번 문제
// : 1

// 13번 문제
// : 2

// 14번 문제
// :

// 15번 문제
// : 1

// 16번 문제
// : 3

// 17번 문제
// :

// 18번 문제
// : 2

// 19번
// : '클래스' 파트에 들어오고 나서부터 이해하기가 어려워요..



// 20번
// : 힘든데 재미있어요 :)


import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String name;
    int score;

    public void grade(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

public class Test {
    public static void main(String[] args) {
        // 2번 문제
        int num1 = 10;
        double num2 = 3.5;
        double result = num1 + num2;
        System.out.println(result);

        // 3번 문제
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if (i % 2 == 0) {
            System.out.println("입력하신 숫자는 짝수입니다.");
        } else {
            System.out.println("입력하신 숫자는 홀수입니다.");
        }

        // 4번 문제
        ArrayList<Integer> arrayList = new ArrayList<>(5);

        for (int a = 0; a < 5; a++) {
            arrayList.add(a + 1);
        }

        System.out.println(arrayList);

        // 5번 문제
        // : class Test 바로 위에 클래스를 작성하고 main 메서드 내부에서 객체를 생성하세요.

    }
}
