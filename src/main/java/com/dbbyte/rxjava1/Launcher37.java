package com.dbbyte.rxjava1;

import io.reactivex.Observable;

public class Launcher37 {

	// elementAt() /elementAtOrError()/singleElement() turn Observable into Maybe
	// and error if there is anything beyond one element
	// irstElement() and lastElement() will yield, maybe emitting the first or last
	// emission, respectively

	/*
	 * You can get a specific emission by its index specified by a Long, starting at
	 * 0. After that item is found and emitted, onComplete() will be called and the
	 * subscription will be disposed of.
	 * 
	 * You may not have noticed, but elementAt() returns Maybe<T> instead of
	 * Observable<T>. This is because it will yield one emission, but if there are
	 * fewer emissions than the sought index, it will be empty.
	 */

	public static void main(String[] args) {

		Observable.just("Alpha", "Beta", "Zeta", "Eta", "Gamma", "Delta").elementAt(3)
				.subscribe(i -> System.out.println("RECEIVED: " + i));
	}
}
