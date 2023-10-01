package hw8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestTrain extends Train{
	public TestTrain(int number, String type, String start, String dest, double price) {
		super(number, type, start, dest, price);
	}

	public static void main(String[] args) {
		Train t1 = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
		Train t2 = new Train(1254, "區間", "屏東", "基隆", 700);
		Train t3 = new Train(118, "自強", "高雄", "台北",500);
		Train t4 = new Train(1288, "區間", "新竹", "基隆", 400);
		Train t5 = new Train(122, "自強", "台中", "花蓮", 600);
		Train t6 = new Train(1222, "區間", "樹林", "七堵", 300);
		Train t7 = new Train(1254, "區間", "屏東", "基隆", 700);
		
		//1.
		
		HashSet<Object> set = new HashSet<Object>();
		set.add(t1);
		set.add(t2);
		set.add(t3);
		set.add(t4);
		set.add(t5);
		set.add(t6);
		set.add(t7);
		
		
		public String toString() {
			return "("+ number + ")" ;
		}
		Iterator<Object> obj = set.iterator();
		while(obj.hasNext()) {
			System.out.println(obj.next());
		}
	}
	
}
