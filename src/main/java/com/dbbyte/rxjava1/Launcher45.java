package com.dbbyte.rxjava1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;

public class Launcher45 {

	// scan() method is a rolling aggregator

	/*
	 * For every emission, you add it to an accumulation. Then, it will emit each
	 * incremental accumulation.
	 */

	public static void main(String[] args) {

		Observable.just(5, 3, 7, 10, 2, 14).scan((accumulator, next) -> accumulator + next)
				.subscribe(s -> System.out.println("Received: " + s));
		System.out.println("-----------------------------------------");
		Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon").scan(0, (total, next) -> total + 1)
				.subscribe(s -> System.out.println("Received: " + s));

	}

	/*
	 * If you do not specify a number, it will repeat infinitely, forever
	 * re-subscribing after every onComplete(). There is also a repeatUntil()
	 * operator that accepts a Boolean Supplier lambda argument and will continue
	 * repeating until it yields true.
	 */

}
