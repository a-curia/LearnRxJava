package com.dbbyte.rxjava1;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

public class Launcher17 {

	// Using CompositeDisposable

	/*
	 * If you have several subscriptions that need to be managed and disposed of, it
	 * can be helpful to use CompositeDisposable. It implements Disposable, but it
	 * internally holds a collection of disposables, which you can add to and then
	 * dispose all at once
	 */

	private static final CompositeDisposable disposables = new CompositeDisposable();

	public static void main(String[] args) {

		Observable<Long> seconds = Observable.interval(1, TimeUnit.SECONDS);

		// subscribe and capture disposables
		Disposable disposable1 = seconds.subscribe(l -> System.out.println("Observer 1: " + l));

		Disposable disposable2 = seconds.subscribe(l -> System.out.println("Observer 2: " + l));

		// put both disposables into CompositeDisposable
		disposables.addAll(disposable1, disposable2);

		// sleep 5 seconds
		sleep(5000);

		// dispose all disposables
		disposables.dispose();

		// sleep 5 seconds to prove
		// there are no more emissions
		sleep(5000);

	}

	public static void sleep(int millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
