package suanfa;

import suanfa.Lianbiao.Node;

public class Utils {

	/*
	 * 
	 * 打印整个链表，可以处理循环链表的情况*/
	public static void  print (Node head) {
		boolean loop = false;
		for(Node currentNode = head.next ; 
				currentNode!= null &&!loop;
				currentNode = currentNode.next){
				loop = currentNode.next == head.next;
			System.out.println(currentNode.value +"->");
		}
	}
	

	/*打印数组值*/
	public static void printData(String strings, int[] data) {
		System.out.print(strings + ":    ");
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + "   ");
		}
		System.out.print("\n");
	}
}
