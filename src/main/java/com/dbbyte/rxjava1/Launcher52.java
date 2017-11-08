package com.dbbyte.rxjava1;

import java.util.concurrent.CopyOnWriteArrayList;

import io.reactivex.Observable;

public class Launcher52 {

	// toSortedList()

	/*
	 * . This will collect the emissions into a list that sorts the items naturally
	 * based on their Comparator implementation. Then, it will emit that sorted
	 * List<T> forward to the Observer
	 */

	public static void main(String[] args) {

		Observable.just(6, 2, 5, 7, 1, 4, 9, 8, 3).toSortedList().subscribe(s -> System.out.println("Received: " + s));

		/*
		 * Like sorted(), you can provide a Comparator as an argument to apply a
		 * different sorting logic. You can also specify an initial capacity for the
		 * backing ArrayList just like toList().
		 */
	}

}
