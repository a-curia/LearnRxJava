package com.dbbyte.rxjava1;

import io.reactivex.Observable;
import io.reactivex.Single;

public class Launcher14 {

	// Single

	/*
	 * The onSuccess() essentially consolidates onNext() and onComplete() into a
	 * single event that accepts the one emission. When you call subscribe() against
	 * a Single, you provide the lambdas for onSuccess() as well as an optional
	 * onError()
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
