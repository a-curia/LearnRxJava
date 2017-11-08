package com.dbbyte.rxjava1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import io.reactivex.Observable;

public class Launcher42 {

	// switchIfEmpty()

	/*
	 * Similar to defaultIfEmpty(), switchIfEmpty() specifies a different Observable
	 * to emit values from if the source Observable is empty. This allows you
	 * specify a different sequence of emissions in the event that the source is
	 * empty rather than emitting just one value.
	 */

	public static void main(String[] args) {

		Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon").filter(s -> s.startsWith("Z"))
				.switchIfEmpty(Observable.just("Zeta", "Eta", "Theta"))
				.subscribe(i -> System.out.println("RECEIVED: " + i), e -> System.out.println("RECEIVED ERROR: " + e));
	}
}
