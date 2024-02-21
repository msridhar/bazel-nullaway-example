load("@rules_java//java:defs.bzl", "java_binary")

package(default_visibility = ["//visibility:public"])

java_plugin(
    name = "nullaway_plugin",
    deps = [
        "@maven//:com_uber_nullaway_nullaway",
    ],
)

java_binary(
    name = "ProjectRunner",
    srcs = glob(["src/main/java/com/example/*.java"]),
    javacopts = [
        "-Xep:NullAway:ERROR",
        "-XepOpt:NullAway:AnnotatedPackages=com.example",
        "--release", "11",
    ],
    plugins = [":nullaway_plugin"],
)
