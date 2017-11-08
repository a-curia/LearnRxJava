package com.dbbyte.rxjava1;

import io.reactivex.Observable;

public class Launcher33 {

	// skip() + overloaded with time option/skipLast()

	/*
	 * The skip() operator does the opposite of the take() operator. It will ignore
	 * the specified number of emissions and then emit the ones that follow.
	 */

	public static void main(String[] args) {

		Observable.range(1, 100).skip(90).subscribe(i -> System.out.println("RECEIVED: " + i));

	}

}
