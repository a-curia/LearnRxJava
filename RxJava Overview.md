### RxJava

Observable.crate() : is a source Observable where emissions originate from and is the starting point of our Observable chain
Observable.crate() factory : allows creation by prividing a lambda receiving an Observable emitter.
onNext() method passes emissions(one a time) up the chain as well as onComplete() to signal completion and communicate that there will be no more items

Observable factories
Observable.create(), Observable.just(), and Observable.fromIterable()
Observable.range()
Observable.interval()
Observable.future() - RxJava Observables are much more robust and expressive than Futures, but if you have existing libraries that Yield Futures, you can easily turn them into Observables via Observable.future()/Observable.fromFuture()

Observable.empty() - is sometimes helpful to create an Observable that emits nothing and calls onComplete() - CONCEPT OF NULL
Observable.never() - The only difference between them is that it never calls onComplete(), forever leaving observers waiting for emissions but never actually giving any



Observable.error() - This too is something you likely will only do with testing, but you can create an Observable that immediately calls onError() with a specified exception


Observable.defer() -  is a powerful factory due to its ability to create a separate state for each Observer; To remedy this problem of Observable sources not capturing state changes, you can create a fresh Observable for each subscription.


Observable.fromCallable() - The error was emitted to the Observer rather than being thrown where it occurred. If initializing your emission has a likelihood of throwing an error, you should use Observable.fromCallable() instead of Observable.just().

Single<T> - is essentially an Observable<T> that will only emit one item. It works just like an Observable, but it is limited only to operators that make sense for a single emission.

Maybe - A given Maybe<T> will only emit 0 or  1 emissions. It will pass the possible emission to onSuccess(), and in either case, it will call onComplete() when done