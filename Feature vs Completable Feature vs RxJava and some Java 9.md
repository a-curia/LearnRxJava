**Futures vs Completable Futures vs RxJava**
--------------------------------------------

 

**Futures** were introduced in Java 5 (2004). They are objects that promise to
hold the result of an operation once that operation completes. For example when
a task (i.e
[Runnable](https://docs.oracle.com/javase/8/docs/api/java/lang/Runnable.html) or
[Callable](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/Callable.html))
is submitted to an executor. The caller can use the future object to check
whether the operation **isDone()**, or **wait for it to finish using**
**get()**.

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
/**
* A task that sleeps for a second, then returns 1
**/
public static class MyCallable implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        Thread.sleep(1000);
        return 1;
    }

}

public static void main(String[] args) throws Exception{
    ExecutorService exec = Executors.newSingleThreadExecutor();
    Future<Integer> f = exec.submit(new MyCallable());

    System.out.println(f.isDone()); //False

    System.out.println(f.get()); //Waits until the task is done, then prints 1
}
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

 

**CompletableFutures** were introduced in Java 8 (2014). Completable Futures are
in fact an evolution of regular Futures, inspired by Google's **Listenable
Futures**, part of the **Guava** libary. They are Futures that also allow you to
string tasks together in a chain. You can use them to tell some worker thread to
"go do some task X, and when you're done, go do this other thing using the
result of X". Here's a simple example:

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
/**
* A supplier that sleeps for a second, and then returns one
**/
public static class MySupplier implements Supplier<Integer> {

    @Override
    public Integer get() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            //Do nothing
        }
        return 1;
    }
}

/**
* A (pure) function that adds one to a given Integer
**/
public static class PlusOne implements Function<Integer, Integer> {

    @Override
    public Integer apply(Integer x) {
        return x + 1;
    }
}

public static void main(String[] args) throws Exception {
    ExecutorService exec = Executors.newSingleThreadExecutor();
    CompletableFuture<Integer> f = CompletableFuture.supplyAsync(new MySupplier(), exec);
    System.out.println(f.isDone()); // False
    CompletableFuture<Integer> f2 = f.thenApply(new PlusOne());
    System.out.println(f2.get()); // Waits until the "calculation" is done, then prints 2
}
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

 

 

**RxJava** is whole library for **reactive programming** created by Netflix. At
a glance, it will appear to be similar to **Java 8's streams**. It is, except
it's much more powerful.

Similarly to Futures, RxJava can be used to string together a bunch of
synchronous or asynchronous actions to produce one or more meaningful results.
However unlike Futures, which are single-use, RxJava works on *streams* of zero
or more items including never-ending streams with an infinite number of items.
It's also much more flexible and fluent thanks to an unbelievably rich **set of
operators**

Also, unlike Java 8's streams, RxJava has a
[backpressure](http://reactivex.io/documentation/operators/backpressure.html)
mechanism, which allows it to handle cases in which different parts of your
processing stream operate in different threads, at different rates.

The downside of Rx is that despite the pretty good documentation, it's a
challenging library to learn due to the paradigm shift involved. Rx code can
also be a nightmare to debug, especially if multiple threads are involved, and
even worse - if back-pressure is needed.

**Advantages**:

-   Statelss !!! (important thing to mention, most important maybe)

    -   Thread management out of the box

    -   Build sequences that have their own lifecycle

    -   Everything are observables so chaining is easy

    -   Less code to write

    -   Single jar on classpath (very lightweight)

    -   Highly concurrent

    -   No callback hell anymore

    -   Subscriber based (tight contract between consumer and producer)

    -   Backpressure strategies (circuit breaker a like)

    -   Splendid error handling and recovering

    -   Very nice documentation (marbles \<3)

    -   Complete control

    -   Many more ...

    **Disadvantages**: - Hard to test

 

 

**Java 9's Reactive Streams** aka **Flow API** are a set of Interfaces
implemented by various **reactive streams** libraries such as **RxJava 2**,
**Akka Streams**, and **Vertx**. They allow these reactive libraries to
interconnect, while preserving the all important back-pressure.

 

 

 

 

 

 

 

 

 

 

 

 
