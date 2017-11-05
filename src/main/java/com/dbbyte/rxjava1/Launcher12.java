package com.dbbyte.rxjava1;

import io.reactivex.Observable;

public class Launcher12 {

	// Observable.defer()

	/*
	 * To remedy this problem of Observable sources not capturing state changes, you can create a fresh Observable for 
	 * each subscription. This can be achieved using Observable.defer(), which accepts a lambda instructing how to create an
	 *  Observable for every subscription. Because this creates a new Observable each time, it will reflect any changes 
	 *  driving its parameters
	 */
	private static int start = 1;
	private static int count = 5;

	public static void main(String[] args) {

		Observable<Integer> source = Observable.defer(() -> Observable.range(start, count));

		source.subscribe(i -> System.out.println("Observer 1: " + i));

		// modify count
		count = 10;

		source.subscribe(i -> System.out.println("Observer 2: " + i));
	}
}
