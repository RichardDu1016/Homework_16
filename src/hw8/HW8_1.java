package hw8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HW8_1 {


	public static void main(String[] args) {
		List<Object> list = new ArrayList<Object>();
		list.add(100);
		list.add(3.14);
		list.add(21L);
		list.add("100");
		list.add(5.1);
		list.add("Kitty");
		list.add(100);
		list.add(new Object());
		list.add("Snoopy");
		list.add(new BigInteger("1000"));
//		
//		System.out.println("toString()=" + list);
//		System.out.println("元素個素　= " + list.size());
		
		//Iterator
		Iterator<Object> obj = list.iterator();
		while(obj.hasNext()) {
			System.out.println(obj.next());
		}
		System.out.println("============================");
		
//		
		for(int i = 0; i < list.size(); i++) {
			Object obj2 = list.get(i);
			System.out.println(obj2);
		}
//		System.out.println("============================");
		
		//for-each
		for(Object obj3: list) {
			System.out.println(obj3);
		}
		//移除不是　java.lang.num　物件
			
		 List<Object> elementsToRemove = new ArrayList<>();
	        for (Object element : list) {
	            if (!(element instanceof Number)) {
	                elementsToRemove.add(element);
	            }
	        }

	        // 移除非Number相关的元素
	        list.removeAll(elementsToRemove);

	        System.out.println(list);
		
	}

}
