import java.util.*;

public class C09Map {
    public static void main(String[] args) {
//        <String, Stirng> -> Map

//        Map<String, String> myMap = new HashMap<>();
//        myMap.put("basketball", "농구");
//        myMap.put("soccer", "축구");
//        myMap.put("baseball","야구");
//        System.out.println(myMap);
//        System.out.println(myMap.get("baseketball"));
////      size(), isEmpty() 사용가능
////        이미 key가 있을 경우 put을 하면 덮어쓰기
//       myMap.put("baseball", "탁구");
////없으면 put이 putIfAbsent
//      myMap.putIfAbsent("baseball","배구");
////        getorDefault :
//        System.out.println(myMap.get("tennis"));
//        System.out.println(myMap.getOrDefault("tennis","스포츠"));
//        System.out.println(myMap.containsKey("tennis"));
//        myMap.remove("baseball");
//        System.out.println(myMap.keySet());
//        System.out.println(myMap.values());
//
////        enhanced for : key값 하나씩 출력.
//        for(String a : myMap.keySet()){
//            System.out.println(myMap.get(a));
//        }


//        Map<String, String> myMap = new HashMap<>();
//        myMap.put("basketball", "농구");
//        myMap.put("soccer", "축구");
//        myMap.put("baseball","야구");

//        iterator를 통해 key값 하나씩 출력.
//        Iterator<String> myIter = myMap.keySet().iterator();
//        next()메서드는 데이터를 소모시키면서 return
//        System.out.println(myIter.next());
//        System.out.println(myIter);
//        hasnext() : iterator안에 값이 있는지 없는지.
//
//        while ((myIter.hasNext()){
//            System.out.println(myIter.next());
//        }
////        아래의 리스트를 가지고 좋아하는 운동종목과 사람숫자를 map형태로 나타내시오.
//        List<String> myList = new ArrayList<>();
//        myList.add("basketball");
//        myList.add("basketball");
//        myList.add("basketball");
//        myList.add("baseball");
//        myList.add("baseball");
//        myList.add("tennis");
//        myList.add("tennis");
//        myList.add("tennis");
//
//
//        Map<String, Integer> myMap1 = new HashMap<>();    //몇명 integer
//        for (String a : myList) {
//            myMap1.put(a, myMap1.getOrDefault(a ,1));
////            if(myMap.containsKey(a)){
////             myMap.put(a, myMap.get(a)+1);    //(int temp 랑 같음)
////            }else{
////                myMap.put(a, 1);
////            }
////             다른 풀이
//
//            myMap.put(a, myMap.getOrDefault((a, 0)+1);
//        }
//
////        프로그래머스 완주하지못한선수
//
//        String[] participant = {"marina", "josipa", "nikola","vinko","filipa"};
//        String[] completion = {"josipa","filipa","marina","nikola"};
//        List<String> participant_List = new ArrayList<>(Arrays.asList(participant));
//        for(String c : completion) {
//            if (participant_List.contains(c)) {
//                participant_List.remove(c);
//            }
//        }
//        String answer = participant_List.get(0);                        // 시간복잡도
//
//
////        다음풀이
//        Map(String a ; participant)myMap.put(a, )
//
//
////       LinkedHashMap : 데이터 삽입순서 유지
//        Map<String, Integer> myMpa1 = new LinkedHashMap<>();
//        myMap.put("hello5", 1);
//        myMap.put("hollo4", 1);
//        myMap.put("hello3", 1);
//        myMap.put("hello2", 1);
//        myMap.put("hello1", 1);
//        System.out.println(myMpa1);
////        Treemap : key를 통해 데이터 정렬
//        Map<String, Integer> myMap2 = new TreeMap<>();
//        myMap2.put("hello5",1);
//        myMap2.put("hello4",1);
//        myMap2.put("hello3",1);
//        myMap2.put("hello2",1);
//        myMap2.put("hello1",1);
//        System.out.println(myMap2);


//            }
//        }
//
//
//
//
//
//
    }
}
