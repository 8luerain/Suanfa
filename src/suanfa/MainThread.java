package suanfa;

import java.util.LinkedList;

import suanfa.Lianbiao.Node;

public class MainThread {

	private static int[] data = new int[] { 5, 2, 6, 1, 9, 7, 3, 6 };

	public static void main(String[] args) {
		// Suanfa.charu_suanfa(data);
		// Suanfa.maopao_suanfa(data);
		// Suanfa.jiandan_suanfa(data);
		// Suanfa.kuaisu_suanfa(data, 0, data.length-1);
		// Suanfa.AdjustArray(data, 0, data.length-1);
		Lianbiao lianbiao = new Lianbiao();
		lianbiao.append(new int[] { 1, 2, 3, 4, 5, 6, 7, 10, 11 });
		Lianbiao l2 = new Lianbiao();
		l2.append(data);
		Lianbiao l3 = new Lianbiao();
		l3.append(new int[] { 4, 6, 7 });
		// lianbiao.getTail().next = lianbiao.getHead().next;
		// lianbiao.print();
		// Utils.print(lianbiao.getHead());
		// Utils.print(LianbiaoSuanfa.loopInsert(lianbiao.getHead(),-10));

		// Node needToRemove = lianbiao.getHead().next.next.next;
		// System.out.print("before remove node :");
		// Utils.print(lianbiao.getHead());
		// LianbiaoSuanfa.removeNodeWithHead(needToRemove);
		// System.out.print("after remove node :");
		// Utils.print(lianbiao.getHead());

		// lianbiao.append(l2);
		// Utils.print(lianbiao.getHead());
		//

		// Utils.print(LianbiaoSuanfa.spiltList(l2.getHead(), 5));

		// LianbiaoSuanfa.findSameValue(lianbiao.getHead(), l3.getHead());

		// PaixuSuanfa.moxie(data, 0, data.length - 1);
		// Utils.printData("moxie", data);

		// Lianbiao ll = new Lianbiao();
		// ll.append(new int[] { 1,2,3,3,2,1 });
		// System.out.println(LianbiaoSuanfa.checkLoopLinkedList(ll.getHead()));

		// Lianbiao ll = new Lianbiao();
		// ll.append(new int[] { 1, 2, 3, 3, 2, 1 });
		// ll.getTail().next = ll.getHead().next.next;
		// System.out.println(LianbiaoSuanfa.ifLinkedHasLoop(ll.getHead()));

		// -----------------------------String≤‚ ‘

		System.out.println(StringSuanfa.revertEveryChar("abgcde"));

	}

}
