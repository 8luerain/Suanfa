package suanfa;

import java.awt.List;
import java.util.ArrayList;
import java.util.Currency;
import java.util.LinkedList;

/*
 * 手动实现了一个链表结构
 * 
 * 
 * */

public class Lianbiao {

	private Node mHead = new Node(-1);
	private Node mTail = mHead;

	static class Node {
		public Node next;
		public int value;

		public Node(int value) {
			this.value = value;
			// TODO Auto-generated constructor stub
		}

	}

	public Node getHead() {
		return mHead;
	}

	public Node getTail() {
		return mTail;
	}

	public void setmTail(Node mTail) {
		this.mTail = mTail;
	}

	public void print() {
		for (Node currentNode = mHead.next; currentNode != null; currentNode = currentNode.next) {
			System.out.println(currentNode.value + "->");
		}
	}

	/*
	 * 尾部添加数组
	 */
	public Node append(int[] data) {

		for (int i = 0; i < data.length; i++) {
			Node newNode = new Node(data[i]);
			mTail.next = newNode;
			mTail = newNode;
		}
		return mHead;
	}

	/*
	 * 尾部添加单个节点
	 */
	public Node append(int data) {

		Node newNode = new Node(data);
		mTail.next = newNode;
		mTail = newNode;

		return mHead;
	}

	
	/*
	 * 添加另一个链表
	 * */
	public Node append(Lianbiao l) {

		mTail.next = l.getHead().next;
		Node current = l.getHead().next;
		for (; current.next != null; current = current.next)
			;
		mTail = current;
		return mHead;
	}

}
