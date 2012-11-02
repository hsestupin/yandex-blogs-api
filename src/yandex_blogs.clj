(ns yandex-blogs
  (:require
    [feedparser-clj.core :as fp]
    [clj-http.client :as http])
  (:refer-clojure :exclude (get)))

(defn make-uri
  [params]
  (str "http://blogs.yandex.ru/search.rss?" (http/generate-query-string params)))

(defn get
  "Executes the HTTP GET request to the yandex-blogs API corresponding
  to the given map and returns the result map representing response.
  See more info about parameters at http://api.yandex.ru/blogs/doc/search/concepts/get-parameters.xml"
  [params]
  (fp/parse-feed (make-uri params)))


