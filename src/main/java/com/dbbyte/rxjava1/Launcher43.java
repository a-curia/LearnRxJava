package com.dbbyte.rxjava1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;

import io.reactivex.Observable;

public class Launcher43 {

	// sorted()

	/*
	 * If you have a finite Observable<T> emitting items that implement
	 * Comparable<T>, you can use sorted() to sort the emissions. Internally, it
	 * will collect all the emissions and then re-emit them in their sorted order.
	 */

	// public static void main(String[] args) {
	//
	// Observable.just(6, 2, 5, 7, 1, 4, 9, 8,
	// 3).sorted().subscribe(System.out::println);
	// }

	/*
	 * You can also provide Comparator as an argument to specify an explicit sorting
	 * criterion. We can provide Comparator to reverse the sorting order, such as
	 * the one shown as follows
	 */

	public static void main(String[] args) {

		// Observable.just(6, 2, 5, 7, 1, 4, 9, 8,
		// 3).sorted(Comparator.reverseOrder()).subscribe(System.out::println);
		Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon")
				.sorted((x, y) -> Integer.compare(x.length(), y.length())).subscribe(System.out::println);
	}
}
