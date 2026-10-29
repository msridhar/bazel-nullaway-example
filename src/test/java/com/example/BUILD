load("@rules_java//java:defs.bzl", "java_test")

java_test(
    name = "GreetingTest",
    size = "small",
    srcs = ["GreetingTest.java"],
    test_class = "com.example.GreetingTest",
    deps = [
        "//:greeter",
        "@maven//:junit_junit",
    ],
)
