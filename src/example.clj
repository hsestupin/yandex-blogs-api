(ns user
  [:require [yandex-blogs :as yb]])

(def f (yb/get {:text "Менделеев" :age-from 13}))


