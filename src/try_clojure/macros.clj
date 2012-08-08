(use '[clojure.pprint :only (pprint)])

(defmacro just-do-it [& body] 
  `(do ~@body)
)
  
(just-do-it (println "HEY") (println "WHAT"))



(defmacro execute [& expression] 
  (println `(~@expression))
  `(do ~@expression)
)

(execute (println "THIS IS AN EXPRESION"))

(defmacro execute-pp [& expression] 
  (pprint `(~@expression))
  (pprint `(do ~@expression))
)

(execute-pp (println "THIS IS AN EXPRESION"))



(defmacro execute-catch [& body]
  (try
     `(do ~@body)
     (catch Throwable e# (println (str "caught exception: " (.getMessage e#))))))


(execute-catch (doto (java.lang.Exception.) (throw)))


