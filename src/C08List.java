import java.util.*;
import java.util.stream.Collectors;
//import java.util.*;

public class C08List {
    public static void main(String[] args) {
        //list선언방법
//        ArraysList<String> myList = new ArrayList<String>();
//    ArrayList<String> myList = new ArrayList<>();
//    가장 일반적인 방식
////    왼쪽엔 인터페이스, 오른쪽엔 구현체
//        List<String> myList = new ArrayList<>();
//
////        초기값 생성방법1.
//        myList.add("java");
//        myList.add("python");
//        myList.add("c++");
//        System.out.println(myList);
//
////        초기값 생성방법2. 한꺼번에 add
//        String[] myArr1 = {"java", "python","c++"};
//        List<String> myList2 = new ArrayList<>(Arrays.asList(myArr1));
////        배열이 int인 경우  -> 형변환 이슈 발생
//        int[] myIntArr1 = {1,2,3};
//        List<Integer> myIntLIst1 = new ArrayList<>();
//        for(int a : myIntArr1){                         //int 타입문제 생길때 for 문으로 왔다갔다?
//            myIntLIst1.add(a);
        }

//        List<Integer> myList = new ArrayList<>();{
//        myList.add(10);
//        myList.add(20);
//        //add(int index, int element) : 중간에 값 삽입은 기본적으로 성능저하
//    myList.add(1,15);
//    System.out.println(myList);
//    List<Integer> myList2 = new ArrayList<>();
//    myList2.add(30);
//    myList2.add(40);
//    myList2.add(50);
//
////    addAll(Collection객체) : 특징 리스트의 요소를 모두 add
//    myList.addAll(myList);
////    get(int index) : 특정 위치의 요소를 반환
//        System.out.println(myList.get(0));
//
////        for 문을 돌려 전체 출력.
////        size() : 러스트의 계수 반환 - 자주씀
//        for(int i=0;i<myList.size();i++){
//            myList.get(i);
//        }
//
////        remove : 요소삭제              //index : 0 (1)   , mysql id
////        remove는 value삭제, index를 통한 삭제
//
////        remove를 통한 index삭제 : 0번째
//        myList.remove(0);
//        System.out.println(myList);
////        객체를 통한 삭제 : Integer.valueof
//        myList.remove(Integer.valueOf(15));
//        System.out.println(myList);
//
////        set(int index, E elemonet) : index자리에 값 변경.
////        마지막자리값 : 100으로 세팅 후 출력
//        myList.set(myList.size()-1,100);
//
////        contains : 특정값이 있는지 없는 boolean return
//        System.out.println(myList.contains(30));
//
//        List<Integer> mylist= new ArrayList<>();
//        mylist.add(10);
//        mylist.add(10);
//        mylist.add(20);
//        mylist.add(30);
////        indexOf : 몇번째 index에 위치한지 return, 요소가 없으면 -1 return
////        같은 숫자가 있으면 첫번째 index값 return
//        System.out.println(mylist.indexOf(20));
//
////        전체삭제 : clear()
////        isEmpty : 값이 비어있는지, 안비어있는지
//        System.out.println(myList.isEmpty());
//        mylist.clear();
//        System.out.println(myList.isEmpty());
//        System.out.println(myList);
//
////        리스트 출력
//       List<int[]> myList = new ArrayList<>();
//       myList.add(new int[3]);
//       myList.add(new int[3]);
//       myList.add(new int[3]);
//
////       위 list에 값  1,2,3 10,2,30  100,200,300              //이해 꼭 하기
//
//        for(int i=0; i<myList.size(); i++){
//            int value = 1;
//            for(int j=0; j<myList.get(i).length; j++){
//                myList.get(i)[j] = (j+1)*value;
//            }
//            value *= 10;
//        }
//
//        List<Integer> myList = new ArrayList<>(Arrays.asList(5,3,2,1,5));
//        //라스트정렬1 : Collections.sort()
//        Collection.sort(myList);
//        System.out.println(myList);
//        Collection.sort(myList, Comparator.reverseOrder());
//        System.out.println(myList);
//
//        //라스트정렬2 : 객체.sort()
//        myList.sort(Comparator.naturalOrder());
//        System.out.println(myList);
//        myList.sort(Comparator.reverseOrder());
//        System.out.println(myList);
//
////        1.String배열을 list로 변환
//        String[] stArr = {"java", "spring", "django"};
////        1-1. Arrays.asList
//        List<String> stList1 = new ArrayList<>(Arrays.asList(stArr));
////        1-2. for문담기
//        List<String> stList2 = new ArrayList<>();
//        for(String a : stArr){
//            stList2.add(a);
//        }
////        1-3. streamApi : 참고만
//        List<String> stList3 = Arrays.stream(stArr).collect(Collectors.toList());
//
////        2. int배열을 List로 변환
//        int[] intArr = {10,20,30,40};
////        1-1. Arrays.asList사용불가
////        1-2. for 문담기 사용 가능
////        1-3. streamAPI 사용가능 : 참고만 하기
//        List<Integer> inList = Arrays.stream(intArr).boxed().collect(Collectors.toList());

//        3.String리스트를 String배열로 변환

    List<String> stList = new ArrayList<>();{
    stList.add("helo");
    stList.add("java");
    stList.add("world");
    String[] stArr = new String[stList.size()];
for(int i =0; i<stArr. length; i++){
    stArr[i] = stList.get(i);
    }

//3-2) streamAPI : 참고만
    String[] stArr2 = stList.stream().toArray(a->new String[a]);

//4 int 리스트를 int 배열로 변환
//4-1) for문으로 변환
//4-2) streamAPI로 변환

//    두개뽑아서 더하기 : 리스트

        int[] numbers = {2,1,3,4,1}; //2,3,4,5,6,7
        List<Integer> myList = new ArrayList<>();
        for(int i=0; 1<numbers.length-1; i++){
            for(int j=i+1; j<numbers.length; j++){
                if(!myList.contains(numbers[i]+numbers[j])) {
                    myList.add(numbers[i] + numbers[j]);
                }}}


//        n의 배수 고르기 : x % n == 0





    }
}
