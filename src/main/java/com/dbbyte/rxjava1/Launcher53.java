package com.dbbyte.rxjava1;

import java.util.concurrent.ConcurrentHashMap;

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

		Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon").toMap(s -> s.charAt(0), String::length)
				.subscribe(s -> System.out.println("Received: " + s));

		Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon")
				.toMap(s -> s.charAt(0), String::length, ConcurrentHashMap::new)
				.subscribe(s -> System.out.println("Received: " + s));
		/*
		 * Note that if I have a key that maps to multiple emissions, the last emission
		 * for that key is going to replace subsequent ones. If I make the string length
		 * the key for each emission, Alpha is going to be replaced by Gamma, which is
		 * going to be replaced by Delta
		 */
		Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon").toMap(String::length)
				.subscribe(s -> System.out.println("Received: " + s));

		/*
		 * f you want a given key to map to multiple emissions, you can use toMultiMap()
		 * instead, which will maintain a list of corresponding values for each key.
		 * Alpha, Gamma, and Delta will then all be put in a list that is keyed off the
		 * length five
		 */
		Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon").toMultimap(String::length)
				.subscribe(s -> System.out.println("Received: " + s));
	}

}
