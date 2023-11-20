# Simple Word Counter App

### Java version: 17

## To build

Windows:\
./gradlew.bat clean build\
Unix:\
./gradlew clean build

## To run

java -cp lib/build/classes/java/main com.wordcounter.Main _path-to-text-file_

## To run tests

Windows:\
./gradlew.bat clean test\
Unix:\
./gradlew clean test

## To archive

./gradlew.bat jar (Windows)\
or\
./gradlew jar (Unix)

Archive will be found in build/libs/ directory as lib.jar\
run it with: java -jar lib.jar _path-to-text-file_
