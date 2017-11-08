package com.dbbyte.rxjava1;


import io.reactivex.Observable;

public class Launcher53 {

	// toMap() and toMultiMap()

	/*
	 * For a given Observable<T>, the toMap() operator will collect emissions into
	 * Map<K,T>, where K is the key type derived off a lambda Function<T,K> argument
	 * producing the key for each emission.
	 */

	public static void main(String[] args) {

		Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon").toMap(s -> s.charAt(0))
				.subscribe(s -> System.out.println("Received: " + s));
	}

}
