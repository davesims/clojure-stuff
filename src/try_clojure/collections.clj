(def coll [1 2 3 4])
(seq coll)
(println (cons coll '(a b c)))
(def a-range (range 1 4))
(rest a-range)
(filter even? (take 30 (iterate #(* 2 %) 2)))
(into #{} "fubarbar")
(some {2 :b 3 :c} [1 nil 3])

; destructuring

(def stuff [7 8 9 10 11]) ;=> #'user/stuff
(let [[a & others] stuff]
  (println a)
  (println others))
  
(def fibs
  (map first
       (iterate (fn [[a b]] [b (+ a b)])
                [0 1])))
                
(reduce + (take 50 fibs))


(def primes
  (letfn [(next-prime [known-primes n]
            (lazy-seq
             (if (some #(zero? (rem n %)) known-primes)
               (next-prime known-primes (inc n))
               (cons n (next-prime (conj known-primes n) (inc n))))))]
    (next-prime [] 2)))
    
(reduce + (take 50 (drop-while #(< % 100)  primes)))

(def letters (map char (range (int \A) (+ 1 (int \Z)))))

(def rot-letters(take 26 (drop 13 (cycle letters))))

(defn rotate [coll n] (take (count coll) (drop n (cycle coll))))

(rotate [1 2 3 4 5 6 7 8 9] 3)  

(doseq [n (range 3)]
  (println n))
  
(dotimes [i 5]
  (println i))
  
(doseq [l rot-letters]
  (println l))