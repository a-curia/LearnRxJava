package com.dbbyte.rxjava1;

import io.reactivex.Observable;

public class Launcher11 {

	// Observable.never()

	public static void main(String[] args) {

		Observable<String> empty = Observable.never();

		empty.subscribe(System.out::println, Throwable::printStackTrace, () -> System.out.println("Done!"));

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
