(ns yandex-blogs.core)

(defn request
  [{:keys [request-method method scheme server-name server-port uri query-string
           headers body socket-timeout conn-timeout multipart debug debug-body
           insecure? save-request? proxy-host proxy-port as cookie-store
           retry-handler response-interceptor digest-auth
           client-params] :as req}]
  (println "keys = " keys )
  (println "method = " method )
  (println "as = " as )
  (println "req = " req ))

(yandex-blogs.core/request (merge {:query-params {"q" "foo, bar"}} {:method :get :url "http://site.com/search"}))

