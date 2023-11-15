(ns starter.pages
  (:require [reagent.dom :as rd]
            [reagent.core :as r]
            [reagent.ratom :as ratom]))

(defn home-page []
  [:div.home.page [:h2 "Welcome!"]
   [:p "My name is Moira Oona [Campbell|Morse] and this is my personal website. There was once a time that the intro here said it's super simple HTML with no CSS but then I rewrote it in Clojurescript and Reagent so here we are."]
   [:p "Anyway, this is my little home on the internet. I primarily use it to host links to all my work, but there's also a blog and some curation of electronic literature and some self-hosted art. Such is the magic of having your own website! Wow!"]])




(defn poetry-games-text []
  [:div.page [:h2 "Poetry and TTRPG Projects"]
   [:dl
    [:dt [:a.portfolio {:href "https://m-campbell.itch.io/pharmakon"} "Pharmakon"]]
    [:dd
     "A pair of visual poetry zines exploring coming to terms\n        with becoming disabled."]
    [:dt
     [:a.portfolio
      {:href "https://m-campbell.itch.io/pieces-of-me"}
      "Pieces of\n            Me"]]
    [:dd
     "A little lyric game about being newly disabled, modeled\n        by tearing and repairing your character sheet."]
    [:dt [:a.portfolio {:href "https://m-campbell.itch.io/diatoms"} "Diatoms"]]
    [:dd
     "Visual poetry collaging original writing and quotations\n        to explore my relationship with text and identity."]
    [:dt
     [:a.portfolio
      {:href "https://www.telescopictext.org/text/ArhwWD3sVsdum"}
      "The\n            trans body is a palimpsest"]]
    [:dd
     "An interactive, expanding poem about transness,\n        anxiety, and obsession."]
    [:dt
     [:a.portfolio
      {:href "https://m-campbell.itch.io/mothgirl-survival-guide"}
      "First\n            Protocols of Actias Luna"]]
    [:dd
     "Blackout poetry and digital collage about moths and\n        otherness."]
    [:dt
     [:a.portfolio
      {:href "https://m-campbell.itch.io/arms-long-enough"}
      "I\n            want arms long enough to hug all my friends"]]
    [:dd
     "Solo journaling game about being far away from the\n        people you love."]]
   [:h2 "Nonfiction Writing and Essays"]
   [:dl
    [:dt
     [:a.portfolio
      {:href "../blog/nethack.html"}
      "Nethack and the Grammar of Discovery (Or the Discovery of Grammar)"]]
    [:dd
     "An essay about my fascination with classic roguelike Nethack."]
    [:dt
     [:a.portfolio
      {:href
       "https://cohost.org/voidmoth/post/1026416-i-m-obsessed-with-th"}
      "I'm Obsessed With Ths Song and Other Thoughts About DIY\n            Tapes"]]
    [:dd
     "A discussion of the band Drunk Elk, the iconsistent\n        magic of obscure DIY music, and my mixed feelings about the\n        label &quot;outsider art&quot;."]
    [:dt
     [:a.portfolio
      {:href
       "https://cohost.org/voidmoth/post/1054546-how-i-learned-to-sto"}
      "How I Learned to Stop Worrying and Love the Rhizome"]]
    [:dd
     "Summary of the first chapter of A Thousand Plateaus,\n        with a focus on making the ideas accessible."]
    [:dt
     [:a.portfolio
      {:href
       "https://cohost.org/voidmoth/post/900209-a-thought-about-read"}
      "A Thought About Readability"]]
    [:dd
     "Musing about how to read dense or confusing\n        philosophy."]]])

(defn programming []
  [:div.page
   [:h2 "Game Projects"]
   [:dl
    [:dt "Port Forward (In Progress)"]
    [:dd
     "A lonely spacer talks to their loved ones back on earth\n        via their work computer's console."]
    [:dt
     [:a.portfolio
      {:href "https://m-campbell.itch.io/noondays-we-watched-the-sun"}
      "Noondays We Watched the Sun"]]
    [:dd "Say your goodbyes to the hills. You won't be back."]
    [:dt
     [:a.portfolio
      {:href "https://m-campbell.itch.io/ash-carrying"}
      "Ash\n            Carrying"]]
    [:dd
     "Return to the island you grew up on to meet your\n        lover's family and scatter his ashes."]]
   [:h2 "Other Programming"]
   [:dl
    [:dt [:a.portfolio {:href "https://github.com/VivRibbon/Sampogen"} "Sampogen"]]
    [:dd
     "A simple but robust roguelike-style name generator,\n        with customization tool."]
    [:dt [:a.portfolio {:href "https://github.com/VivRibbon/CrossOrg"} "CrossOrg"]]
    [:dd
     "Command line tool for converting .puz crosswords into\n        Org-Mode tables."]
    [:dt [:a.portfolio {:href "https://github.com/VivRibbon/doc2org"} "Doc2Org"]]
    [:dd "Converts basic docx formatting into Org-Mode."]
    [:dt
     [:a.portfolio
      {:href "https://github.com/VivRibbon/Analyze-Banned-Books"}
      "Frequency\n            Analysis and Topic Modeling of Books Banned in 18 US\n            Prisons"]]
    [:dd
     "Jupyter project that analyzes and visualizes a data set\n        of books banned in prisons."]
    [:dt
     [:a.portfolio
      {:href "https://github.com/VivRibbon/FreeCodeCampPythonPrograms"}
      "FreeCodeCamp Projects"]]
    [:dd "Assorted projects for FreeCodeCamp courses."]]])

