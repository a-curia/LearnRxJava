package com.dbbyte.rxjava1;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.observers.ResourceObserver;

public class Launcher18 {

	// Disposing - disconecting from emissions

	/*
	 * Note that passing an Observer to the subscribe() method will be void and not
	 * return a Disposable since it is assumed that the Observer will handle it. If
	 * you do not want to explicitly handle the Disposable and want RxJava to handle
	 * it for you (which is probably a good idea until you have reason to take
	 * control), you can extend ResourceObserver as your Observer, which uses a
	 * default Disposable handling. Pass this to subscribeWith() instead of
	 * subscribe(), and you will get the default Disposable returned
	 */

	public static void main(String[] args) {

		Observable<Long> source = Observable.interval(1, TimeUnit.SECONDS);

		ResourceObserver<Long> myObserver = new ResourceObserver<Long>() {
			@Override
			public void onNext(Long value) {
				System.out.println(value);
			}

			@Override
			public void onError(Throwable e) {
				e.printStackTrace();
			}

			@Override
			public void onComplete() {
				System.out.println("Done!");
			}
		};

		// capture Disposable
		Disposable disposable = source.subscribeWith(myObserver);
	}

}
