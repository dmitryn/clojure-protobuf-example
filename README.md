# proto

Example project using google protocol buffers

## Usage

Generate .java file from .proto file with:

```
$ protoc --version
libprotoc 2.5.0
$ protoc --java_out=src/java/ resources/proto/realtime-bidding.proto --proto_path=resources/proto
```
Run project and see compilation errors:
```
$ lein run -m proto.core
```

To make it work you should do:
```
 $ cp ~/.m2/repository/com/google/protobuf/protobuf-java/2.5.0/protobuf-java-2.5.0.jar lib/
```
and then un-comment `resource-paths` in project.clj.

Another way to compile java files is to put protobuf-java into classpath:
```
javac -d target/classes -cp ~/.m2/repository/com/google/protobuf/protobuf-java/2.5.0/protobuf-java-2.5.0.jar src/java/RealtimeBidding.java
```
After that you get:
```
$ lein run -m proto.core                                                                                                                    
Exception in thread "main" java.lang.VerifyError: class RealtimeBidding$BidRequest overrides final method getUnknownFields.()Lcom/google/protobuf/UnknownFieldSet;, compiling:(proto/core.clj:1:1)

```


## License

Copyright © 2015

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
