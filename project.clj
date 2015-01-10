(defproject proto "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [com.google.protobuf/protobuf-java "2.5.0"]
                 [org.flatland/protobuf "0.7.1"]]
  ;; :resource-paths ["lib/protobuf-java-2.5.0.jar" "resources"]
  :resource-paths ["resources"]
  :java-source-paths ["src/java" "test/java"])
