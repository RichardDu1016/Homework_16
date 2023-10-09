package hw8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TestTrain extends Train{
	public TestTrain(int number, String type, String start, String dest, double price) {
		super(number, type, start, dest, price);
	}

	public static void main(String[] args) {
		Train[] train = new Train[7];
		train[0]= new Train(202, "普悠瑪", "樹林", "花蓮", 400);
		train[1]= new Train(1254, "區間", "屏東", "基隆", 700);
		train[2]= new Train(118, "自強", "高雄", "台北",500);
		train[3]= new Train(1288, "區間", "新竹", "基隆", 400);
		train[4]= new Train(122, "自強", "台中", "花蓮", 600);
		train[5]= new Train(1222, "區間", "樹林", "七堵", 300);
		train[6]= new Train(1254, "區間", "屏東", "基隆", 700);
		
		
		//1.
		
		Set<Train> set = new HashSet<Train>();
		for(int i = 0; i < train.length;i ++) {
			set.add(train[i]);
		}
	
		
		//Iterator方法
		System.out.println("Iterator方法印出：");
		Iterator<Train> itr0 = set.iterator();
		while(itr0.hasNext()) {
			Train objs = (Train)itr0.next();
			System.out.println(objs.getAll());
		}
		System.out.println();
		//for-each方法
		System.out.println("for-each方法印出：");
		for(Train objs : set) {
			System.out.println(objs.getAll());
		}
		
		
		
		System.out.println("=============================================");
		//2.
		List<Train> train_list = new ArrayList<Train>();
		for(int i = 0; i < train.length;i ++) {
			train_list.add(train[i]);
		}
		
		Collections.sort(train_list);
		
		//傳統for迴圈
		System.out.println("for方法印出：");
		for(int i = 0 ; i < train_list.size(); i++) {
			System.out.println(train_list.get(i).getAll());
		}

		System.out.println("");
		//Iterator
		System.out.println("Iterator方法印出：");
		Iterator<Train> itr1 =  train_list.iterator();
		while(itr1.hasNext()) {
			Train objs = (Train) itr1.next();
			System.out.println(objs.getAll());
		}
		System.out.println("");
		//for-each方法\
		System.out.println("for-each方法印出：");
		for(Train objs : train_list) {
			System.out.println(objs.getAll());
		}
		
		
		
		
		System.out.println("=============================================");
		
		
		
		//3.
		
		Set<Train> train_set = new TreeSet<Train>();
		for(int i =0; i < train.length; i++) {
			train_set.add(train[i]);
		}
		
		//Iterator
		System.out.println("Iterator方法印出：");
		Iterator<Train> itr2 =  train_set.iterator();
		while(itr2.hasNext()) {
			Train objs = (Train) itr2.next();
			System.out.println(objs.getAll());
		}
		System.out.println("");
		//for-each方法
		System.out.println("for-each方法印出：");
		for(Train objs : train_set) {
			System.out.println(objs.getAll());
		}

	}
	
}
