package com.dbbyte.rxjava1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import io.reactivex.Observable;

public class Launcher38 {

	// map()

	/*
	 * For a given Observable<T>, the map() operator will transform a T emission
	 * into an R emission using the provided Function<T,R> lambda. We have already
	 * used this operator many times, turning strings into lengths. Here is a new
	 * example: we can take raw date strings and use the map() operator to turn each
	 * one into a LocalDate emission, as shown in the following code snippet
	 * 
	 * The map() operator does a one-to-one conversion for each emission.
	 * 
	 * If you need to do a one-to-many conversion (turn one emission into several
	 * emissions), you will likely want to use flatMap() or concatMap(), which we
	 * will cover in the next chapter.
	 */

	public static void main(String[] args) {

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("M/d/yyyy");

		Observable.just("1/3/2016", "5/9/2016", "10/12/2016").map(s -> LocalDate.parse(s, dtf))
				.subscribe(i -> System.out.println("RECEIVED: " + i));
	}
}
