package com.dbbyte.rxjava1;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.observers.ResourceObserver;

public class Launcher31 {

	// FILTER

	/*
	 * The filter() operator accepts Predicate<T> for a given Observable<T>. This
	 * means that you provide it a lambda that qualifies each emission by mapping it
	 * to a Boolean value, and emissions with false will not go forward.
	 */

	public static void main(String[] args) {

		Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon")
			.filter(s -> s.length() != 5)
			.subscribe(s -> System.out.println("RECEIVED: " + s));
	}

}
