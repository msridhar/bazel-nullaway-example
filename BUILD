load("@rules_java//java:defs.bzl", "java_binary", "java_library", "java_plugin")

package(default_visibility = ["//visibility:public"])

java_plugin(
    name = "nullaway_plugin",
    deps = [
        "@maven//:com_uber_nullaway_nullaway",
    ],
)

java_library(
    name = "greeter",
    srcs = ["src/main/java/com/example/Greeting.java"],
    javacopts = [
        "-XepDisableAllChecks",
        "-Xep:NullAway:ERROR",
        "-XepOpt:NullAway:AnnotatedPackages=com.example",
    ],
    plugins = [":nullaway_plugin"],
)

java_binary(
    name = "ProjectRunner",
    srcs = ["src/main/java/com/example/ProjectRunner.java"],
    main_class = "com.example.ProjectRunner",
    deps = [":greeter"],
)
