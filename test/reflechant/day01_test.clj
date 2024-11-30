(ns day01-test
  (:require [clojure.test :refer :all]
            [reflechant.aoc2024.day01.part1 :as part1]
            [reflechant.aoc2024.day01.part2 :as part2]))

(deftest a-test
  (testing "part1 example input"
    (is (= 11 (part1/list-distance "3   4
4   3
2   5
1   3
3   9
3   3"))))

  (testing "part2 example input"
    (is (= 31 (part2/similarity-score "3   4
4   3
2   5
1   3
3   9
3   3")))))
