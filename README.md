# Karate_TryOuts
Example project either to demo or to confirm a bug

## Steps to integrate the project and run successfully for the first time
1) after cloning the project, set java version as 11
2) build the project using the command >gradle clean build
3) the example feature is located in "src/test/java/demo/example/05_matching_date.feature"

## Commands to run the test
...
gradlew test -Dkarate.env=dev
...

#### test results failed though today's date "2021-10-23" is in the list

{
match failed: CONTAINS_ANY
$ | actual does not contain expected | actual array does not contain any of the expected items (LIST:STRING)
["TEST1019005-2021-10-19T18:19:41.271055Z-PROCESSING-2","TEST1019005-2021-10-19T18:19:41.271055Z-PROCESSING-1","TEST1019002-2021-10-23T14:50:16.810678Z-PROCESSING-2","TEST1019002-2021-10-24T14:50:16.810678Z-PROCESSING-1","TEST1019002-2021-10-25T14:50:16.810678Z-PROCESSING-0","777777-2021-10-28T09:24:33.064845Z-PROCESSING-2","777777-2021-10-30T08:23:10.213230Z-PROCESSING-1","777777-2021-10-19T08:23:10.213230Z-PROCESSING-0","TEST1018001-2021-10-18T16:31:32.643392Z-PROCESSING-0","TEST1013001-2021-10-13T15:13:59.974540Z-PROCESSING-0","777777-2021-10-21T14:17:45.727585Z-PROCESSING-2","Test01-2021-10-11T20:20:05.968159Z-PROCESSING-1","Test01-2021-10-01T20:20:05.968159Z-PROCESSING-0","333333333-2021-10-11T20:11:26.474697Z-PROCESSING-0","333333333-2021-10-08T21:43:28.251925Z-PROCESSING-0","232623234-2021-10-08T21:27:04.363014Z-PROCESSING-0"]
'2021-10-23'
}


    $[2] | not equal (STRING:STRING)
    'TEST1019002-2021-10-23T14:50:16.810678Z-PROCESSING-2'
    '2021-10-23'
