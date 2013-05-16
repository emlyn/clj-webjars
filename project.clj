(defproject clj-webjars "0.9.0-SNAPSHOT"
  :description "A clojure helper library for webjars"
  :url "http://github.com/jeluard/clj-webjars"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :sub ["ring"]
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.webjars/webjars-locator "0.4-SNAPSHOT"]
                 [ring/ring-core "1.2.0-beta1"]]
  :plugins [[lein-sub "0.2.4"]])
