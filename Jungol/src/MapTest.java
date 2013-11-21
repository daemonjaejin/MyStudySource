import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class MapTest {

	public static void main(String[] args) {
//		Map<String, String> map = new HashMap<String, String>();
//		String abc = "\\test";
//		String abc2 = "\test";
//		boolean a = false;
//		a = abc.equals("\test");
//		System.out.println("a : " + a + " ," + abc + " ," + abc2);
		
//		List<String> wordList = new ArrayList<String>();
//		wordList.add("�ѱ�");
//		wordList.add("�Ϻ�");
//		wordList.add("�߱�");
		
		List<Integer> wordList = new ArrayList<Integer>();
		
		wordList.add(150);
		wordList.add(90);
		wordList.add(350);
		
		
		Collections.sort(wordList);
		
		for (Integer string : wordList) {
			System.out.println("string : " + string);
		}
		
		Collections.reverse(wordList);
		
		for (Integer string : wordList) {
			System.out.println("string1 : " + string);
		}
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "�ѱ�");
		map.put(2, "�Ϻ�");
		map.put(3, "�߱�");
		
		Set<Integer> set = map.keySet();
		
		ArrayList<Integer> integerList = new ArrayList<Integer>();
		integerList.addAll(set);
		
		Collections.sort(integerList);
		
		for (Integer integer : integerList) {
			System.out.println("set : " + integer);
		}
		
		Collections.reverse(integerList);
		
		for (Integer integer : integerList) {
			System.out.println("set1 : " + integer);
		}
		
		Collection<String> col = map.values();
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.addAll(col);
		
		Collections.sort(arrayList);
		
		for (String string : arrayList) {
			System.out.println("map : " + string);
		}
		
		Collections.reverse(arrayList);
		
		for (String string : arrayList) {
			System.out.println("map1 : " + string);
		}
		
	}

}
