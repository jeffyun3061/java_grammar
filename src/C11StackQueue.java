import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class C11StackQueue {
    public static void main(String[] args) {
//        Stack<Integer> mySt = new Stack<>();
//        mySt.push(10);
//        mySt.push(20);
//        mySt.push(30);
////        pop : 스택에서 요소를 제거후 해당 요소 반환.
//        System.out.println(mySt.pop()); //30
////        peek : 스택에서 마지막 요소 반환. 제거 X
//        System.out.println(mySt.peek()); //20
//        System.out.println(mySt); ///10, 20
//        System.out.println(mySt.size());
//        System.out.println(mySt.isEmpty());

////        String객체타입 5개 정도 stack에 추가후 while문을 통해 모두 출력.
//
//        Stack<String> myStack = new Stack<>();
//        myStack.push("h1");
//        myStack.push("h2");
//        myStack.push("h3");
//        myStack.push("h4");
//        myStack.push("h5");
//        while (!myStack.isEmpty()) {
//            System.out.println(myStack.pop());


//        웹페이지 방문 뒤로가기 기능 구현
//        스캐너로 신규사이트 방문 or 뒤로가기
//        신규사이트방문일경우. 해당 주소 추가
//        뒤로가기일경우 해당 주소 pop

//            Stack<String> backwards = new Stack<>();
//            Stack<String> forwards = new Stack<>();
//            while(true) {
//                System.out.println("신규사이트 방문시 1번,앞으로가기 2번, 뒤로가기 3번");
//                Scanner sc = new Scanner(System.in);
//                String input = sc.nextLine();
//                if(input.equals("1")) {
//                    System.out.println("방문하신 사이트를 입력해주세요");
//                    Scanner sc2 = new Scanner(System.in);
//                    String input2 = sc2.nextLine();
//                    System.out.println("방문하신 사이트는 " + input2 + "입니다.");
//                    backwards.push(input2);
//                }else if (input.equals("2")) {
//                    String temp = forwards.pop();
//                    System.out.println("앞으로 가기를 통해 방문한 곳은 " + "입니다.");
//                }else{
//                    String temp = backwards.pop();
//                    forwards.push(temp);
//                    System.out.println("뒤로가기로 방문하신 곳은"+backwards.peek() + "입니다. ");
//                }

//        큐선언
//        Queue<Integer> myQue = new LinkedList<>();
//        myQue.add(10);
//        myQue.add(20);
//        myQue.add(30);
//        System.out.println(myQue.poll()); //10
//        System.out.println(myQue); //20,30

//        프린터대기열 예제
//        문서1추가, 문서2추가, 문서3추가
//        while문을 통해 "현재 인쇄 중인 문서 : 문서1"  포맷으로 출력
//        Queue<String> myQue = new LinkedList<>();
//        myQue.add("문서1");
//        myQue.add("문서2");
//        myQue.add("문서3");
//        while (!myQue.isEmpty()){
//            System.out.println("현재 인쇄 중인 문서" + myQue.poll());

//        길이의 제한이 있는 큐 : ArrayBlockingQueue
//        Queue<String> myQue = new ArrayBlockingQueue<>(3);
////        add와 offer의 차이 : add는 길이가 다 찼을때 에러를 발생. offer 공간이 충분할때만 add
//        myQue.add("hello1");
//        myQue.add("hello2");
//        myQue.add("hello3");
//        myQue.add("hello4");
//        System.out.println(myQue);
//
//        myQue.offer("hello1");
//        myQue.offer("hello2");
//        myQue.offer("hello3");
//        myQue.offer("hello4");
//        System.out.println(myQue);

//        우선순위큐


//    Queue<Integer> pq = new PriorityQueue<>();
//    pq.add(30);
//    pq.add(20);
//    pq.add(10);
//    pq.add(40);
//    pq.add(50);
//System.out.print(pq);
//
////while(!pq.isEmpty()){
////System.out.println(pq.poll());
//
//
////         더 맵게
//
//        int[] scoville = {1, 2, 3, 9, 10, 12};
//        int k=7;
//        Queue<Integer> myQue = new PriorityQueue<>();
//        for(int a : scoville){
//            myQue.add(a);
//        }
////        list로 변환 -> int temp = get(0) + get(1)*2;
////        remove(0), revmove(0)
//       int answer = 0;
//        while(true){
////        1)size가 1이면서 k보다 작다 > -1 break;
//        if(myQue.peek(0) >= k){
//            break;
//        }
//        else if(myQue.size() == 1 && myQue.peek(0) < k) {
//            answer = -1;
//            break;
//        }else{
//            answer++;
//            int temp =myQue.poll() + myQue.poll()*2;
//            myQue.add(temp);
//        }
//        }
////        2) 0번째 값을 구했는데, k보다 크다 > / break;
//
//    }
}
