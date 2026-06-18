package chapter17.page84;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Run {

	public static void main(String[] args) {
		// Map 컬렉션 프레임워크진행 HashMap<k,v> 
		// ArrayList<k> : 키 자동으로 인덱스 결정
		Map<Data, String> hm = new HashMap<Data, String>();
		// hashMap 동기화 - 멀티 스레드 동기화 필요시
		Map<Data, String> hmToSyn =  Collections.synchronizedMap(hm);
		
		// put() 
		hm.put(new Data(1), new String("kdg"));
		hm.put(new Data(2), new String("ssj"));
		hm.put(new Data(3), new String("pkw"));
		System.out.println(hm);
		
		// replace(1, "a") => 변경
		hm.replace(new Data(1), "홍길동");
		System.out.println(hm);
		
		// get() 
		System.out.printf("hm.get(new Data(2)) : %s\n", hm.get(new Data(2)));
		
		// containsKey(E), containsValue(E)
		System.out.printf("hm.containsKey(new Data(2)) : %b\n",hm.containsKey(new Data(2)));
		System.out.printf("hm.containsValue('홍길동') : %b\n",hm.containsValue("홍길동"));
		
		// for each -> Map 은 안됨 (변형때문에)
		// 1. Map key 객체를 Set으로 변경
		Set<Data> mToSet = hm.keySet();
		for (Data data : mToSet) {
			// key value 값을 가져온다.
			String value = hm.get(data);
			System.out.printf("hm.get(data) = %s \n",value);
		}
		
		// 2. Set<Map.entry<Data, String> entrySet = entrySet() => 1번 문장으로 바꿔서 실행 (하나로 묶어서)
		Set<Map.Entry<Data, String>> entrySet = hm.entrySet();
		System.out.println(entrySet);
		
		for (Entry<Data, String> entry : entrySet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		//remove() 
		hm.remove(new Data(3));
		System.out.println("Data 3 삭제 : " + hm);
		
		// size()
		System.out.printf("Map size : %d \n",hm.size());
		
		// isEmpty()
		System.out.printf("Map isEmpty : %b \n",hm.isEmpty());
		
		// clear()
		hm.clear();
		System.out.printf("Map isEmpty : %b \n",hm.isEmpty());
		
		
		
		
		
		
	}

}
