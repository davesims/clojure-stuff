(def types {:rock :scissors :paper :rock :scissors :paper})

(defn dominates [type] (types type))

(defn winner [p1 p2]
  (cond
    (= p1 p2) nil
    (= (types p1) p2) p1
    :else p2)
)

(defn draw? [p1 p2] 
  (= (winner p1 p2) nil)
)

(defn iwon? [p1 p2]
  (= (winner(p1 p2) p1))
)


; (println (winner :rock :scissors))
; (println (winner :rock :paper))
; (println (winner :paper :scissors))
; (println (winner :rock :rock))
; (println (winner :scissors :scissors))
; 
; (println (draw? :rock :rock))
; (println (draw? :scissors :scissors))
; (println (draw? :paper :paper))
; (println (draw? :rock :paper))

(println (iwon? :rock :scissors))
(println (iwon? :rock :paper))
(println (iwon? :paper :scissors))
(println (iwon? :rock :rock))
(println (iwon? :scissors :scissors))