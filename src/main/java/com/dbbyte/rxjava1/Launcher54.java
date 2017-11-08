package com.dbbyte.rxjava1;

import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;

import io.reactivex.Observable;

public class Launcher54 {

	// toMap() and toMultiMap()

	/*
	 * When none of the collection operators have what you need, you can always use
	 * the collect() operator to specify a different type to collect items into. For
	 * instance, there is no toSet() operator to collect emissions into a Set<T>,
	 * but you can quickly use collect() to effectively do this.
	 * 
	 * You will need to specify two arguments that are built with lambda
	 * expressions: initialValueSupplier, which will provide a new HashSetfor a new
	 * Observer, and collector, which specifies how each emission is added to that
	 * HashSet
	 */

	public static void main(String[] args) {

		Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon").collect(HashSet::new, HashSet::add)
				.subscribe(s -> System.out.println("Received: " + s));

		// guava immutable
//		Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon")
//				.collect(ImmutableList::builder, ImmutableList.Builder::add).map(ImmutableList.Builder::build)
//				.subscribe(s -> System.out.println("Received: " + s));
	}

}
