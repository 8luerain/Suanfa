package suanfa;

import suanfa.Lianbiao.Node;

public class Utils {

	/*
	 * 
	 * ��ӡ�����������Դ���ѭ����������*/
	public static void  print (Node head) {
		boolean loop = false;
		for(Node currentNode = head.next ; 
				currentNode!= null &&!loop;
				currentNode = currentNode.next){
				loop = currentNode.next == head.next;
			System.out.println(currentNode.value +"->");
		}
	}
	

	/*��ӡ����ֵ*/
	public static void printData(String strings, int[] data) {
		System.out.print(strings + ":    ");
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + "   ");
		}
		System.out.print("\n");
	}
}
