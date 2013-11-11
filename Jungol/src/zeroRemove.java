
public class zeroRemove {

	public static void main(String[] args) {
		String test1 = "001";
		String test2 = "170";
		String test3 = "100";
		
		System.out.println("test1 : " + removeWord(test1));
		System.out.println("test2 : " + removeWord(test2));
		System.out.println("test3 : " + removeWord(test3));
	}
	
	public static String removeWord(String word){
		String sum = "";
		int empty = 0;
		int count = 0;
		for (int i = 0; i < word.length(); i++) {
			String dic = word.substring(i, i+1);
			if(empty!=0){
				if(!dic.equals("0")){
					sum += dic;
					empty = 1;
				}
			}else{
				sum += dic;
			}
			if(!dic.equals("0") && count==0){
			}else if(dic.equals("0") && count>0){
				sum += dic;
			}
			System.out.println(i + " : " + dic);
		}
		System.out.println("count : " + count);
		return sum;
	}

}
