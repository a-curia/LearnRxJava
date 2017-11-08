package com.dbbyte.rxjava1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import io.reactivex.Observable;

public class Launcher40 {

	// startWith()

	/*
	 * For a given Observable<T>, the startWith() operator allows you to insert a T
	 * emission that precedes all the other emissions. For instance, if we have an
	 * Observable<String>that emits items on a menu we want to print, we can use
	 * startWith() to append a title header first
	 */

	// public static void main(String[] args) {
	//
	// Observable<String> menu = Observable.just("Coffee", "Tea", "Espresso",
	// "Latte");
	//
	// // print menu
	// menu.startWith("COFFEE SHOP MENU").subscribe(System.out::println);
	// }

	// if you want more than one emission

	public static void main(String[] args) {

		Observable<String> menu = Observable.just("Coffee", "Tea", "Espresso", "Latte");

		// print menu
		menu.startWithArray("COFFEE SHOP MENU", "----------------").subscribe(System.out::println);

	}
}
