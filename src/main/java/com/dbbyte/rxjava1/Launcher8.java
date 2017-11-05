package com.dbbyte.rxjava1;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;

public class Launcher8 {

	// Observable.interval()

	public static void main(String[] args) {

		Observable.interval(1, TimeUnit.SECONDS).subscribe(s -> System.out.println(s + " Mississippi"));
		sleep(5000);// To keep our main() method from finishing and exiting the application before
					// our Observable has a chance to fire

	}

	public static void sleep(int millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
