(ns day01
  (:require [clojure.string :as string]))

(println "dadfa")

(comment
  (println "Day 1"))

(comment
  (let [data (->>
              (slurp "inputs/day01.txt")
              (string/split-lines)
              (map #(string/split % #"   "))
              (map #(map read-string %)))
        left (sort (map first data))
        right (sort (map second data))
        result (reduce + (map (fn [l r] (abs (- l r))) left right))]
    (println "First star " result)
    ))

(comment
  (let [data (->>
              (slurp "inputs/day01.txt")
              (string/split-lines)
              (map #(string/split % #"   "))
              (map #(map read-string %)))
        left (map first data)
        right_frequencies (frequencies (map second data))
        left_multiplied (map #(* % (get right_frequencies % 0)) left)
        result (reduce + left_multiplied)]
    (println "Second star " result)
    ))
