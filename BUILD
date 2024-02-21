load("@rules_java//java:defs.bzl", "java_binary")

package(default_visibility = ["//visibility:public"])

java_plugin(
    name = "nullaway_plugin",
    deps = [
        "@maven//:com_uber_nullaway_nullaway",  # This should be the label of the NullAway artifact fetched via maven_install
    ],
)

java_binary(
    name = "ProjectRunner",
    srcs = glob(["src/main/java/com/example/*.java"]),
    javacopts = [
        "-Xep:NullAway:ERROR",
        "-XepOpt:NullAway:AnnotatedPackages=com.example",
        "--release", "11", "-source", "11", "-target", "11",
    ],
    plugins = [":nullaway_plugin"],
)
