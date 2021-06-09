(ns actions-setup.core
  (:gen-class)
  (:require
     [clojure.core]))

(def unused-def [1 2 3])

(defn tested-and-useful
  "used function with tests"
  [arg]
  (+ 2 arg)
)

(defn tested-and-not-useful
  "not used function with tests"
  [arg]
  (- 2 arg)
)

(defn not-tested-and-useful
  "used function with no tests"
  [arg]
  (* 2 arg)
)

(defn -main
  "Entry point."
  [& args]
  (println "Hello, World!")
  (println (str (tested-and-useful 10) " " (not-tested-and-useful 10))))