package suanfa;

import java.net.DatagramPacket;
import java.sql.DataTruncation;

import javax.xml.bind.ValidationEvent;

public class PaixuSuanfa {

	public static void moxie(int[] data, int l, int r) {
		if (l < r) {

			int head = l;
			int tail = r;
			int srcData = data[l];

			while (head < tail) {
				for (; (tail > head) && data[tail] >= srcData; tail--)
					;
				if (tail > head) {
					data[head++] = data[tail];
				}
				for (; (head < tail) && data[head] < srcData; head++)
					;
				if (head < tail) {
					data[tail--] = data[head];
				}
			}
			data[tail] = srcData;
			moxie(data, l, tail - 1);
			moxie(data, tail + 1, r);
		}

	}

	/*
	 * 快速排序的实现
	 */
	public static void kuaisu_suanfa(int[] data, int l, int r) {
		if (l < r) {
			int head = l;
			int tear = r;
			int valueOfWait = data[head];

			while (head < tear) {
				for (; (tear > head) && (data[tear] >= valueOfWait); tear--)
					;
				if ((tear > head)) {
					data[head++] = data[tear];
				}

				for (; (head < tear) && (data[head] < valueOfWait); head++)
					;
				if (head < tear) {
					data[tear--] = data[head];
				}
			}
			data[tear] = valueOfWait;
			// Utils.printData("kuaisu ", data);
			kuaisu_suanfa(data, l, tear - 1);
			kuaisu_suanfa(data, tear + 1, r);
		}
	}

	/*
	 * 
	 * 冒泡排序的实现
	 */

	public static void maopao_suanfa(int[] data) {
		int wait;
		for (wait = data.length; wait >= 0; wait--) {
			for (int i = 1; i < wait; i++) {
				if (data[i] < data[i - 1]) {
					int tmp = data[i];
					data[i] = data[i - 1];
					data[i - 1] = tmp;
				}
			}
		}
		Utils.printData("maopao ", data);
	}

	/* 插入排序 */
	public static void charu_suanfa(int[] data) {
		int wait;
		int find;
		for (wait = 0; wait < data.length; wait++) {
			int valueOfWait = data[wait];
			for (find = wait - 1; (find >= 0) && (data[find] > valueOfWait); find--) {
				data[find + 1] = data[find];
			}
			data[find + 1] = valueOfWait;
		}
		Utils.printData("insert ", data);
	}

	/* 简单排序 */
	public static void jiandan_suanfa(int[] data) {
		int wait;
		int find;
		for (wait = 0; wait < data.length; wait++) {
			int indexOfMin = wait;
			for (find = wait; find < data.length; find++) {
				if (data[find] <= data[indexOfMin]) {
					indexOfMin = find;
				}
			}
			int swapTmp = data[indexOfMin];
			data[indexOfMin] = data[wait];
			data[wait] = swapTmp;
		}
		Utils.printData("jiandan", data);
	}

}
