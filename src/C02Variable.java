import java.math.BigDecimal;

public class C02Variable {
    //    byte로 썻을때 -128~127까지의 표현이 가능하고, 그 이상을 세팅할때 오버/언더 플로우 발생
    public static void main(String[] args) {
        byte num1 = 127;
        byte num2 = -128;
        num1++;
        num2--;
        System.out.println(num1);
        System.out.println(num2);

        float f1 = 1.123456789f;
        double b1 = 1.123456678;
        System.out.println("f1 : " + f1);
        System.out.println("b1 : " + b1);
//        부동소수점 오차 테스트
        double double_num = 0.1;
//        미세오차는 조정되어 정상적으로 출력
        System.out.println(double_num);
//        반복적인 연산시 오차가 확대되어 오차확인가능
//        초기식 조건식 증강식
//        for (int i = 0; i < 100; i++) {
//        }
//
//        double total = 0;
//        for (int i = 0; i < 1000; i++) {
//            total = total + 0.1;
//        }
//        System.out.println(total);
//
//        System.out.println(0.1 + 0.1);
//        System.out.println(0.1 + 0.2);
//
//        System.out.println(total);
//        System.out.println(0.1 * 10);{
//    }
//    System.out.println(total/10);
//
//        String abc = "hello";
//    BigDecimal myBig = new BigDecimal("1.03");
//
//    double d1 = 1.03;
//    double d2 = 0.42;
//        System.out.println(d1-d2);
//
////        저장할때는 문차열 -> 연산할때는 정수로 변환 -> 최종결과는 실수로 반환
//        BigDecimal myBig1 = new BigDecimal("1.03");
//        BigDecimal myBig2 = new BigDecimal("0.42");
////
//        double result = myBig1.subtract(myBig2).doubleValue();
//        System.out.println(myBig1.subtract(myBig2));

//        문자 : char

//        char my_char = '가';
//        System.out.println(my_char);
//
////        boolean : true(1) or false(0)
//        boolean my_bool = true;
//        System.out.println(my_bool);
////        if(my_bool==true)
//        if(my_bool){
//            System.out.println("조건식이 참입니다.");
//        }
//        int bool_num1 = 20;
//        int bool_num2 = 10;
////        if(true)
//        if(bool_num1 > bool_num2){
//
//            System.out.println("조건식이 참입니다.");
//        }

//        boolean이 first로 할당이 된다?
//        boolean my_boolean;
//        System.out.println(my_boolean);
//        boolean[] my_boolean = new boolean[5];
//        System.out.println(my_boolean[0]);
//
////
////
////        묵시적 타입 변환
//        char ch1 = 'a';
//        int ch1_num = ch1;
//        System.out.println(ch1_num);
//
////        char 알파벳 비교를 위한 묵시적 타입변환 일어난다.
//        System.out.println('A' > 'a');

//        int my_int1 = 10;
////        int > double
//        double my_double01 = my_int1;
//        System.out.println(my_double01);
//        명시적 타입은 가능 : 소수점값 손실 발생 가능성이 있다.
//        에러 발생 : my_int1 = my_double1;
//        double > int 명시적 타입은 가능 : 소수점값 손실 발생 가능성이 있다.
//        my_int1 = (int)my_double01;
//        double my_double2 = 7.2f;
//        System.out.println(my_double2);
//
////        명시적 타입 변환
//        char my_char2 = 'b';
//                int char_num = (int)my_char2;
////                int a가 1 int b가 4일때 둘을 나눈 값을 int c에 담아 출력. double d에 담아 출력.

        int a = 1;
        int b = 4;
        int c = a/b;
        double d = a/b;
        System.out.println(c);
        System.out.println(d);
        double d2 = a/(double)b;
        System.out.println(d2);

//        변수와 상수
//        선언과 동시에 초기화
        int a1 = 10;
//        변수값 변경
        a1 = 20;
//        선언만 한 뒤에 나중에 초기화
        int a2; //선언만 됐을때는 값이 0으로 초기화
        a2 = 20;
//        상수는 값의 재할당이 불가능
        final int AGES = 20;
//        상수는 값의 변경이 불가능 => AGES = 30; 에러 발생
//        상수는 선언만 한 뒤에 나중에 초기화 하는 방식이 java8이전에는 안됐었지만, 이후 가능해짐.
        final int AGES2;
        AGES2 = 20;





    }
}


