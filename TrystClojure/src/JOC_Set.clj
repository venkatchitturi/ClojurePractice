(ns JOC_Set
  (:require clojure.set))
(#{1 2 3 4} 3)
(#{1 2 3 4} 7) ;; returns nil
(some #{:a} [:c :a])
(sorted-set 2 3 1)

(clojure.set/union #{1 2} #{3 4})
(clojure.set/intersection #{1 2 3 4} #{6 5 3 4 2})
(clojure.set/difference #{1 2 4 5 6} #{3 4 7 8 9}) ;; unlike math diff this evaluates to only the items which differ in the first set
