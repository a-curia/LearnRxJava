package com.dbbyte.rxjava1;

import java.util.Arrays;
import java.util.List;

import io.reactivex.Observable;

public class Launcher2 {

	public static void main(String[] args) {
		Observable<String> source = Observable.create(emitter -> {
			try {
				emitter.onNext("Alpha");
				emitter.onNext("Beta");
				emitter.onNext("Gamma");
				emitter.onNext("Delta");
				emitter.onNext("Epsilon");
				emitter.onComplete();
			} catch (Throwable e) {
				emitter.onError(e);
			}
		});

		source.subscribe(s -> System.out.println("RECEIVED: " + s), Throwable::printStackTrace);

		/*
		 * The onNext() method is a way to hand each item, starting with Alpha, to the
		 * next step in the chain. In this example, the next step is the Observer, which
		 * prints the item using the s -> System.out.println("RECEIVED: " + s) lambda.
		 * This lambda is invoked in the onNext() call of Observer, and we will look at
		 * Observer more closely in a moment.
		 * 
		 */

		/*
		 * Note that onNext(), onComplete(), and onError() do not necessarily push
		 * directly to the final Observer
		 */
		Observable<String> source2 = Observable.create(emitter -> {
			try {
				emitter.onNext("Alpha");
				emitter.onNext("Beta");
				emitter.onNext("Gamma");
				emitter.onNext("Delta");
				emitter.onNext("Epsilon");
				emitter.onComplete();
			} catch (Throwable e) {
				emitter.onError(e);
			}
		});
		Observable<Integer> lengths = source2.map(String::length);

		Observable<Integer> filtered = lengths.filter(i -> i >= 5);

		filtered.subscribe(s -> System.out.println("RECEIVED: " + s));

		// all the above chained
		source2.map(String::length).filter(i -> i >= 5).subscribe(s -> System.out.println("RECEIVED: " + s));

		// just
		Observable<String> source3 = Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon");
		source3.map(String::length).filter(i -> i >= 5).subscribe(s -> System.out.println("RECEIVED: " + s));

		// from Iterable type such as List
		List<String> items = Arrays.asList("Alpha", "Beta", "Gamma", "Delta", "Epsilon");

		Observable<String> source4 = Observable.fromIterable(items);
		source4.map(String::length).filter(i -> i >= 5).subscribe(s -> System.out.println("RECEIVED: " + s));
	}

}
