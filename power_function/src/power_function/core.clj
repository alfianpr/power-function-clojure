(ns power-function.core
  (:gen-class))

(defn exp [x n]
  (let [square (fn [x] (* x x))]
    (cond (zero? n) 1
          (even? n) (square (exp x (/ n 2)))
          :else (* x (exp x (dec n))))))

;;; Test the function

(exp 2 3)