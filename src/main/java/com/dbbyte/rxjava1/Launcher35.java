package com.dbbyte.rxjava1;

import io.reactivex.Observable;

public class Launcher35 {

	// distinct()

	/*
	 * The distinct() operator will emit each unique emission, but it will suppress
	 * any duplicates that follow. Equality is based on hashCode()/equals()
	 * implementation of the emitted objects.
	 * 
	 * Keep in mind that if you have a wide, diverse spectrum of unique values,
	 * distinct() can use a bit of memory. Imagine that each subscription results in
	 * a HashSet that tracks previously captured unique values.
	 */

	// public static void main(String[] args) {
	//
	// Observable.just("Alpha", "Beta", "Gamma", "Delta",
	// "Epsilon").map(String::length).distinct()
	// .subscribe(i -> System.out.println("RECEIVED: " + i));
	//
	// }

	public static void main(String[] args) {

		Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon").distinct(String::length)
				.subscribe(i -> System.out.println("RECEIVED: " + i));

	}

}
