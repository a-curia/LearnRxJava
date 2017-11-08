package com.dbbyte.rxjava1;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.observers.ResourceObserver;

public class Launcher32 {

	// take()/takeLast()

	/*
	 * The take() operator has two overloads. One will take a specified number of
	 * emissions and then call onComplete() after it captures all of them. It will
	 * also dispose of the entire subscription so that no more emissions will occur.
	 * For instance, take(3) will emit the first three emissions and then call the
	 * onComplete() event
	 */

	// public static void main(String[] args) {
	//
	// Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon").take(3)
	// .subscribe(s -> System.out.println("RECEIVED: " + s));
	// }

	//

	public static void main(String[] args) {

		Observable.interval(300, TimeUnit.MILLISECONDS).take(2, TimeUnit.SECONDS)
				.subscribe(i -> System.out.println("RECEIVED: " + i));

		sleep(5000);
	}

	public static void sleep(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
