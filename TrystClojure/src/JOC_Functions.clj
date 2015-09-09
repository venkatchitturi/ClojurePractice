(ns JOC_Functions)
(map ["hello" 4 "brllo" \a "venkat"] #{0 2}) ;; apply the vector as a function to each of the set elements i.e 0 and 2
(comp first)
(def figureout (comp first rest rest))
(figureout [1 2 3 4 5]) ;; comp works by applying the last rest first and would apply from right to left



(defn fnth [n]
  (apply comp [(fn [ser]
                 (reduce * n ser)) rest rest]))

;; (apply fn [a b c d]) euivalent to (fn a b c d)

((partial + 5) 100 200)
(#(apply + 5 %&) 100 200)

;; Higher order functions
