import java.util.Arrays;

public class C05LoopPractice {
    public static void main(String[] args) {
//        짝수의 합 계산하기
//        1~20까지 짝수의 합 출력
//        int sum = 0;
//        for (int a = 2; a <= 20; 1++){
//        if(1 % 2  =0)}
//        sum += i;
//
//    }
//}
//System.out.println("1~20까지 짝수의 합: " + sum);
//
//int num = 1234;
//int result =4321;
//
//?
////        최대 공약수 구하기
//////    int a = 24; int b = 36;
//////    int answer = 0 ;
//////for(int i = 24 ; i >= 1;i--){
////        if(a % i == 0 && b % i == 0) {
////            answer = i;
////            break;
////        }
////
////// }
////
////
////        int a = 24; int b = 36;
////        int num = a > b ? b : a;
////        int maxNum =0;
////        for(int i=1, ==0 &&b % i ==0){
//////        maxNum = i;
////
////
////
////            int a=10;
////            int b=20;
//
////        배열과 enhance for문
////            int[] myArr = {1,5,7,9,10};
//////            일반for문
////        for(int i=0; i<5; i++) {
////            System.out.println(myArr[i]);
//////            enhanced for문
////            for(int a : myArr){
////                System.out.println(a);
////            }
////
//////            일반 for 문을 통해 myArr의 값에 10씩 더한 뒤에 출력.
////            System.out.println(Arrays. toString(myArr))};
////        }
//        int[] myArr = {1, 2, 3, 4, 5};
//        for (int i = 0; i < myArr.length; i++) {
//            myArr[i] += 10;
//            System.out.println(Arrays.toString(myArr));
//        }
//
//        int sum = 0;
//        for (int a : myArr) {
//            sum += a;
//        }
//        System.out.println(sum);
//
//
////call by reference, call by vaule
//
//
//// 자바 변수의 유효범위 : {}
//        int num = 10;
//        if (num > 10) {
//            int abc = 20;
//            num = 20;
//        }
//        System.out.println(num); //if문 밖에서 선언된 변수값을 if안에서 접근하여 변경하는 것은 가능.
////            System.out.println(abc); //if 문 안에서 정의된 변수는 밖에서 인지 불가

//다중 반복문
//
//                for(int num=2; num<10; num++){
//                    System.out.println(num + "단 입니다.");
//                    for(int i = 1; i<10; i++)
//                        System.out.println(num + "X" + i+ "= "+num * i);
//                }


//                //2중 for문을 통해 배열접근
//                int[][] arr = {{1,2,3,4}, {5,7,8,9}};
//                for(int k = 0; k<arr. length; k++){
//                for(int i = 0; i<arr[k].length; i++){
//                    System.out.println(arr[k][i]);
//
//            }
//

//                라벨문
        loop1:
        for (int i = 0; i < 5; i++) {
//                        loop2:
            for (int j = 0; j < 5; j++) {
                System.out.println("hello world");
                if (j == 2) {
                    break loop1; // 그냥 break; 하는것과 2개 비교 해보기  3번, 15번
                }
            }
        }
//                            라벨문 활용 1,

        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7}, {8, 9}, {10, 11, 12, 13, 14}};
        int target = 11;
//                        1) target이 matrix에 i,j 번째 배열에 있는지 출력
//                        2)target을 찾으면 반복문 전체 종료
//                        3)순차적으로 조회후에 label써서 첫번째 for문 종료

        l1:
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == target) {
                    System.out.println(i + "," + j + "번째에 있습니다.");
                    break l1;
                }
            }
        }


//                                1 ~ 20 숫자가 있을때, 이 중에 약수가 5개 이상인 숫자중에 가장 작은 값을 구하시오.
//                                불필요한 추가 반복 -> 라벨문
//                                1) 바깥 for 문 : 1 ~ 20 반복
//                                2) 안쪽 for 문 : 약수 찾기 for 문
//                                3) 약수 개수 세는 count값 필요

//                                라벨문 활용2
        int answer = 0;
        l1:
        for (int i = 1; i < 21; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
                if (count >= 5) {
                    answer = i;
                    break;
                }
                if (count == 5) {
                    answer = i;
                    break l1;
                }
            }
        }
        System.out.println(answer);


    }
}
