(ns sumcollection)
(defn accum [collection sum]
  (if (seq collection)
    (recur (rest collection) (+ sum (first collection)))
    sum))

(accum [3 4 5 5 6 7 8] 0)