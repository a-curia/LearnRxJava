package com.dbbyte.rxjava1;

import io.reactivex.Observable;

public class Launcher36 {

	// distinctUntilChanged()

	/*
	 * The distinctUntilChanged() function will ignore duplicate consecutive
	 * emissions. It is a helpful way to ignore repetitions until they change. If
	 * the same value is being emitted repeatedly, all the duplicates will be
	 * ignored until a new value is emitted. Duplicates of the next value will be
	 * ignored until it changes again, and so on.
	 */

	// public static void main(String[] args) {
	//
	// Observable.just(1, 1, 1, 2, 2, 3, 3, 2, 1, 1).distinctUntilChanged()
	// .subscribe(i -> System.out.println("RECEIVED: " + i));
	//
	// }

	public static void main(String[] args) {

		Observable.just("Alpha", "Beta", "Zeta", "Eta", "Gamma", "Delta").distinctUntilChanged(String::length)
				.subscribe(i -> System.out.println("RECEIVED: " + i));
	}
}
