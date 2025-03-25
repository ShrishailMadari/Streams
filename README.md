Streams API:
  Streams, Parallel Streams,
Collectors API:

* Here’s a list of Java 8 Stream intermediate and terminal functions with their respective parameters and functional interfaces:

* Intermediate Operations (Return a Stream): 

1. filter(Predicate<T> predicate)

Accepts a Predicate<T> (functional interface with method boolean test(T t))

Filters elements based on a condition.



2. map(Function<T, R> mapper)

Accepts a Function<T, R> (method R apply(T t))

Transforms elements from type T to type R.



3. flatMap(Function<T, Stream<R>> mapper)

Accepts a Function<T, Stream<R>>

Flattens nested streams into a single stream.



4. distinct()

No parameters

Removes duplicate elements based on equals().



5. sorted()

No parameters

Sorts elements in natural order.



6. sorted(Comparator<T> comparator)

Accepts a Comparator<T> (method int compare(T o1, T o2))

Sorts elements based on a custom comparator.



7. peek(Consumer<T> action)

Accepts a Consumer<T> (method void accept(T t))

Used for debugging by performing an action on elements.



8. limit(long maxSize)

Accepts a long

Limits the number of elements in the stream.



9. skip(long n)

Accepts a long

Skips the first n elements.


* Terminal Operations (Return a non-stream result):

1. forEach(Consumer<T> action)

Accepts a Consumer<T>

Performs an action for each element.



2. forEachOrdered(Consumer<T> action)

Accepts a Consumer<T>

Processes elements in encounter order.



3. toArray()

No parameters

Collects elements into an array.



4. toArray(IntFunction<A[]> generator)

Accepts an IntFunction<A[]> (method A[] apply(int size))

Collects elements into a specific array type.



5. reduce(BinaryOperator<T> accumulator)

Accepts a BinaryOperator<T> (method T apply(T t1, T t2))

Performs a reduction on elements.



6. reduce(T identity, BinaryOperator<T> accumulator)

Accepts an initial value and a BinaryOperator<T>

Reduces elements to a single value with an identity.



7. reduce(U identity, BiFunction<U, ? super T, U> accumulator, BinaryOperator<U> combiner)

Accepts an identity, a BiFunction<U, T, U> (method U apply(U u, T t)) and a BinaryOperator<U>

Used in parallel streams.



8. collect(Collector<T, A, R> collector)

Accepts a Collector<T, A, R>

Collects elements into a collection.



9. collect(Supplier<R> supplier, BiConsumer<R, ? super T> accumulator, BiConsumer<R, R> combiner)

Accepts a Supplier<R>, BiConsumer<R, T>, and BiConsumer<R, R>

Custom mutable reduction.



10. min(Comparator<T> comparator)

Accepts a Comparator<T>

Finds the smallest element.



11. max(Comparator<T> comparator)

Accepts a Comparator<T>

Finds the largest element.



12. count()

No parameters

Returns the number of elements.



13. anyMatch(Predicate<T> predicate)

Accepts a Predicate<T>

Returns true if any element matches.



14. allMatch(Predicate<T> predicate)

Accepts a Predicate<T>

Returns true if all elements match.



15. noneMatch(Predicate<T> predicate)

Accepts a Predicate<T>

Returns true if no elements match.



16. findFirst()

No parameters

Returns the first element in the stream.



17. findAny()

No parameters

Returns any element (useful in parallel streams).




This covers all intermediate and terminal functions with their functional interfaces. Let me know if you need more details!
