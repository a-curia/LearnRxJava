package com.dbbyte.rxjava1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import io.reactivex.Observable;

public class Launcher41 {

	// defaultIfEmpty()

	/*
	 * If we want to resort to a single emission if a given Observable comes out
	 * empty, we can use defaultIfEmpty(). For a given Observable<T>, we can specify
	 * a default T emission if no emissions occur when onComplete() is called.
	 */

	public static void main(String[] args) {

		Observable<String> items = Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon");

		items.filter(s -> s.startsWith("Z")).defaultIfEmpty("None").subscribe(System.out::println);
	}
}
