(ns reflechant.aoc2024.day01.part1
  (:require [clojure.string :as str]))

(defn parse-input [s]
  (->> s
       str/split-lines
       (map #(str/split % #"\s+"))
       (map #(map parse-long %))
       ;; "transpose" input
       (apply map vector)))

(defn list-distance [s]
  (->> s
       parse-input
       ;; sort the lists
       (map sort)
       ;; calculate distances
       (apply map -)
       ;; take distances absolute values
       (map abs)
       (reduce +)))

(comment
  (list-distance "2   3
4 5")
  ;; => 2
  (apply map vector [[2 3] [4 5] [78 52]])
  ;; => ([2 4 78] [3 5 52])

  ;; the actual puzzle input
  (list-distance (slurp "resources/day01-1.txt"))
  ;; => 1320851
  :rcf)
