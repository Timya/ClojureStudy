(ns test-sublime-text.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(defn print_string [& args]
  (str "last" args "first"))

(def person {:name "Sandra Cruz"
             :city "ChengDu"})

; 另外一种格式
(def pizza  {:name "Sandra Cruz"
             :location "ChengDu"
             ::location "Bejing"})

; regex 
(re-seq #"timya|test" "timya1 test-sublime-text")

;; comment
(read-string "(+ 1 3 #_(* 2 2) 8)")
(first '(1,2,3))

;; quote macro
'(1 2)
(quote (1 2))



;; about fn
(defn indexable-word? [Word])
(filter (fn [w] (> (count w) 2)) (str/split "A fine Day"))