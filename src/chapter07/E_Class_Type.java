package chapter07;

// === 자바에서의 타입 변환 === //
// 1) 자료형 변환 : 변수 & 자료형에서의 자동 형 변환(묵시적), 강제 형 변환(명시적)
// 2) 클래스 타입 변환
// - 자동 타입 변환(Upcasting), 강제 타입 변환(Downcasting)
// : 자료형 변환보다 가능한 범위가 좁음.
//      >> 상속 관계에 있는 클래스 사이에서만 변환 가능

class Parent {
    void displayInfo() {
        System.out.println("부모 클래스입니다.");
    }
}

class Child extends Parent {
    @Override
    void displayInfo() {
        System.out.println("자식 클래스입니다.");
    }

    void childMethod() {
        System.out.println("자식 클래스만이 가진 메서드입니다.");
    }
}

public class E_Class_Type {
    public static void main(String[] args) {
        // == 자동 타입 변환 (Upcasting, 업캐스팅) == //
        // : 자식 객체를 부모 클래스 타입으로 변환
        // >> 직접 명시 X, 자동으로 타입 변환이 일어남

        // 1. 자식 객ㅊ체를 생성하면서 즉시 부모 타입으로 변환하여 저장
        // 부모클래스 객체변수 = new 자식 클래스();
        Parent childObject = new Child(); // 자동 타입 변환

        childObject.displayInfo(); // 자식 클래스입니다.

        // == 강제 타입 변환(Downcasting, 다운캐스팅) == //
        // : 부모 클래스 타입으로 변환된 객체를 다시 자식 클래스 타입으로 변환하는 것
        // >> 자식 클래스에만 정의된 멤버에 접근 가능

        // 자식타입 객체변수 = (자식타입) 부모객체;


    }
}
