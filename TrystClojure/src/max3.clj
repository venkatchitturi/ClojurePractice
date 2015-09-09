(ns max3)
(defn max2 [a b]
  (if (> a b) a b))

(defn max3 [a b c]
  (max2 (max2 a b) c))
  