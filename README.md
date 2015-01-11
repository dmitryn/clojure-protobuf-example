# proto

Example project using google protocol buffers

## Usage

Install protoc 2.6.1.

Generate .java file from .proto file with:

```
$ protoc --version
libprotoc 2.6.1
$ protoc --java_out=src/java/ resources/proto/realtime-bidding.proto --proto_path=resources/proto
```
Run project:
```
$ lein run -m proto.core
```



## License

Copyright © 2015

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
