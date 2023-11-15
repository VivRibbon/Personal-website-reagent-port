(ns starter.browser
  (:require [reagent.dom :as rd]
            [reagent.core :as r]
            [starter.pages :as p]
            [starter.blog :as b]
            [starter.elit :as e]
            [reagent.ratom :as ratom]))


(def expanded (r/atom 0))

(defn expandable-view []
 [:div.expandable
  (cond
    (= @expanded 0)
    [:div.body [p/home-page]]
    (= @expanded 1)
    [:div.body [e/elit-curation]]
    (= @expanded 2)
    [:div.body [b/blog]]
    (= @expanded 3)
    [:div.body [p/poetry-games-text]]
    (= @expanded 4)
    [:div.body [p/programming]]
    (= @expanded 5)
    [:div.body [p/music]]
    (= @expanded 6)
    [:div.body [p/about]])])



(defn- nav-button [index txt]
  [:button.nav-button {:on-click #(reset! expanded index)} txt])

(defn- header []
  [:header [:div.hero-header [:h1.title {:on-click #(reset! expanded 0)} "Moira Oona Campbell"]
            [:sup "Fine and sundry textual objects and more."]]
   [:p]
   [:nav
    [:div
     [nav-button 1 "E-lit Curation"]
     [nav-button 2 "Blog"]
     [nav-button 3 "Poetry, Writing, Analogue Games"]]
    [:div
     [nav-button 4 "Programming and Video Games"]
     [nav-button 5 "Music"]
     [nav-button 6 "About"]]]])


(defn- main-body []
  [:<>
   [expandable-view]])

(defn- full-page []
  [:div.full-page [header]
   [main-body]])


;; start is called by init and after code reloading finishes
(defn ^:dev/after-load start []
  (rd/render [full-page] (js/document.getElementById "app")))

(defn init []
  ;; init is called ONCE when the page loads
  ;; this is called in the index.html and must be exported
  ;; so it is available even in :advanced release builds
  (js/console.log "init")
  (start))

;; this is called before any code is reloaded
(defn ^:dev/before-load stop []
  (js/console.log "stop"))
