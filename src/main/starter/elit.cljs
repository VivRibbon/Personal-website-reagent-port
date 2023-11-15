(ns starter.elit
  (:require [reagent.dom :as rd]
            [reagent.core :as r]))

(def elit-display (r/atom 0))

(defn elit-menu-button [index txt]
  [:button.blog-button {:on-click #(reset! elit-display index)} txt])

(defn elit-back-button []
  [:button.blog-back-button {:on-click #(reset! elit-display 0)} "Back"])

(defn elit-menu []
  [:div.elit
   [:p
    "I'm a poet, game-designer, and researcher and enthusiast of digital potry and electronic literature. As the 'scene' for these kinds of works is quite diffuse, I thought I would curate a list of digital textual works (broadly defined) which particularly resonate with me, much of which has been collected while working on my master's thesis. See the bottom of this page for links to some other places that curate or collect this kind of work."]
   [:h3 "Metadata"]
   [:ul.blog-menu
    [:li [elit-menu-button 1 "What is Electronic Literature??"]]
    [:li [elit-menu-button 2 "Bibliography"]]]
   [:h3 "Interactive Fiction"]
   [:sup.caption
    "Text-heavy works the reader interacts with, including Twine, parser games, and visual novels."]
   [:ul.blog-menu
    [:li
     [elit-menu-button 3 "furkle - SPY INTRIGUE (2015)"]]
    [:li
     [elit-menu-button 4
      "litrouke - Please Answer Carefully (2019)"]]]
   [:h3 "Kinetic Poetry and Words That Move"]
   [:sup.caption
    "Text works based on treating text as physical art objects that move and change."]
   [:ul.blog-menu
    [:li
     [elit-menu-button 5
      "Dobbs, Tarik read by Greathouse, Torrin A. - Poem Where Every Bird is a Drone (2022)"]]
    [:li
     [elit-menu-button 6
      "Mencia, Maria - Birds Singing Other Birds' Songs (2001)"]]]
   [:h3 "Combinatory Poetry and Text Generation"]
   [:sup.caption
    "Text art that uses algorithms or programs to collage, deconstruct, and generate text."]
   [:ul.blog-menu
    [:li
     [elit-menu-button 7
       "Gysin, Brion and Somerville, Ian - I Am That I Am (1960)"]]]
   [:h3 "Links"]
   [:sup.caption "Other places of interest"]
   [:ul.blog-menu
    [:li
     [:a.portfolio.links
      {:href "https://collection.eliterature.org/"}
      "The Electronic Literature Collection"]]
    [:li [:a.portfolio.links {:href "https://elmcip.net/"} "ELMCIP Knowledge Base"]]
    [:li
     [:a.portfolio.links
      {:href "https://writing.upenn.edu/epc/"}
      "Electronic Poetry Center"]]
    [:li [:a.portfolio.links {:href "https://iloveepoetry.org/"} "I ❤ E-Poetry"]]
    [:li [:a.portfolio.links {:href "https://rhizome.org/"} "Rhizome"]]]])

(defn what-is-elit []
  [:div.elit-post
   [:h4 "What the Heck is Electronic Literature???"]
   [:p
    "Electronic literature is the term I am using, adopted from various studies in the field (including my own), for the stuff I'm collecting on this site. It signifies two things: 1) that the works generally have a (loosely) textual focus, or fits as a continuance of literary traditions. 2) that I generally apply a perspective from literary studies while I'm talking about this stuff - that is, I'm interested in genre and form, materiality, the relationship between text and media, and so on."]
   [:p
    "I'll use the terms e-lit and digital poetics frequently, the distinction there is that e-lit refers to the work themselves while digital poetics is a poetics - that is, it's concerned with the theory and work of creation of these kinds of works."]
   [:p
    "Electronic literature is a super vague term, as things always are, especially online, and there's tons of overlap between every genre and Type of Thing online. Thus, while there's definitely electronic art I wouldn't count as e-lit, I have absolutely no interest in drawing strong borders on the kinds of things I include here."]
   [:p
    "Lastly I want to mention that the word 'literature' often implies a certain sense of prestige or canonicity. Neither of these are concepts I have much interest in with regards to art and it is not my intent in usage of the term."]])

(defn bibliography []
  [:div.elit-post
   [:h4 "Bibliography"]
   [:p
    "Here are books and pieces of writing particularly relevant to my approach here. See the links in the index for more."]
   [:ul [:li [:strong "Rettberg, Scott"] "- Electronic Literature (2018)"]]])

(defn spy-intrigue []
  [:div.elit-post[:h3
                  [:a.title.elitlink
                   {:href "https://ifdb.org/viewgame?id=zz6i7irfr70nvp7a"}
                   "SPY INTRIGUE"]]
   [:small "furkle, 2015, Twine"]
   [:br]
   [:img.border
    {:src "media/spy_intrigue.png"
     :alt
     "A screen from SPY INTRIGUE, describing the surroundings all caps."
     :width 472
     :height 423}]
   [:p
    "I sat staring at the empty paragraph tag here for a while. Which is to say, I have a hard time coming up with a description of SPY INTRIGUE that isn't way too high-concept for the purposes of this page. SPY INTRIGUE is simply one of the best games I've played, an incredible, innovative, beautiful, and sadly unknown work of Twine fiction. The game screams and thrashes through truly absurd comedy and intrigue and in those moments of exhaustion that result, when the caps lock vanishes, you peek into a much more painful, emotional wraught world beyond the heightened fantasy. Beautiful, painful, and healing in the way of something that reflects difficult emotions back at you."]
   [:<>
    [:details
     [:summary "Content warnings"]
     "Physical violence, emotional violence, sexual violence, alcohol use, drug use, mental illness, suicide, sex, gender, incest, pet abandonment."]]
   [:br]])

(defn please-answer-carefully []
  [:div.elit-post [:h3
                   [:a.title.elitlink
                    {:href "https://litrouke.itch.io/please-answer-carefully"}
                    "Please Answer Carefully"]]
   [:small "litrouke, 2019, Twine"]
   [:br]
   [:img.border
    {:src "media/answer.png",
     :alt "A screenshot of the game, appearing to be a survey."
     :width 500
     :height 300
     :style {:vertical-align "middle"}}]
   [:p
    "One of the things that is delightful about web art is the way in which it supports small works that wouldn't be considered 'standalone' in another context. Please Answer Carefully is a great example of this; a clever usage of Twine to model a survey that tells a super-compact horror story about stalking that made my palms sweat."]
   [:<>
    [:details
     [:summary "Content warnings"]
     "Stalking, paranoia, unreality."]]
   [:br]])

(defn drones []
  [:div.elit-post[:h3
                  [:a.title.elitlink
                   {:href "https://www.youtube.com/watch?v=VsTXIl_oKas"}
                   "Poem Where Every Bird is a Drone"]]
   [:small
    "Tarik Dobbs, read by Torrin A. Greathouse, 2022, Text and video"]
   [:p
    "A wonderful example of collaborative transformation in a digital format. Dobbs' poem is a powerful piece of visual poetry, and the version read by the author provides a fascinating way of reading visual poetry. Greathouse builds on this, collaging her own voice into a feedback loop of broken syllables, joined by an animated version of the poem as she goes through it. A powerful, difficult piece read in a wonderful and uniquely digital way."]
   [:<>
    [:details
     [:summary "Content warnings"]
     "War, drone violence, death."]]
   [:br]])

(defn birds-poem []
  [:div.elit-post[:h3
                  [:a.title.elitlink
                   {:href
                    "https://collection.eliterature.org/1/works/mencia__birds_singing_other_birds_songs.html"}
                   "Birds Singing Other Birds' Songs"]]
   [:small "Maria Mencia, 2001, Flash"]
   [:br]
   [:img.border
    {:src "media/birds.png",
     :alt
     "Text outlines of birds overlaid on a sky with play buttons underneath.",
     :width "589",
     :height "401"}]
   [:p
    "A simple and lovely piece that feels very emblematic of early 2000s Flash poetry. Over and image of the sky are twelve play buttons, each of which queues a bird. The birds are represented by a human recreating their call with their voice and a text outline of the bird using a transcription of the call. The result is a serene and playful exploration of the interaction between voice and text, recording and reproduction, humans and nature."]])

(defn i-am []
  [:div.elit-post[:h3
                  [:a.title.elitlink
                   {:href "https://www.youtube.com/watch?v=rL-jdlTvRkk"}
                   "I Am That I Am"]]
   [:small "Brion Gysin and Ian Somerville, 1960"]
   [:p
    "Gysin is an interesting figure. Kicked out of the surrealists by Breton as a teenager, heavily associated with the beatniks, introduced the cut-up technique to William S. Burroughs, and later in life created early digital poems with programmer (and Burroughs' lover) Ian Somerville. This is a good example of the interests of a lot of early combinatory poetry, a very simple algorithm creating permutations on an input, resulting in a strange effect as the lines vary over and over again but never very much. Here one of the permutations of this poem is read on a BBC program."]])


(defn elit-displayer []
  [:div.expandable
   (cond
     (= @elit-display 0)
     [:div.body [elit-menu]]
     (= @elit-display 1)
     [:div.body [what-is-elit][elit-back-button]]
     (= @elit-display 2)
     [:div.body [bibliography][elit-back-button]]
     (= @elit-display 3)
     [:div.body [spy-intrigue][elit-back-button]]
     (= @elit-display 4)
     [:div.body [please-answer-carefully][elit-back-button]]
     (= @elit-display 5)
     [:div.body [drones][elit-back-button]]
     (= @elit-display 6)
     [:div.body [birds-poem][elit-back-button]]
     (= @elit-display 7)
     [:div.body [i-am][elit-back-button]])])

(defn elit-curation []
  [:div.elit.page
   [:h2 "Electronic literature is..."]
   [elit-displayer]])
