package com.dbbyte.rxjava1;

import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;

import io.reactivex.Observable;

public class Launcher55 {

	// Error recovery operators

	public static void main(String[] args) {

		Observable.just(5, 2, 4, 0, 3, 2, 8).map(i -> 10 / i).subscribe(i -> System.out.println("RECEIVED: " + i),
				e -> System.out.println("RECEIVED ERROR: " + e));
	}

}
