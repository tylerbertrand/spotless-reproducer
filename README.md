# Spotless Configuration Cache Issue Reproducer

## Steps to Reproduce

1. `./gradlew --rerun-tasks build`

Running this command a second time will result in a successful configuration cache write.
The only way I have found to reliably reproduce this across multiple runs is to change spotless versions and re-run the task.

1. Change spotless version in `lib/build.gradle.kts`, i.e. from `6.20.0` to `6.19.0`
2. Re-run `./gradlew --rerun-tasks build`
