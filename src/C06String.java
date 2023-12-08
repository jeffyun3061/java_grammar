import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class C06String {
    public static void main(String[] args) {

//    int a = 10;
//    String st = "hello";
//    Integer int_a = 10;

//    참조자료형 : 기본 자료형을 제외한 모든자료형
//    Wrapper class : 기본형 타입에 없는 다양한 기능을 지원하기 위한 클래스
//    int와 integer같의 형변환
//     int a = 10;
//     Integer b = new Integer(value:20);
////     오토언박싱 : Integer -> int 형변환
//        int c = b;
////        언박싱 : Integer -> int 형변환
//                int d = b.intValue()
////     오토 박싱
//        Integer e = a;
////     박싱
//     Integer f = Integer.valueOf(a);

//     String과 int의 형변환 (많이 쓰니 알아둘것)
//     int a = 10;
//     String st_a = Integer.toString(a); // "10"
//     String st_a2 = String.valueOf(a);
//     int c = Integer.parseInt(st_a); // 10

//     참조자료형에 원시자료형을 담을 때는 wrapper클래스를 써야한다. ex)컬렉션프레임워크(List, set ...)
//    List<Integer> list_a = new ArrayList<>();      //자동완성기능 안쓰면 빨간불뜸 , 배열이 아닌 참조자료형에 넣을때는 wrapper 클래스
//    list_a.add(10);                                //int 만 넣어두면 기능이 제한적이라 Integer로
//    list_a.add(20);
//    list_a.add(30);
//        System.out.println(list_a);

////        String pool, String 객체 - 면접 볼때 질문에 나오기도 함.
//        String mySt1 = new String(original: "hello");
//        String mySt2 = new String(original: "hello");
//        String mySt3 = "hello";
//        String mySt4 = "hello";
//        String mySt5 = mySt1;
//        System.out.println(mySt1 == mySt2); //false
//        System.out.println(mySt1 == mySt3); //false
//        System.out.println(mySt3 == mySt4); //true
//        System.out.println(mySt1 == mySt5 );
//
//        List<String> myList = new ArrayList<>();
//        myList.add("hello");
//        myList.add("hello2");
//        myList.add("hello mylist1");
//
//        List<String> myList2 = myList;
//        myList2. add("hello myList2");
//        myList. add("hello myList1");
//        System.out.println(myList2);
//
//
//        System.out.println(mySt1.equals(mySt2)); //true
//        System.out.println(mySt1.equals(mySt3)); //true
//        System.out.println(mySt3.equals(mySt4)); //true
//        System.out.println(mySt1.equals(mySt5)); //true

//        List<String> myList1 = new ArrayList<>();
//        myList1.add("h1");
//                myList1.add("h2");
//                List<String> myList2 = myList1;

////        문자열길이 : length();
//        String mySt = " hello ";   // 공백도 문자열 길이에 포함 , 배열 숫자 카운트 헷갈리지 않기 인덱스 는0부터
//        System.out.println(mySt.length());
//
////        indexOf : 특정 문장열의 위치 반환, 가장 먼저 나오는 문자열의 위치 반환
//        String mySt2 = "hello java java";
//        int myst_index = mySt2.indexOf("java");
//        System.out.println(myst_index);
//
////        contains : 특정 문자열이 있는지 여부를 boolean으로 리턴
//        System.out.println(mySt2.contains("hello"));
//
////        charAt : 특정 index의 문자값을 리턴
//        String st = "abcdefghaaij";
//        char myChar = st.charAt(1);
//        System.out.println(myChar);
//
////        반복문, charAt, length를 활용한 st안에 문자a의 개수
//        int count = 0;
//        for(int i = 0;i<st.length() ; i++){
//            if(st.charAt(i) == 'a'){
//                count ++;
//            }
//        }
//        System.out.println(count);

//        //substring(a,b) : a이상 b미만의 index를 자른다.
//        String st1 = "hello world";
//        System.out.println(st1.substring(0,5));
//        System.out.println(st1.substring(6,st1.length()));
//
//        //프로그래머스 가운데 글자 가져오기 풀어보기

//        String s = "abcde";
//        String answer = "";
//        if(s.length() % 2 == 0){
//            answer = s.substring(s.length()/2-1, s.length()/2+1);
//        }else{
//            answer = s.substring(s.length()/2, s.length()/2+1);
//        }

////        trim, strip
//        String trimSt = "     hello word  ";
//        String new_trimSt = trimSt.trim();
//        String stripSt = trimSt.strip();
//        System.out.println(new_trimSt);
//        System.out.println(trimSt);
//
////        uppercase : 대문자, lowercase : 소문자
//        String s1 = "hello";
//        String s2 = s1.toUpperCase();
//        String s3 = s1.toLowerCase();
//        System.out.println(s2);
//        System.out.println(s3);
//
//        String a = "hello";
//        a += "word";
//        System.out.println(a);
//
//        String b = "윤";
//        b += "지용";
//        System.out.println(b);
//
////        문자열 더하기 : +=
//        String c = "hello";
//        c += "word";
//        c += "word";
//        c += "word";
//        c += "word";
//        c += "word";
//        System.out.println(c);
//
//        int d = 2;
//        d +=5;
//        System.out.println(d);
//
////        char - > String 형변환
//
//        char ch1 = 'a';
//        String st1 = Character.toString(ch1);
//
//        String str = "01abc123한글123";
////        알파벳만 빼고 문자를 str2에 새롭게 담기. (알파벳이 소문자만 있다고 가정)
//        String str2 ="";
//        for(int i =0; i<str.length(); i++){
//            char temp = str.charAt(i);
//            if(temp < 'a' || temp > 'z'){
//                str2 += temp;  //Chracter.toString(temp); 넣어도됨
//            }
//        }
//        System.out.println(str2);

//      특정 문자 제거하기 -- 프로그래머스

////      replace(a,b) : a문자를 b문자로 대체
//        String st1 = "hello world";
//        String st2 = st1.replace("world", "java");
//        System.out.println(st2);
//
////      replaceAll(a,b)
//        String st3 = st1.replace("world", "python");
//        System.out.println(st3);
//
//        String str = "01abc123ABC한글123";
//
////        [a-z] : 소문자 알파벳
//        String str2 = str.replaceAll("[a-z]", "");
//        System.out.println(str2);
//
////        [가-힣] : 한글
//        String str3 = str.replaceAll("[가-힣]","");
//        System.out.println(str3);
//
////        [0-9] : 숫자
//        String str4 = str.replaceAll("[0-9]", "");
//        System.out.println(str4);
//
////        [A-Za-z] : 알파벳 전체
//        String str5 = str.replaceAll("[A-Za-z]", "");
//        System.out.println(str5);
//
////        [A-Za-z0-9] : 알파벳 전체와 숫자
//        String str6 = str.replaceAll("[A-Za-z0-9]", "");
//        System.out.println(str6);
//
////        Pattern클래스
//        boolean matcher = Pattern.matches("[a-z]","helloworld");   // .*
//        System.out.println(matcher);
//
////        전화번호 검증
////        /d:숫자, {}:연속으로
//        boolean matecher2 = Pattern.matches("^\\d{3}-\\d{4}-\\d{4}$","010-1234-1234");
//        System.out.println(matecher2);
//
////       이메일 검증
////       /d:숫자, {}:연속으로
//        boolean matcher3 = Pattern.matches("^[a-z0-9]+@[a-z]+.com$","hello@naver.com");
//        System.out.println(matcher3);

////        split
//        String a = "a:b:c:d";
//        String[] stArr = a.split(":");
//        System.out.println(Arrays.toString(stArr));
//        String b = "a  b c d";
//        String[] stArr2 = b.split(" ");
//        System.out.println(Arrays.toString(stArr2));
//        String[] stArr3 = b.split("\\s+");
//        System.out.println(Arrays.toString(stArr3));

////        isEmpty와 null구분
//        String st1 = null;  //값을 세팅 안하면 String은 null
//        String st2 = "";    //비어있는 값이 아니라 공백을 원할 경우
//
//        System.out.println(st1==null);
//        System.out.println(st2==null);
//        System.out.println(st2.isEmpty());
////        Nullpointer Exception 예외 발생. 비어있어서 어떠한 메소드 사용 못함 비어있는곳 ,값이 null인곳 차이
//        System.out.println(st1.isEmpty());

////        join : String[] -> String
//        String[] arr = {"java", "python", "c++", "javascript"};
//        String arrSt = String.join("", arr);
//        System.out.println(arrSt);

////        StringBuffer
//        StringBuffer sb1 = new StringBuffer("hello");
//        System.out.println(sb1);
//
//        sb1.append(" world");
//        System.out.println(sb1);
//        sb1.insert(5," java");
//        System.out.println(sb1);
//        System.out.println(sb1.substring(6,10));
//        sb1.delete(6,10);
//        System.out.println(sb1);
//
////        성능 : String < StringBuffer < StringBuilder(스레드 safe X)
//        StringBuilder sb2 = new StringBuilder("hello");
//        sb2.append(" world");
//        System.out.println(sb2);

////        프로그래머스 - 문자 반복 출력하기
//        String my_String = "hello";
//        int n = 3;
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < my_String.length(); i++) {
//            for (int j = 0; j < n; j++) {
//                sb.append(my_String.charAt(i));
//            }
//        }
//        String answer = sb.toString();
//        System.out.println(answer);

//        프로그래머스 - 문자열 밀기


                String A = "hello";
                String B = "ohell";
                int answer = -1;
                StringBuilder sb = new StringBuilder(A);
                for (int i = 0; i < A.length(); i++) {
                    if (sb.toString().equals(B)) {
                        answer = i;
                        break;
                    }
                    sb.insert(0, sb.charAt(sb.length() - 1));
                    sb.delete(sb.length() - 1, sb.length());
                }
                String result = sb.toString();
                System.out.println(result);
            }
        }

































