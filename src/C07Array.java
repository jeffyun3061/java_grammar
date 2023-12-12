import java.util.Arrays;
import java.util.Comparator;

public class C07Array {
    public static void main(String[] args) {
        //표현식
//        int[] int_arr = {1,2,3,4};
//        //표현식2
//        int[] int_arr2 = new int[4];
//        int_arr2[0]=1;
//        int_arr2[1]=2;
//        int_arr2[2]=3;
//        int_arr2[3]=4;
//        //표현식3
//        int[] int_arr3 = new int[]{1,2,3,4};

//        표현식4는 불가 : java의 배열은 반드시 길이가 지정되어야함. - 밑에 다시해봐야함 틀림
//        int[] int_arr4 = new int[];
//        String[] arr_st = new String[5];
//        Arrays.fill(arr_st, "");
//        arr_st[0] = "java";
//        arr_st[1] = "C++";
//        arr_st[2] = "python";
//        for(int i = 0; i<arr_st.length;i++){
//            arr_st[i]="";
//        }
//
//        int[] arr_int = new int[5];
//        for(int i = 0; 1<arr_st.length;i++){
//            System.out.println(arr_st[i].length());
//
//        }


//        85, 65 , 90 인 int 배열을 선언한뒤, 총합, 평균값. for 문 이용.
//        int[] arr = {85,65,90};
//        int sum=0;
//        for(int i = 0; i<arr.length; i++){
//            sum += arr[i];
//        }
//        int average = sum/arr.length;
//
//        System.out.println("Sum:" + sum);
//        System.out.println("Average:" + average);

//        최대값, 최소값
//        int[] arr = {10, 20, 30, 12, 8, 17};
//        int max = arr[0];
//        int min = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if (max < arr[i]) {
//                max = arr[i];
//            }
//            if (min > arr[i]) {
//                min = arr[i];
//            }
//        }
//        System.out.println("Maximum value: " + max);
//        System.out.println("Minimum value: " + min);

//        배열의 순서바꾸기
//        int[] arr = {10,20};   //유실 되니까 0번째 값 keep해놓기
//        int temp = arr[0];
//        arr[0] = arr[1];
//        arr[1] = temp;
//        System.out.println(Arrays.toString(arr));

////        0번째 1번째, 1번째 2번째, 2번째랑 3번째 ...마지막까지 체인지
//        int[] arr2 = {10,20,30,40,50,60,70};
//        for(int i=0; i<arr2.length-1; i++){
//            int temp = arr2[i];
//            arr2[i] = arr2[i+1];
//            arr2[i+1] = temp;
//        }
//        System.out.println(Arrays.toString(arr2));

////        배열 뒤집기
//        int[] arr = {1,2,3,4,5};
////        신규배열 선언 : arr2 : [0,0,3,2,1]
//       int[] arr2 = new int[arr.length];
//       for(int i=0; i<arr.length; i++){
//           arr2[arr.length - 1 - i] = arr[i];
//       }
//        System.out.println(Arrays.toString(arr2));
//
////       배열 뒤집기2 : arr 그자체를 뒤집기
//        for(int i=0; i<arr.length/2; i++){
//            int temp = arr[i];
//            arr[i] = arr[arr.length-1-i];
//            arr[arr.length-1-i] = temp;
//       }
//        System.out.println(Arrays.toString(arr));

////        정렬 : sort() 함수 사용
//        int[] arr = {5,1,2,7,3,1,2};
////        오름차순정렬이 기본
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//
////        내림차순
////        방법1. Comparator클래스 사용
////        객체타입인 경우에만 Comparator클래스 사용 가능
//        String[] st_arr = {"hello","hi","bye", "goodmoring"};
//        Arrays.sort(st_arr);
//        System.out.println(Arrays.toString(st_arr));
//        Arrays.sort(st_arr, Comparator.reverseOrder());
//        System.out.println(Arrays.toString(st_arr));
//        Integer[] arr_integer = {5,1,2,7,3,1,2};
//        Arrays.sort(arr_integer, Comparator.reverseOrder());
////        Comparator클래스는 기본형 타입은 처리 불가.
////        Arrays.sort(arr_integer, Comparator.reverseOrder());
//
////        방법2. 배열뒤집기
//        for(int i=0; i<arr.length/2; i++){
//            int temp = arr[i];
//            arr[i] = arr[arr.length-1-i];
//            arr[arr.length-1-i] = temp;
//       }
//        System.out.println(Arrays.toString(arr));
//
////        StreamApi, lambda를 활용한 내림차순 정렬
//        int[] arr2 = {5,1,2,7,3,1,2};
//        int[] new_arr2 =  Arrays.stream(arr2)//arr2를 대상으로 stream객체생성
//                .boxed() //int를 integer로 형변환 한 스트림객체생성
//                .sorted(Comparator.reverseOrder()) //내림차순정렬
//                .mapToInt(a->a) //Integer를 int로 변환
//                .toArray(); //배열로 변환

//        30 22 20 25 12 - 선택 정렬

//        int[] arr = {30,22,20,25,12};
//
//        for (int i=0; i<arr.length- 1; i++){
//            for(int j=i+1; j<arr. length; j++){
//        if (arr[i] <arr[j]){
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[i] = temp;
//                }
//            }
//        }                //n 시간 복잡도, 제곱의 복잡도를 가지고있으면 느리다
//        System.out.println(Arrays.toString(arr));

//        숫자 조합의 합 : 각기 다른 숫자의 배열이 있을때 만들어질수 있는 2개의 조합의 합을 출력하라.

//        int[] int_arr = {10,20,30,40,50,60};
//        for(int i = 0; i<int_arr.length-1; i++){
//            for(int j=i+1; j<int_arr.length; j++){
//                System.out.println(int_arr[i] + "+"+int_arr[j] + " = " +(int_arr[i]+int_arr[j]));
//            }
//
//        }

//        //중복제거하기
//        int[] temp = {10,10,40,5,7,10,5};      //new arr 포함 가능 안가능
//        Arrays.sort(temp);
//        int[] new_temp = new int[temp.length];
//        int index = 0;
//        for(int i=0; i<temp.length; i++){
//            if(i==temp.length-1){
//                new_temp[index] = temp[i];    //index =/ i  와 일치하지않음.
//                index++;
//                break;
//            }
//            if(temp[i]!= temp[i+1]){
//                new_temp[index] = temp[i];
//                index++;
//            }
//            }
//        int[] answer = Arrays.copyOfRange(new_temp, 0, index);
//        System.out.println(index);
//
////        배열복사

//  프로그래머스 문제

//        int[] numbers = {2,1,3,4,1}; //2,3,4,5,6,7,
//        int []numbers_combination = new int[numbers.length * numbers.length];
//        int combination_count = 0;
//        for(int i=0; i<numbers.length-1; i++){
//            for(int j=i+1; j<numbers.length; j++){
//                numbers_combination[combination_count] = numbers[i]+numbers[j];
//                combination_count++;
//            }

//  버블 정렬

//  int[] arr = {55,10,50,20,30,60,35};
//    for(int i=0; i< arr.length-1; i++){
//        for(int j=0; j<arr.length-1-i; j++ ){
//            if(arr[j] > arr[j+1]){
//                int temp=arr[j];
//                arr[j] = arr[j+1];
//                arr[j+1] = temp;
//            }
//        }
//        if(isChanged ==false){
//            breack;


// 고민해보기 변수값으로 구분짓는것 그걸로 어떻게 체크? 힌트 변경이 발생(자리체인지) 하면 정렬아직 ,안일어나면 정렬된것?


////        배열의 검색
//        int[] arr = {5,3,1,8,7};
//        int answer = 0;
//        for(int i=0; i<arr.length; i++){
//        if(arr[i]==8){
//        answer=i;
//        break;

//        System.out.println();
//        이진검색(Binary Search)
//        사전에 오름차순 정렬이 되어 있어야 이진 검색 가능

//        int[] arr = {1,3,6,8,9,11};
//        int answer =Arrays.binarySearch(arr, 8);
//        System.out.println(answer);
//1000개 ?> 선형정렬 : 1000번, 10번(바이너 사용시)
//        1)정렬되어있어야한다
//        2)이진검색 알고리즘

//    힙정렬

////    배열간 비교 : equals, 순서까지 동일해야 true
//        int[] arr1 = {10, 20, 30};
//        int[] arr2 = {20, 30, 10};
//        System.out.println(Arrays.equals(arr1, arr2));

        //배열복사 : copyOF(배열, end), copOfRange(배열, start, end)
//        int[] arr ={10,20,30,40,50};
//        int[] new_arr1 = Arrays.copyOf(arr,10);
//        int[] new_arr2 = Arrays.copyOfRange(arr,1,4);
//        System.out.println(Arrays.toString(new_arr1));
//        System.out.println(Arrays.toString(new_arr2));
//
////        2차원 배열 할당
//        int[][] arr = new int[2][3];
////        {{1,2,3},{4,5,6}}
//        arr[0][0] = 1;
//        arr[0][1] = 2;
//        arr[0][2] = 3;
//        arr[1][0] = 4;
//        arr[1][1] = 5;
//        arr[1][2] = 6;
//
//        System.out.println(Arrays.deepToString(arr));
////        2차원 가변배열 선언 및 할당
//        int[][] arr2 = new int[3][];
//
//        arr2[0] = new int[1];
//        arr2[1] = new int[2];
//        arr2[2] = new int[3];
////        arr2[0][0] = 10;
////        arr2[1][0] = 20;
////        arr2[2][0] = 30;
//        arr2[0] = new int[1];
//        arr2[1] = new int[2];
//        arr2[2] = new int[3];
//        System.out.println(Arrays.deepToString(arr2));
//
////        가변배열 리터럴 방식
//        int[][] arr3 = {{10,},{10,20},{10,20,30}};
//        System.out.println(Arrays.deepToString(arr3));
//
////        [3][4] 사이즈의 배열을 선언 한뒤
////                1,2,3 ~ 12 까지의 숫자값 각 배열에 할당
//
//        int[][] arr4 = new int[3][4];
//        for (int i = 0; i < arr4.length; i++) {
//            int count = 1;
//            for (int j = 0; j < arr4[i].length; j++) {
//                arr4[i][j] = count;       // {1,2,3,4}, {1,2,3,4}, {1,2,3,4}
//                count++;
//            }
////           count++; //1,1,1,1, 2,2,2,2 3,3,3,3
//            }
//        System.out.println(arr4);
//        System.out.println(Arrays.toString(arr4));
//        System.out.println(Arrays.deepToString(arr4));

//        가변 배열 만들기 : 전체사이즈5 -> {{x}, {x,x}, {x,x,x}, {x,x,x,x}, {x,x,x,x,x}}
//        각 배열마다 사이즈 1,2,3,4,5로 켜지도록 : for 문
//        각 사이즈별로 1은 10이 모두 들어가고, 2는 20가 모두 들어가고, 3은 30이 모두 들어가도록 : for 문.

        int[][] arr5 = new int[5][];
        int count = 1;
        for (int i = 0; i < arr5.length; i++){
            arr5[i] = new int[i+1];
            for (int j = 0; j < arr5[i].length; j++){
                arr5[i][j] = count * 10;
            }
            count++;
            }
        System.out.println(Arrays.deepToString(arr5));

    }
}