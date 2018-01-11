### Reactive Java or RxJava

 

-   it is an implementation and enhancement of the **Observer Pattern**

-   the key addition to the Observer Pattern is the ability to determine when
    event processing is complete or an error has occured

-   intended for use in **event driven** schemes where nesting synchronous or
    asynchronous callback methods becomes overly complex

-   **abstracts** some of the more complex tasks associated with asynchronous
    **operations including threading and concurrency**

 

The primary components are **Observable/Flowable**, **Subscriber** and
**operators**.

**Observable** - collects and emits actions to a Subscriber who will perform an
operation on the emitted items

**Subscriber** - performs operations on the emitted items;

**Operators** - provide a way to manipulate the data that is emitted by an
Observable before it is sent to the Subscriber for action

 

flowable\~=observable

**Flowable** will define a back pressure where an observable will not. The back
pressure setting will define how downstream consumers handle emitted data

 

 

 
