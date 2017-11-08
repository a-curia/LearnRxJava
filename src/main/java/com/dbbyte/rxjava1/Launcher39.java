package com.dbbyte.rxjava1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import io.reactivex.Observable;

public class Launcher39 {

	// cast()

	/*
	 * A simple, map-like operator to cast each emission to a different type is
	 * cast().
	 * 
	 * If we want to take Observable<String> and cast each emission to an object
	 * (and return an Observable<Object>), we could use the map() operator like this
	 */

	public static void main(String[] args) {

		Observable<Object> items = Observable.just("Alpha", "Beta", "Gamma").map(s -> (Object) s);

		// equivalent using cast()

		Observable<Object> items2 = Observable.just("Alpha", "Beta", "Gamma").cast(Object.class);

	}
}
