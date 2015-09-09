(ns TrystClojure)

(def matrix1
  [[1 2 3]
   [4 5 6]
   [7 8 9]])

(def matrix2
  [[1 22 33]
   [4 55 6]
   [7 8 9]])


(defn getmatresultitem [row,col]
  (reduce +
          (for [i (range 3)]
            (* (get-in matrix1 [row i]) (get-in matrix2 [i col])))))


(defn getresult []
  (for [row (range 3)]
    (vec (for [col (range 3)]
           (getmatresultitem row col)))))
