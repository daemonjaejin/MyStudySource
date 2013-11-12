
public class alphabet_C_Plus {

	public static void main(String[] args) {
		String test1 = "C361649";
		String test2 = "C361651";
		String test3 = "254627";
		String test4 = "958717";
		String test5 = "c568647";
		
		System.out.println("test1 : " + confimWordPlus(test1));
		System.out.println("test2 : " + confimWordPlus(test2));
		System.out.println("test3 : " + confimWordPlus(test3));
		System.out.println("test4 : " + confimWordPlus(test4));
		System.out.println("test5 : " + confimWordPlus(test5));
	}
	
	public static String confimWordPlus(String word){
		String sum = "";
		for (int i = 0; i < word.length(); i++) {
			String dic = word.substring(i, i+1);
			if(i==0 && !dic.toUpperCase().equals("C")){
				dic = "C" + dic;
			}
			sum += dic.toUpperCase();
			System.out.println(i + " : " + dic);
		}
		return sum;
	}

}
