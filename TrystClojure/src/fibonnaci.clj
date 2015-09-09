(ns fibonnaci)
(defn fibonnaci [series n]
  (if (<= n 1) [0]  
  (if (> n 2)
    (let [a (series (- (count series) 2)) b (peek series)] ;; used peek instead of last as it is faster         
      (recur (conj series (+ a b)) (dec n))
      )
    series)))

(fibonnaci [0 1] 7)