public class C03Operator {
    public static void main(String[] args) {
////        산술연산자
//        int num1=8, num2=3;
////        = int num1 = 8
////          int num2 = 3
////        int num1=8; num2=3;
////        *, /나눗셈, %나머지
//        System.out.println("num1 + num2 = " + (num1 + num2));
//        System.out.println("num1 - num2 = " + (num1 - num2));
//        System.out.println("num1 * num2 = " + (num1 * num2));
//        System.out.println("num1 / num2 = " + (num1 / (double)num2));
//        System.out.println("num1 -% num2 = " + (num1 % num2));
//
////        대입 연산자
//        int n1=7, n2=7, n3=7;
//        n1 = n1 - 3;
//        n2 -= 3;
//        n3 =- 3;
//
////        /=, %=
//        int n4 = 10;, int n5 = 10;
//        n4 /= 3;
//        n5 %= 3;
//        System.out.println("n4 = " + n4 + " n5 = " +n5);
//
////        증감연산자
////  ++ 헷갈리니 따로 쓰기
//        int a = 5;
//        int b = a++; //후위연산자 : 실행문이 끝나고 증감
//        System.out.println(a); //6
//        System.out.println(b); //5
//
//        a=5;
//        b=++a; //전위연산자 : 실행문이 끝나기전에 증강
//        System.out.println(a); //6
//        System.out.println(b); //6
//
//        int[] arr = {10,20,30};
//        a=0;
//        System.out.println(arr[a]);
//        a++;
//        //배열 변경해도 괜찮음! ??
//
////        비교연산자 : == , !=, >, >= ...

//        char char1 = 'a';
//        char char2 = 'A';
//        System.out.println(char1 == char2); //false
//        System.out.println(char1 != char2); //true
//
////        논리연산자 : &&, ||, !
//        int num1= 10; int num2=20;
//        boolean result1, result2;
//
//        result1에 num1이 5보다 큰지 조건과 num1 20보다 작은지 조건을 and 조건을 통해 boolean 값 담기
//        result2에 num2가 10보다 작은 조건과 num2가 30보다 작은 조건을 or 조건을 통해 boolean 값 담기
//        result2에 ! 달아서 출력

//
//        result1 = (num1 > 5) && (num1<20)
//                boolean result1, result2;
//        result1 = !(num1 > 5) && (num1<20));
//        System.out.println(result1);
//        result1, result2 각각 출력
//        result에 !달아서 출력.
//        result2 = num2 < 10 || num2 < 30;
//        System.out.println(result2);
//
//        boolean result1 = (num1 > 5) && (num1 < 20);
//        boolean result2 = (num2 < 10) || (num2 < 30);
////        result1, result2 각각 출력
////        result에 !달아서 출력.
//        System.out.println(result2);
////?
//
////
////
//
//
//        System.out.println(2 & 1);
//        System.out.println(2>0 & 3>0);
//
//
//        int n1 = 10; int n2 = 20;
//        if(n1<20 && n2<30){
//            System.out.println("조건은 참입니다.");

//            0000101   // 0000110

////        0000101:2^3 + 2^1
//            int n1 = 5; int n2 = 6;
////            비트연산자 : &, 각자리의수가 모두 1일경우면 1
//            System.out.println(n1 & n2); //4 => 0000100
////            비트연산자 : |, 각자리의수가 하나라도 1일경우는 1
//            System.out.println(n1 | n2); //7 => 0000111
////            비트연산자 : ^, 각자리의수가 일치하지 않는 경우에 1
//            System.out.println(n1 ^ n2); //3 => 0000011
////            ~ : not연산, 각자리마다 반대의 숫자 변환
//            System.out.println(~ n1); //첫째자리가 음/양인데, 음으로 변환
////            시프트연산자 : <<, >> => 곱셈과 나눗셈의 효과가 발생
//            System.out.println(n1 << 1); //      0001010
//
//        int a = 13; //00001101
//        int b = 9;  //00001001
//
//        while (true){
//            int same_index = a & b; //and연산으로 구한 carry 생성
//            a = a ^ b; //XOR연산으로 구한 비트값 a에 할당
//            b = same_index << 1;
//
//            while(b!=0) {
//                int same_index = a & b;
//                a = a ^ b;
//                b = same_index << 1;
//            }

//                첫번째 반복
//                sameindex : 1001
//                a : 00100
//                b : 10010
//                a : 10110


//                System.out.println(a);
            }
        }

