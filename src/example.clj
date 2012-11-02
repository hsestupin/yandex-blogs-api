(ns user
  [:require [yandex-blogs :as yb]])

(println (yb/get {:text "Менделеев" :age-from 13}))
;(println (get {:text "Менделеев" :age-from 13}))


