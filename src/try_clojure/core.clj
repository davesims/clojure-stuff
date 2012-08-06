(ns try-clojure.core)
; This is Clojure code.
; When a set is used as a function, it returns a boolean
; that indicates whether the argument is in the set.
(def vowel? (set "aeiou"))

(defn pig-latin [word] ; defines a function
  ; word is expected to be a string
  ; which can be treated like a sequence of characters.
  (let [first-letter (first word)] ; assigns a local binding
    (if (vowel? first-letter)
      (str word "ay") ; then part of if
      (str (subs word 1) first-letter "ay")))) ; else part of if

(println (pig-latin "red"))
(println (pig-latin "orange"))

(def x -2N)

(if (> x 0)
  (println "hey")
  (println "what"))
  
(println (* x x x))
(println "fu \n bar")

:stuff-like-this

(if :this-is-a-keyword
  (println "true")
  (println "false"))
  
(println(max 2 3 4 5 1000000))

(println +)

; this is a map
(def m {:fu "bar", :hey "what"})
(:fu m)

; this is a list
(:hey m)(def a [ 1 2 3 4])
(nth a 0)

; this is a list
(def l '(this is a linked "thing"))
(nth l 3)

; this is a set
(def s #{ :red :green :blue })


(with-meta [1 2 3] {:example true})


((fn [message] (print message)) "hey")
(defn blah [message] (print message))
(blah "bar")

((fn [stuff] (print stuff)) ((fn [other] other) "blah"))

(defn messenger 
  ([] (messenger "default"))
  ([msg] (print msg)))
  
(messenger)
(messenger "OTHER STUFF")

(defn messenger [greeting & who]
  (print greeting (first who)))

(messenger "Hello" "world" "class" "ignored")

(fn [a b] (+ a b))
(defn blah [a] print a)
(blah "hey")

(defn fu ([] (println "FU!")) ([bar] (println bar)))
(fu)
(fu "BAR")

(defn more-stuff [arg & stuff] (println stuff))

(more-stuff "more")
(more-stuff "more" "and" "more")

(defn bad [a b] (def x (+ a b)) x)
(bad 9879879879 987987)
println x

; this is a local binding using let
(let [a 78] (+ a a))

(let [a 12 b 31 c 43] (+ a b c))

(def args [1 2 3 4])
(apply + args)

(defn boo [arg1] (fn [arg2] (println arg1 arg2)))

(def whoop (boo "whee"))

(whoop "whooop")

(#(+ %1 %2 %3)  2 3 4)

(require 'clojure.set)
(require '[clojure.set :as s])

s/union

{}                  ;=> the empty map
{:a 1 :b 2}         ;=> {:a 1 :b 2}
(:a {:a 1 :b 2})    ;=> 1
({:a 1 :b 2} :a)    ;=> 1
(assoc {:a 1} :b 2) ;=> {:a 1 :b 2}
(dissoc {:a 1} :a)  ;=> {}
(conj {} [:a 1])    ;=> {:a 1}


#{}                  ;=> the empty set
#{:a :b}             ;=> #{:a :b}
(#{:a :b} :a)        ;=> :a
(conj #{} :a)        ;=> #{:a}
(contains? #{:a} :a) ;=> true









