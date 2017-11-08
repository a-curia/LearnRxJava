package com.dbbyte.rxjava1;

import io.reactivex.Observable;

public class Launcher34 {

	// takeWhile() and skipWhile() | takeUntil() and skipUntil() 

	/*
	 * Another variant of the take() operator is the takeWhile() operator, which
	 * takes emissions while a condition derived from each emission is true. The
	 * following example will keep taking emissions while emissions are less than 5.
	 * The moment it encounters one that is not, it will call the onComplete()
	 * function and dispose of this
	 */

	public static void main(String[] args) {

		Observable.range(1, 100).takeWhile(i -> i < 5).subscribe(i -> System.out.println("RECEIVED: " + i));

	}

}
