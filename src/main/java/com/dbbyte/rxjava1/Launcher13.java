package com.dbbyte.rxjava1;

import io.reactivex.Observable;

public class Launcher13 {

	// Observable.fromCallable()

	/*
	 * If you need to perform a calculation or action and then emit it, you can use
	 * Observable.just() (or Single.just() or Maybe.just(), which we will learn
	 * about later). But sometimes, we want to do this in a lazy or deferred manner.
	 * Also, if that procedure throws an error, we want it to be emitted up the
	 * Observable chain through onError() rather than throw the error at that
	 * location in traditional Java fashion. For instance, if you try to wrap
	 * Observable.just() around an expression that divides 1 by 0, the exception
	 * will be thrown, not emitted up to Observer
	 */

	public static void main(String[] args) {

		// Observable.just(1 / 0).subscribe(i -> System.out.println("RECEIVED: " + i),
		// e -> System.out.println("Error Captured: " + e));

		Observable.fromCallable(() -> 1 / 0).subscribe(i -> System.out.println("Received: " + i),
				e -> System.out.println("Error Captured: " + e));
	}
}
