# Scala

**Scala** is a high-level, general purpose language. It runs on the JVM so it is interoperable with Java (and vice versa). One of its main uses is for data processing. Apache Spark was written in Scala and is often used to interface with Spark.

## File Extension

`.scala`

## Build and Execute the Project

```bash
cd <path/to/file>
scala run <filename>.scala
```

## configit.sh

This repository's *devcontainer.json* uses a `postCreateCommand` to run `configit.sh`.

This script uses information particular to the user of the repository.

```shell
#!/bin/bash

git config --global user.email "yourEmail@mail.com"
git config --global user.name "yourGitUserName"
git config --global push.autoSetupRemote true
git config --global push.default current
git config --global init.defaultBranch main
git config --global --add safe.directory $1
```
