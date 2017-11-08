package com.dbbyte.rxjava1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;

public class Launcher46 {

	// count()

	/*
	 * The simplest operator to consolidate emissions into a single one is count().
	 * It will count the number of emissions and emit through a Single once
	 * onComplete() is called
	 */

	public static void main(String[] args) {

		Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon").count()
				.subscribe(s -> System.out.println("Received: " + s));

	}

}
