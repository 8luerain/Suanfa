package suanfa;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;


import suanfa.Lianbiao.Node;

public class LianbiaoSuanfa {
	
	/*�������Ƿ���ڻػ�*/
	public static boolean ifLinkedHasLoop(Node head){
		Set<Node> set = new HashSet<>();
		for(Node now = head.next ; now != null; now = now.next ){
			if (set.add(now) == false)
				return true;
		}
	
		return false;
	}

	/*
	 * �ж������Ƿ�Ϊ���Ľṹ
	 * 
	 * ���� 1 2 3 3 2 1 true 1 2 3 2 1 false
	 * 
	 */

	public static boolean checkLoopLinkedList(Node head) {
		if (head.next == null) {
			return false;
		}

		Stack<Integer> stack = new Stack<>();
		for (Node now = head.next; now != null; now = now.next) {

			stack.push(now.value);

		}
		for (Node now = head.next; now != null; now = now.next) {
			// System.out.println("listValue["+now.value+"]");
			// System.out.println("stackValue["+stack.pop()+"]");

			if (now.value != stack.pop()) {
				return false;
			}

		}

		return true;
	}

	/*
	 * ����������������Ĺ�������
	 * 
	 */
	public static void findSameValue(Node head1, Node head2) {
		Node find1 = head1.next;
		Node find2 = head2.next;
		if (find1 == null || find2 == null)
			return;
		while (find1 != null && find2 != null) {
			for (; find1 != null && (find1.value < find2.value); find1 = find1.next)
				;
			if (find1 == null)
				continue;
			if (find1.value == find2.value) {
				System.out.println(find1.value);
				find1 = find1.next;
				find2 = find2.next;
			}
			for (; find2 != null && (find2.value < find1.value); find2 = find2.next)
				;
			if (find2 == null)
				continue;
			if (find1.value == find2.value) {
				System.out.println(find1.value);
				find1 = find1.next;
				find2 = find2.next;
			}
		}
	}

	/*
	 * ����һ��ֵNum��һ������ͷ�ڵ� �������� �ѵĵ���numֵ�Ľڵ�����м� ����numֵ���������� С�ڷ���ǰ��
	 * 
	 */

	public static Node spiltList(Node head, int num) {
		Lianbiao maxList = new Lianbiao();
		Lianbiao equList = new Lianbiao();
		Lianbiao minList = new Lianbiao();

		for (Node current = head.next; current.next != null; current = current.next) {
			if (current.value < num)
				minList.append(current.value);
			if (current.value == num)
				equList.append(current.value);
			if (current.value > num)
				maxList.append(current.value);
		}
		Node firstNode;
		if ((firstNode = minList.getHead().next) != null)
			head.next = firstNode;
		if ((firstNode = equList.getHead().next) != null)
			getTail(head).next = firstNode;
		if ((firstNode = maxList.getHead().next) != null)
			getTail(head).next = firstNode;

		return head;
	}

	/*
	 * ����һ��ͷ��㡣��ȡ��������β�ڵ�
	 * 
	 */
	public static Node getTail(Node head) {
		if (head.next == null)
			return head;
		Node current = head.next;
		for (; current.next != null; current = current.next)
			;

		return current;
	}

	/*
	 * ����������£�����һ����ͷ�ڵ�Node
	 * 
	 * ��ɾ�����Node
	 * 
	 * ��Ҫע����ǣ������NodeΪ�������һ���ڵ���������� ���ַ���ʧЧ
	 */

	public static void removeNodeWithHead(Node notHead) {
		if (notHead.next == null) {
			throw new RuntimeException("���һ���ڵ��޷�ʹ���������ɾ��");
		}

		notHead.value = notHead.next.value;
		notHead.next = notHead.next.next;

	}

	/*
	 * ʵ�ֵ�����ת ���磺 1 2 3 4 5 ��Ϊ 5 4 3 2 1
	 * 
	 */

	public static Node revert(Node head) {
		if (head.next == null) {
			return head;
		}
		Node pre = null;
		Node now = head.next;
		Node save = now.next;
		while (save != null) {
			now.next = pre;
			pre = now;
			now = save;
			save = save.next;
		}
		now.next = pre;
		head.next = now;

		return head;
	}

	/*
	 * ����ѭ������Ĳ���
	 * 
	 */

	public static Node loopInsert(Node head, int value) {
		Node newNode = new Node(value);
		if (head.next == null) {
			newNode.next = newNode;
			head.next = newNode;
			return head;
		}

		Node before = head.next;
		Node after = before.next;

		while (after.next != head.next) {
			if (before.value <= value && after.value >= value) {
				before.next = newNode;
				newNode.next = after;
				break;
			}
			before = before.next;
			after = after.next;
		}
		if (newNode.next == null) {
			newNode.next = after.next;
			after.next = newNode;
			if (newNode.value < head.next.value) {
				head.next = newNode;
			}
		}

		return head;
	}
}
