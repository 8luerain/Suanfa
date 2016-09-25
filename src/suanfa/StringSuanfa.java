package suanfa;

public class StringSuanfa {
	
	/*
	 * 单词逆序问题
	 * 
	 * 例子：pig loves dog     --->      dog loves pig 
	 * */

	
	public static void stringRevert(String s){
		
		
		
	}
	
	
	
	/*
	 * 逆序String中的每个字母
	 * */
	
	public static String revertEveryChar(String src){
//		StringBuffer buffer = new StringBuffer();
		char[] arrayChar = src.toCharArray();
		int head = 0;
		int tail = arrayChar.length -1;
		for(;head <tail;head++){
			tail = arrayChar.length-1-head;
			char tmp = arrayChar[head];
			arrayChar[head] = arrayChar[tail];
			arrayChar[tail] = tmp;
		}
		
		return String.valueOf(arrayChar);
		
	}
	
	
}
