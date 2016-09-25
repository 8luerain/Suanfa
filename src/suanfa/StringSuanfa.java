package suanfa;

public class StringSuanfa {

	/*------------------------�ַ����滻����----------------------------*/

	/*
	 * ��String�еĿո��滻��20%
	 */

	public static String replce(String scr, String flag) {
		char[] charArray = scr.toCharArray();
		char[] flagArray = flag.toCharArray();
		int newLength = 0;
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] != ' ')
				newLength++;
			else
				newLength += flag.length();
		}
		char[] newChar = new char[newLength];
		int insertIndex = newChar.length - 1;
		for (int i = charArray.length - 1; i >= 0; i--) {
			char currentChar = charArray[i];
			if (currentChar != ' ')
				newChar[insertIndex--] = currentChar;
			else {
				for (int j = flag.length() - 1; j >= 0; j--)
					newChar[insertIndex--] = flagArray[j];

			}
		}
		return String.valueOf(newChar);

	}

	/*
	 * ���String�������ǹ��������
	 * 
	 * ���� String a = (()) , (),(a) true; String a = ()a() , (() false;
	 * 
	 */
	public static Boolean checkString_kuohao(String src) {
		char[] scrArray = src.toCharArray();
		int num = 0;
		for (int i = 0; i < scrArray.length; i++) {
			char currentChar = scrArray[i];
			if (currentChar == '(') {
				num++;
				if (num < 0)
					return false;
			}
			if (currentChar == ')') {
				num--;
				if (num < 0)
					return false;
			}

		}
		if (num == 0)
			return true;

		return false;

	}

	/*
	 * ������������
	 * 
	 * ���ӣ�pig loves dog ---> dog loves pig
	 */

	public static String stringRevert(String s) {
		StringBuilder builder = new StringBuilder();
		String tmpR = revertEveryChar(s);
		String[] split = tmpR.split(" +");
		for (int i = 0; i < split.length; i++) {
			builder.append(revertEveryChar(split[i]));
			if (i != split.length - 1)
				builder.append(" ");
		}

		return builder.toString();

	}

	/*
	 * ����String�е�ÿ����ĸ
	 */

	public static String revertEveryChar(String src) {
		// StringBuffer buffer = new StringBuffer();
		char[] arrayChar = src.toCharArray();
		int head = 0;
		int tail = arrayChar.length - 1;
		for (; head < tail; head++) {
			tail = arrayChar.length - 1 - head;
			char tmp = arrayChar[head];
			arrayChar[head] = arrayChar[tail];
			arrayChar[tail] = tmp;
		}

		return String.valueOf(arrayChar);

	}

}
