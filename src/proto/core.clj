(ns proto.core
  (:gen-class)
  (:import [proto RealtimeBidding$BidRequest RealtimeBidding$BidResponse])
  (:require [flatland.protobuf.core :as proto]))

(defn -main [& args]
  (println "Hello, World!"))