(defn music []
  [:div.bandcamp.page [:p "(Bandcamp embeds may take a moment to\n    load)"]
   [:iframe
    {:style {:border 0 :width "100%" :height 120}
     :src
     "https://bandcamp.com/EmbeddedPlayer/album=2741511256/size=large/bgcol=181a1b/linkcol=056cc4/tracklist=false/artwork=small/transparent=true/",
     :seamless ""}
    "&lt;a href=\n    &quot;https://vivianisobelisobel.bandcamp.com/album/and-the-moon&quot;&gt;And\n    The Moon by Vivian Isobel Isobel&lt;/a&gt;"]
   [:iframe
    {:style {:border 0 :width "100%" :height 120}
     :src
     "https://bandcamp.com/EmbeddedPlayer/album=792415827/size=large/bgcol=181a1b/linkcol=056cc4/tracklist=false/artwork=small/transparent=true/",
     :seamless ""}
    "&lt;a href=\n    &quot;https://vivianisobelisobel.bandcamp.com/album/noondays-we-watched-the-sun&quot;&gt;\n    Noondays We Watched the Sun by Vivian Isobel\n    Isobel&lt;/a&gt;"]
   [:iframe
    {:style {:border 0 :width "100%" :height 120}
     :src
     "https://bandcamp.com/EmbeddedPlayer/album=2641152511/size=large/bgcol=181a1b/linkcol=056cc4/tracklist=false/artwork=small/transparent=true/",
     :seamless ""}
    "&lt;a href=\n    &quot;https://vivianisobelisobel.bandcamp.com/album/ixiv&quot;&gt;Ixiv by\n    Vivian Isobel Isobel&lt;/a&gt;"]
   [:iframe
    {:style {:border 0 :width "100%" :height 120}
     :src
     "https://bandcamp.com/EmbeddedPlayer/album=2936120491/size=large/bgcol=181a1b/linkcol=056cc4/tracklist=false/artwork=small/transparent=true/",
     :seamless ""}
    "&lt;a href=\n    &quot;https://vivianisobelisobel.bandcamp.com/album/x-ray-ghost-world-shimmering-2&quot;&gt;\n    X-Ray Ghost World Shimmering by Vivian Isobel\n    Isobel&lt;/a&gt;"]
   [:iframe
    {:style {:border 0 :width "100%" :height 120}
     :src
     "https://bandcamp.com/EmbeddedPlayer/album=310084788/size=large/bgcol=181a1b/linkcol=056cc4/tracklist=false/artwork=small/transparent=true/",
     :seamless ""}
    "&lt;a href=\n    &quot;https://vivianisobelisobel.bandcamp.com/album/talia-akl&quot;&gt;Talia\n    Akl by Vivian Isobel Isobel&lt;/a&gt;"]
   [:iframe
    {:style {:border 0 :width "100%" :height 120}
     :src
     "https://bandcamp.com/EmbeddedPlayer/album=4020409973/size=large/bgcol=181a1b/linkcol=056cc4/tracklist=false/artwork=small/transparent=true/",
     :seamless ""}
    "&lt;a href=\n    &quot;https://vivianisobelisobel.bandcamp.com/album/the-saga-of-norris-the-flying-bear&quot;&gt;\n    The Saga of Norris the Flying Bear by Gondola&lt;/a&gt;"]])

(defn about []
  [:div.about.page
   [:img.border {
                 :src "media/about_pic.jpg"
                 :alt "White trans woman in a wheelchair looking at an aquarium."
                 :width 400
                 :height 533
                 :style {:float "left" :padding 5}}]

   [:div {:style {:padding-left 425}}
    [:p
     "I am a disabled transgender programmer, poet, game designer,\n    and multimedia artist. As a coder I work primarily in Python, Rust, and Clojure, though I also have some experience in R, HTML/CSS/JS, SQL,\n    shell-scripting, and bits and pieces of many other things. I\n    have particular experience with data science and digital\n    humanities topics, in addition to generalist programming."
     [:p
      "As an artist (as if this is a separate thing from\n    programming), I create visual poetry, games, collage art, and\n    curios. My work explores love, queerness, bodies, and language,\n    among other topics."]
     [:p
      "I used to go by the name Vivian, which is why it is on a lot\n    of my older work."]
     [:h2 "Links:"]
     [:div#aboutlinks
      [:ul.blog-menu
       [:li [:a.portfolio.links {:href "https://m-campbell.itch.io/"} "Itch.io"]]
       [:li
        [:a.portfolio.links {:href "https://vivianisobelisobel.bandcamp.com/"} "Bandcamp"]]
       [:li [:a.portfolio.links {:href "https://cohost.org/voidmoth"} "Cohost"]]
       [:li [:a.portfolio.links {:href "https://twitter.com/Viv_Riven"} "Twitter"]]
       [:li [:a.portfolio.links {:href "mailto:giantsilkmoth@proton.me"} "Email me"]]]]]]])
