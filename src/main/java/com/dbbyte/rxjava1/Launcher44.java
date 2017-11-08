package com.dbbyte.rxjava1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;

public class Launcher44 {

	// repeat()/repeatUntil()

	/*
	 * The repeat() operator will repeat subscription upstream after onComplete() a
	 * specified number of times.
	 */

	public static void main(String[] args) {

		Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon").repeat(2)
				.subscribe(s -> System.out.println("Received: " + s));
	}

	/*
	 * If you do not specify a number, it will repeat infinitely, forever
	 * re-subscribing after every onComplete(). There is also a repeatUntil()
	 * operator that accepts a Boolean Supplier lambda argument and will continue
	 * repeating until it yields true.
	 */

}
