(defn patient []
  (atom {:arms 2
         :legs 2
         :heads 1}))
         
(defn init-patients []
 (vec (repeatedly 1000 patient)))

(defn surgeon [specialty] 
 {:specialty specialty})
 
(defn init-surgeons []
 (vec (take 100 (map surgeon (cycle [:arms :legs :heads])))))
 
(def all-patients nil)
(def all-surgeons nil)

(defn init! []
 (alter-var-root #'all-patients (constantly (init-patients)))
 (alter-var-root #'all-surgeons (constantly (init-surgeons))))
 
(defn totals []
 (reduce (partial merge-with +)
         (map deref all-patients)))

(init!)
        
(first all-surgeons)
(last all-patients)
(first all-patients)


(let [p (first all-patients)]
  (println p)
)

(defn transplant! [surgeon p1 p2] 
  (swap! update-in p1 [(surgeon :specialty)] inc)
  (swap! update-in p2 [(surgeon :specialty)] dec))

; (transplant! (surgeon :arms) (patient) (patient))

; (let [s (surgeon :arms) p1 (patient) p2 (patient) ] 
;   (transplant! s p1 p2)
; )