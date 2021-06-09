(ns actions-setup.core-test
  (:require [clojure.test :refer :all]
            [actions-setup.core :refer :all]))

(deftest always-test
  (testing "Hey, I always pass."
    (is (= 2 (+ 1 1 ))))) 

(deftest useful-test
  (testing "Hey, I always pass."
    (is (= 12 (tested-and-useful 10 )))))
	
(deftest not-useful-test
  (testing "Hey, I always pass."
    (is (= -8 (tested-and-not-useful 10 )))))