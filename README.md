Tinkering with NullAway and Bazel.

Use Bazel 9.3.1 (the version in `.bazelversion`, selected automatically by Bazelisk).
The build downloads its Java toolchain and Maven dependencies; a local JDK is not required.
Java sources target Java 11.

Build the main example, or all targets:

```sh
bazel build //:ProjectRunner
bazel build //...
```

Run the unit tests:

```sh
bazel test //...
```

`GreetingTest` checks that `sayHi()` prints its greeting and that `testMap()` produces no output with its empty map.

The intentional null dereference in `Greeting.java` is commented out so builds and tests pass. Uncomment it to see this NullAway error:

```text
error: [NullAway] dereferenced expression 'x' is @Nullable
        Object x = null; x.hashCode();
                          ^
```

The `greeter` library enables NullAway as an Error Prone plugin; other Error Prone checks are disabled to focus this example on nullness. Both runner targets and the unit tests depend on this library.

Bazel rebuilds changed inputs automatically. To force a clean rebuild:

```sh
bazel clean
bazel build //...
```
