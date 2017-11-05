package com.dbbyte.rxjava1;

import io.reactivex.Observable;

public class Launcher7 {

	// Observable.range()

	public static void main(String[] args) {

		Observable.range(1, 10)
			.subscribe(s -> System.out.println("RECEIVED: " + s));
	}
}
