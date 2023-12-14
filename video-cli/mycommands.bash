#!/bin/bash
./gradlew run --args="add-tag 'happy'"
./gradlew run --args="add-user 'Yaseen'"
./gradlew run --args="add-tag 'sad'"
./gradlew run --args="add-user 'Fred'"
./gradlew run --args="post-video 'myvideo' 4 1"
./gradlew run --args="add-video-watcher 5 2"
./gradlew run --args="add-video-watcher 5 4"
./gradlew run --args="add-video-hashtag 5 3"