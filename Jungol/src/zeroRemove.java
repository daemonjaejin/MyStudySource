public class zeroRemove {

	public static void main(String[] args) {
		String test1 = "001";
		String test2 = "170";
		String test3 = "100";
		String test4 = "0101";
		String test5 = "1010";
		
		System.out.println("test1 : " + removeWord(test1));
		System.out.println("test2 : " + removeWord(test2));
		System.out.println("test3 : " + removeWord(test3));
		System.out.println("test4 : " + removeWord(test4));
		System.out.println("test5 : " + removeWord(test5));
	}
	
	public static String removeWord(String word){
		String sum = "";
		String firstWord = "";
		for (int i = 0; i < word.length(); i++) {
			String dic = word.substring(i, i+1);
			if(i==0){firstWord=dic;}
			if(i!=0 && !firstWord.equals("0")){
				sum += dic;
			}else if(!dic.equals("0")){
				sum += dic;
				firstWord = dic;
			}
			System.out.println(i + " : " + dic);
		}
		return sum;
	}

}
