package suanfa;

public class StringSuanfa {
	
	/*
	 * ������������
	 * 
	 * ���ӣ�pig loves dog     --->      dog loves pig 
	 * */

	
	public static void stringRevert(String s){
		
		
		
	}
	
	
	
	/*
	 * ����String�е�ÿ����ĸ
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
