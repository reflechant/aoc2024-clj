(ns reflechant.aoc2024.day01.part2
  (:require [reflechant.aoc2024.day01.part1 :as part1]))

(defn similarity-score [s]
  (let [[left right] (part1/parse-input s)
        freq (frequencies right)]
    (->> left
         (map #(vector % (get freq %)))
         (filter #(some? (second %)))
         (map (partial reduce *))
         (reduce +))))

(comment
  (similarity-score "3   4
4   3
2   5
1   3
3   9
3   3")
  ;; => 31

  ;; part2 puzzle input
  (similarity-score (slurp "resources/day01-1.txt"))
  ;; => 26859182
  :rcf)
