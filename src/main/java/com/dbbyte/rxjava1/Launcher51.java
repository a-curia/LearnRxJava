package com.dbbyte.rxjava1;

import java.util.concurrent.CopyOnWriteArrayList;

import io.reactivex.Observable;

public class Launcher51 {

	// toList()

	/*
	 * For a given Observable<T>, it will collect incoming emissions into a List<T>
	 * and then push that entire List<T> as a single emission (through
	 * Single<List<T>>). In the following code snippet, we collect string emissions
	 * into a List<String>. After the preceding Observable signals onComplete(),
	 * that list is pushed forward to the observer to be printed
	 */

	public static void main(String[] args) {

		Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon").toList()
				.subscribe(s -> System.out.println("Received: " + s));

		// improve performance set array size
		Observable.range(1, 1000).toList(1000).subscribe(s -> System.out.println("Received: " + s));

		// different list besides array list
		Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon").toList(CopyOnWriteArrayList::new)
				.subscribe(s -> System.out.println("Received: " + s));

		// google guava... immutable list.. trickier because uses a builder

	}

}
