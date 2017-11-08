package com.dbbyte.rxjava1;

import java.time.LocalDate;

import io.reactivex.Observable;

public class Launcher50 {

	// contains()

	/*
	 * The contains() operator will check whether a specific element (based on the
	 * hashCode()/equals() implementation) ever emits from an Observable. It will
	 * return a Single<Boolean> that will emit true if it is found and false if it
	 * is not.
	 */

	public static void main(String[] args) {

		Observable.range(1, 10000).contains(9563).subscribe(s -> System.out.println("Received: " + s));

	}

}
