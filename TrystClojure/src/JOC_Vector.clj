(ns JOC_Vector)
(vec (range 10))
(into [11 2 3] (range 10))
(into (vector-of :int) [\a \b \c]) ;;converts to int as the vector is of type int
;;index access
([1 2 3 4] 2) ;; here vector behaves as a function taking the index as argument. this would throw exception if index out of range
(get [1 2 3] 1) ;; this would return nil if index out of range 
(nth [1 2 3 5] 2) ;; this would throw exception if index out of range
;;
(seq [1 2 3])
(rseq [1 2 3])
(assoc [1 2 3] 2 "3 has been replaced")
(assoc [1 2 3] 3 "4 has been added. Special case where it works one beyond the index.")
;;(assoc [1 2 3] 4 "This won't work")
(replace {1 :a,2 :b} [1 2 33 4]) ;; uses assoc internally
(def matrix
  [[1 2 3]
   [4 5 6]
   [7 8 9]])
(get-in matrix [0 2])
(assoc-in matrix [0 2] "3 replaced")
(update-in matrix [0 2] inc) ;; you have to pass a function.here i am passing increment
(update-in matrix [0 2] * 2) ;; you have to pass a function.here i am passing mul with 1 argument and the other argument is from the coordinate [0 2]
;;treat vector as a stack
(conj [1 2] 3) ;; push
(pop [11 22 33 55]) ;; pop returns a new vector with top item removed
(peek [1 2 3]) ;; faster than using last on vector
(subvec [1 2 3 5 6 7 8 9] 1 4) ;; vector starts at index 1 and ends before index 4 i.e at 3

