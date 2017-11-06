package com.dbbyte.rxjava1;

import io.reactivex.Maybe;

public class Launcher15 {

	// Maybe

	/*
	 * Maybe is just like a Single except that it allows no emission to occur at all
	 * (hence Maybe). MaybeObserver is much like a standard Observer, but onNext()
	 * is called onSuccess() instead
	 */

	public static void main(String[] args) {
		
		/*
		 * A given Maybe<T> will only emit 0 or  1 emissions. It will pass the possible emission to onSuccess(), 
		 * and in either case, it will call onComplete() when done. Maybe.just() can be used to create a Maybe 
		 * emitting the single item. Maybe.empty() will create a Maybe that yields no emission
		 */

        // has emission
        Maybe<Integer> presentSource = Maybe.just(100);

        presentSource.subscribe(s -> System.out.println("Process 1 received: " + s),
        Throwable::printStackTrace,
        () -> System.out.println("Process 1 done!"));

        //no emission
        Maybe<Integer> emptySource = Maybe.empty();

        emptySource.subscribe(s -> System.out.println("Process 2 received: " + s),
        Throwable::printStackTrace,
        () -> System.out.println("Process 2 done!"));
	}
}
