Suppressing Operators

- work by not calling the onNext() function downstream for a disqualified emission, and therefore does not go down the chain to Observer

31 - filter()
32 - take()/takeLast()
33 - skip()
34 - takeWhile() and skipWhile() | takeUntil() and skipUntil()
35 - distinct()
36 - distinctUntilChanged()
37 - elementAt()