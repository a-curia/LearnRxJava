package com.dbbyte.rxjava1;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class Launcher3 {

	public static void main(String[] args) {

		Observable<String> source = Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon");

		Observer<Integer> myObserver = new Observer<Integer>() {

			@Override
			public void onComplete() {
				System.out.println("Done!");

			}

			@Override
			public void onError(Throwable e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void onNext(Integer value) {
				System.out.println("RECEIVED: " + value);

			}

			@Override
			public void onSubscribe(Disposable d) {
				// TODO Auto-generated method stub

			}

		};

		source.map(String::length)
			.filter(i -> i >= 5).subscribe(myObserver);
		
	}

}
