package com.dbbyte.rxjava1;


import io.reactivex.Observable;

public class Launcher10 {

	// Observable.empty()

	public static void main(String[] args) {

		Observable<String> empty = Observable.empty();
		empty.subscribe(System.out::println, Throwable::printStackTrace, () -> System.out.println("Done!"));
	}

}
