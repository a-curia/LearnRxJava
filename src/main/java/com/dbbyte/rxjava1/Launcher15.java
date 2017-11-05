package com.dbbyte.rxjava1;

import io.reactivex.Observable;
import io.reactivex.Single;

public class Launcher15 {

	// Maybe

	/*
	 * Maybe is just like a Single except that it allows no emission to occur at all (hence Maybe). 
	 * MaybeObserver is much like a standard Observer, but onNext() is called onSuccess() instead
	 */

	public static void main(String[] args) {

		Single.just("Hello").map(String::length).subscribe(System.out::println, Throwable::printStackTrace);

		/*
		 * Certain RxJava Observable operators will yield a Single, as we will see in
		 * the next chapter. For instance, the first() operator will return a Single
		 * since that operator is logically concerned with a single item.
		 */

		Observable<String> source = Observable.just("Alpha", "Beta", "Gamma");

		source.first("Nil") // returns a Single
				.subscribe(System.out::println);
	}
}
