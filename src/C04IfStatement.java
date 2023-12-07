
public class C04IfStatement {

    public static void main(String[] args) {

////        도어락키 if문 예제
////        234 -> 00234
//        int answer = "0234";
//        System.out.println("비밀번호를 입력해주세요");
//        Scanner sc = new Scanner(System.in);
//        String input = sc.nextInt();
//        if(answer.equals(input)){
//                System.out.println("문이 열렸습니다.");
//            }else{
//                System.out.println("비밀번호가 틀렸습니다.");
//            }

//        묵시적 타입변환
//        a : 97, A:65
//               사용자한테 알파벳을 아무거나 입력받고, 그 알파벳이 대문자인지 소문자인지 판별
//        Scanner sc = new Scanner(System.in);
//        char input = sc.nextLine().charAt(0);
//        if(input >= 'a' && input<='z'){
//            System.out.println("소문자 입니다.");
//        }else if(input >= 'A' && input<='Z') {
//            System.out.println("대문자 입니다");
//        }else{
//            System.out.println("알파벳이 아닙니다.");
//        }

//        버스 카드 예제
//        내 돈이 얼마있는지를 입력
//        버스요금 1500이다.
//        돈이 더 적으면 탑승불가, 돈이 더 많으면 정상처리 출력.
//        도난여부 boolean 설정(입력x)

//
//        Scanner sc = new Scanner(System.in);
//        int myMoney = 10000;
//        boolean isStolen = false;
//        System.out.println("도난 카드 입니까? 예/아니오로 대답하시오");
//        Scanner sc = new  Scanner(System.in);
//        if(sc.nextLine(). equals("예")){
//            isStolen = true;
//        }
//
//
//        if(myMoney < 1500 || isStolen==true) {
//            System.out.println("정상 탑승되었습니다.");
//        }else{
//            System.out.println("탑승 불가입니다.");
//        }
//        int myMoney = 10000;
//        boolean isStolen = false;
//        if(myMoney >= 1500 && isStolen==false) {
//            System.out.println("정상 탑승되었습니다.");
//        }else{
//            System.out.println("탑승 불가입니다.");
//        }
//
//        //삼항연산자
////        도어락키 if 예제
//        String answer = "0234";
//        System.out.println("비밀번호를 입력해주세요");
//        Scanner sc = new Scanner(System.in);
//        String input = sc.nextLine();
//        String result = 조건식 ? 참 : 거짓;
//        System.out.println(result);
//
//        String answer = "0234";
//        System.out.println("비밀번호를 입력해주세요");
//        Scanner sc = new Scanner(System.in);
//        String input = sc.nextLine();
//        String result = answer.equals(input) ? "문이 열렸습니다." : "비밀번호가 틀렸습니다";
//        System.out.println(result);
//


//
//        int myMoney = 10000;
//        int texiFee = 10000;
//        int busFee = 3000;
//        int kickBoardFee = 2000;
//        if(myMoney >= texiFee){
//            System.out.println("택시를 타세요");
//        } else if (myMoney >= busFee) {
//            System.out.println("버스를 타세요");
//        }    else if (myMoney >= kickBoardFee) {
//                System.out.println("킥보드를 타세요");
//            }else {
//                System.out.println("걸어가세요");
//            }
//
//
//        int myMoney = 10000;
//        int texiFee = 10000;
//        int busFee = 3000;
//        int kickBoardFee = 2000;
//        if(myMoney >= texiFee){
//            System.out.println("택시를 타세요");
//        } if (myMoney >= busFee && myMoney < texiFee ) {
//            System.out.println("버스를 타세요");
//        }    if (myMoney >= kickBoardFee && myMoney < busFee) {
//            System.out.println("킥보드를 타세요");
//        }if {myMoney < kickBoardFee) {
//            System.out.println("걸어가세요");
//        }
//
////        switch 고객센터 출력 예제
////        원하시는 번호를 입력주세요
////        1. 대출서비스입니다. 2.예금 3. 적금
////        0. 상담사연결입니다. 그외:잘못누르셨습니다.
//
//
//            System.out.println("원하시는 번호를 입력 주세요");
//Scanner sc = new Scanner(System.in);
//int input = sc.nextInt();
//switch (input){
//    case 1:
//        System.out.println("대출업무입니다,");
//        break;
//    case 2:
//        System.out.println("예금업무입니다.");
//        break;
//    case 3:
//        System.out.println("적금업무입니다.");
//        break;
//    case 0:
//        System.out.println("상담사 연결입니다.");
//        break;
//    default:
//        System.out.println("잘못입력하셨습니다.");
//


//do while문 작성
//int a = 1;
//do{
//        a++;
//        Sysstem.out.println(a);
//        }while(a < 10);
//
//// for 문을 통해 2~10까지 출력
//
//        for (int i = 2; i <11; i++) {
//            System.out.println(i);
//
//
//
////            for. continue를 사용해서 홀수만 출력되도록 (1~10까지 수 중에)
////        a % 2 != 0
//
//
//        for (int i = 1; i <11; i++) {
//            if (i % 2 == 0) {
//                continue;
//            }
//        Sytem.out.println(i)
//
//? 하나


//


    }
}


