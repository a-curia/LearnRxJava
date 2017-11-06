package com.dbbyte.rxjava1;

import io.reactivex.Completable;

public class Launcher16 {

	// Completable

	/*
	 * Completable is simply concerned with an action being executed, but it does not receive any emissions. 
	 * Logically, it does not have  onNext() or onSuccess() to receive emissions, but it does have onError() 
	 * and onComplete()
	 */

	public static void main(String[] args) {
		
		/*
		 * Completable is something you likely will not use often. You can construct one quickly by calling 
		 * Completable.complete() or Completable.fromRunnable(). The former will immediately call onComplete() without 
		 * doing anything, while fromRunnable() will execute the specified action before calling onComplete()
		 */
		
        Completable.fromRunnable(() -> runProcess())
        .subscribe(() -> System.out.println("Done!"));
	}

	private static Object runProcess() {
		// TODO Auto-generated method stub
		return null;
	}
}
