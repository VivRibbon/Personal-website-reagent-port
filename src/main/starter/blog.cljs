(ns starter.blog
  (:require [reagent.dom :as rd]
            [reagent.core :as r]))

(def post-display (r/atom 0))

(defn youtube-embed [src]
  [:iframe {:width 420 :height 315 :src src}])

(defn blog-menu-button [index txt]
  [:button.blog-button {:on-click #(reset! post-display index)} txt])

(defn blog-back-button []
  [:button.blog-back-button {:on-click #(reset! post-display 0)} "Back"])

(defn nethack []
  [:div.blog-post
   [:h3 "Nethack and the Grammar of Discovery (or the Discovery of\n    Grammar)"]
   [:img
    {:src "../media/nethack1.png",
     :alt "The opening menu of Nethack",
     :width "50%",
     :height "50%"}]
   [:p
    "Since I was a teenager I've had the vague fantasy of a\n    puzzle game where each key on your keyboard is mapped to a\n    different, unexplained function and the primary thrust of the\n    game is figuring out what each key does and how each function\n    interacts with the world of the game. So it's probably not a\n    surprise that traditional roguelikes are a genre that very much\n    are for me. I've been obsessed with Nethack particularly\n    lately, and I want to talk a bit about why."]
   [:p
    "Real quick background: Nethack"
    [:a
     {:id "footnote-1-ref",
      :href "#footnote-1",
      :title "link to footnote"}
     "[1]"]
    "is one of the\n    major early offshoots of the original Rogue, the other being\n    Angband. Games inspired by Angband tend to go more into the\n    dungeon crawler aspect of the genre, focusing on labyrinthine\n    dungeons and crunchy combat and survival strategy. Meanwhile,\n    Nethack, while still maintaining the linear dungeon crawl\n    structure (games like ToME and ADOM that would popularize the\n    idea of open world roguelikes were still a while off), focuses\n    more in on interactions. There's still plenty of combat, but\n    while Angband has the feel of a classic tabletop dungeon dive,\n    Nethack is more about learning how to use the elements of the\n    world and the resources it presents to your advantage. Learning\n    when to run from a fight is important, but so is learning that\n    falling into a pit with a ball and chain attached to your ankle\n    will result in it falling on your head, or that breaking down\n    the door of a closed shop will result in the shopkeeper killing\n    you, or simply how to safely try on unidentified necklaces\n    without risking it being a necklace of strangulation."]
   [:p
    "This is why Nethack has a bit of a reputation as being a\n    wacky and absurdly deadly game even by traditional roguelike\n    standards. The game is extremely willing to surprise you, and\n    that surprise is often death, or at least being disadvantaged\n    somehow. In other games you can usually think of the primary\n    deadly aspect being combat and other things as peripheral to\n    and preparing for that, but combat in Nethack is as peripheral\n    as any of the many other environmental and mechanical\n    interactions."]
   [:p
    "Now this is all fun and dandy and we all love RPGs about\n    freely smacking elements together to see what they do. For\n    Nethack though, there's a meta-level at which all this\n    functions that is vitally important to what makes it engaging\n    to me. Put simply, Nethack takes the general inaccessible\n    nature of roguelike UX to an absurd extreme. The game is a mess\n    of esoteric keyboard commands, Vim-style text entry, and\n    unexplained core mechanics, not to mention an extremely dense\n    options menu (and config file), which has many things that\n    could make the game more accessible, including an entire\n    alternate interface, off by default. And yes there is, of\n    course, a detailed manual (and wiki) you can dive into, but\n    realistically unless you're capable of reading a giant manual\n    and memorizing like 30 keyboard commands in one go, you'll be\n    learning even the basics of how to interact with the game\n    piece-by-piece over a long period of time. I literally did not\n    know there was a spellcasting system or a way to increase\n    skills until I was around 12 runs in. Combine this with ASCII\n    graphics where you need to spend time learning what the symbols\n    on the screen even represent and you've got a deeply obfuscated\n    RPG."]
   [:p
    "Which, you know, feels kinda counter to a lot of game design\n    wisdom and you may well have read that last paragraph and gone\n    'wow! no thanks!' which is entirely fair. But for me? Well,\n    refer back to the first paragraph of this blog."]
   [:img
    {:src "../media/nethack2.png",
     :alt "Nethack gameplay",
     :width "50%",
     :height "50%"}]
   [:p
    "In this way, Nethack is a game about phonotactics and\n    grammar, more than any other game I've played. Starting at 0,\n    with perhaps some general roguelike knowledge, you are given a\n    collection of phonemes in the form of basic game actions. You\n    learn the valid and invalid and optimal ways of mixing these to\n    form 'words', a multitude of combinations of basic actions\n    which you then, through a slow process of trial and error,\n    learn to combine into grammatically valid chains of actions and\n    long-term strategies."]
   [:p
    "It's a lot. Nethack is the kind of game you play for years\n    before winning, that you play for years and are still\n    discovering new 'words' and 'sentences', new methods of\n    interactions, new quirks, new mechanics. It defies all\n    reasonable wisdom about game design - accessibility, coherence,\n    you name it. I think it's maybe the best game?"]
   [:p
    "Nethack is lenticular and fractal, a shifting and deep thing\n    that spirals out more the more you delve into it. For someone\n    like me, to whom video games are essentially about the\n    collection and management of information, it's nearly perfect.\n    I look forward to, seventy-five runs from now, suddenly\n    discovering a new keybind or menu option that allows me to\n    survive just that little bit longer, construct just a slightly\n    more complex combination of actions. And maybe one day I'll\n    even win a game and shout about it in excitement to my vaguely\n    befuddled friends."]
   [:p
    "(For more thoughts on the phonotactics of games, do check\n    out "
    [:a
     {:href
      "https://bigstuffedcat.itch.io/lyric-scrabble-with-natalie-libre-and-friends"}
     "Lyric Scrabble"]
    "by my wife Hy Libre, which I read for the\n    first time while thinking about this blog and which informed\n    some of my thoughts regarding it, particularly the framing of\n    learning a game in linguistic terms.)"]
   [:hr {:style {:border-style "dotted"}}]
   [:p
    {:id "footnote-1"}
    "1. Nethack is actually an expansion of the\n    roguelike Hack. I am not familiar with Hack and don't know what\n    is from Hack and what is from Nethack. It doesn't particularly\n    matter to the point I'm making, but is worth noting\n    historically."
    [:a {:href "#footnote-1-ref", :title "return to text"} "↩"]]])

(defn on-delicacy []
  [:div.blog-post
   [:h3 "On Delicacy"]
   [youtube-embed "https://www.youtube.com/embed/8viBs8R4Rlo?si=mjHaHsH5xS59szkG"]
   [:p "Delicacy is the domain of ghosts. Folks down here, feet planted on the ground, we can't afford delicacy, we can't hold it in our thick, clumsy hands lest we break it. Delicacy is not for humans to objectify."]
   [:p "Vini Reilly is perhaps the kind of man who, like me, is half-ghost, trapped in the limen, for better or worse. I can only assume this given the spectral photo of him that adorns the self-titled Durutti Column album. Not self-titled after the name of the band, mind. Self-titled after him. I go on assuming this because this self-same album does not have any of his singing until the final track, but is also not strictly instrumental prior, instead drawing on a variety of scattered vocal samples from other music. These are the kinds of gauzey, contradictory half-measures that make up the flesh of people like he and I."]
   [:p "If I scour Reilly's Wikipedia page for similarities I notice his parent didn't allow him to watch TV growing up, which I relate to, and that he was a talented footballer while I ran away crying when brought to a soccer field as a child. But Wikipedia does not note, between the line describing his birthplace and his musical genres, that he is half-ghost. Wikipedia does not mention that he understands delicacy. It couldn't. To do so would be dangerous, would be too close to bringing down a hammer on what, to certain specters, is something resembling a heart."]
   [:p "And so the half-light remains, thank god. The delicacy, the fragility, it hurts like hell, but to imagine not having it is thousands of time worse. Imagining the guitar falling to pieces entirely, the distant aspirations fading out for good, it's the same sort of terror the fully living describe when they talk about death."]
   [:p "So let us continue, let us feel and think delicately, let us always be at risk of shattering, let us stand as indistinct figures at the top of staircases, in the back of family photos, spiraling out of graveyards and pipe organs. Let me hold your hand, if you're insubstantial enough to touch me, and let Vini Reilly go on playing his guitar."]])

(defn diy-tapes []
  [:div.blog-post
   [:h3 "I'm Obessed With This Song and Other Thoughts About DIY Tapes"]
   [youtube-embed "https://w.soundcloud.com/player/?url=https%3A//api.soundcloud.com/tracks/315760933&color=%23ff5500&auto_play=false&hide_related=false&show_comments=true&show_user=true&show_reposts=false&show_teaser=true&visual=true"]
   [:p "So there's this song called 'Quintessence' by this Tasmanian band called 'Drunk Elk'. The only instrumentation is bass and a cheap keyboard while a man sings an oddly mournful song, constantly wavering in pitch. The chorus 'play that strange tune again, that off-key melody' feels like it drifts above everything, achieving some kind of ghostly significance beyond the words and the simplistic nature of the song."]
   [:p "The rest of the cassette is fine. There are some fun melodies and keyboard lines and such. It sounds like three guys with some good ideas quickly writing songs to get them recorded. But on one song it somehow comes together into something else entirely."]
   [:p "Obviously I can't say I wouldn't love a tape full of songs as good as that, but at the same time this exact dynamic is part of what makes real at-home DIY cassette stuff intriguing. That random cassette you find at the used record store could be anything. It could be a bunch of dusty bossa nova or an exercise routine or an obscure indie band who wrote a song that pierces your soul. It's not just that it's a surprise, but that it's inconsistent. That you may genuinely sift through a lot of boring, unremarkable music but that that's part of what makes the unique gems that couldn't have arisen any other way really hit."]
   [:p "I've been listening to a lot of cassette music recently. Partly because everything I said above, partly because exploring obscure music soothes my autism brain, partly because I've been feeling a bit unhinged (/pos) lately and dusty drifting distant music fits that mood."]
   [:p "This got me thinking about 'amateurish' music and outsider music. Outsider music is a really complicated thing with a long history of both celebrating genuinely interesting non-industry music as well as a long history of fetishization of mental illness and 'naivety' and all that stuff. It's bad. The whole 'Songs in the Key of Z' circus act shit."]
   [:p "Which is a shame because a lot of this music is genuinely special. And, regardless of the nature of the artist, a lot of this fuzzy at-home tape stuff really does resonate with my neurodivergence and mental illness. It feels like how my brain feels when I'm a little out there. It just hits a specific nerve ending in a way nothing else does."]
   [:p "Or, it does sometimes. A lot of the time it's a little boring or unremarkable or ugly, but now and then something rises from the fog and feels like light shining through you."]])

(defn genre-is-history []
  [:div.blog-post
   [:h3 "Genre is History"]
   [:p "I've been listening to Shelved by Genre and was talking to my wife about my autistic interest in musical genre and i had i think a minor breakthrough about the way i relate to genre? 'cause i am highly invested in and influenced by what would be considered avant-garde art and thought around art in various forms, and avant-garde in its effort to move outside of Boxes and Expectations tends to want to separate itself from the conception of genre. Which has never quite sat right with me."]
   [:p "The usual line is that genre is a descriptive category to easily describe a thing and what it has in common with other things. This is true, but it also doesn't quite capture why I care about genre so deeply. Because genre is history."]
   [:p "I am a deeply referential creator, which reflects both my interest in collagist forms of art and the way my autistic brain works. And to me genre is important because it gives a lineage to the way we think about art, a history of influence and conversation. I am not particularly interested in defining post-punk by its musical tones and patterns. Instead I am interested in defining post-punk as arising out a historical moment, of being in conversation with first-wave punk, of conversing forward to indie rock, etc. Genre is a discursive history to me."]
   [:p "This is important! Yes in part because I am a referential writer, I love to be the angel of history, to write and read works that talk through and explore the pile-up of history and the way we relate to it. But also because remembering and working through our history is how we keep moving, how we continue to explore, and how we resist the deadening nature of art under capitalism."]
   [:p "Yes, we should be skeptical of clean narratives and easy monocultural answers. However we also need to be skeptical of the response being to remove ourselves from history and context entirely. At best this results in isolated and hollow art and at worst it results in the kind of alienation Benjamin discusses in his thesis on the philosophy of history, giving up our own history to the hegemon's control."]
   [:p "So I do care deeply about genre. And I love the avant-garde. And these things do and must deeply inform each other. Genre is not just a package of traits to allow us to sell our art, neither is it just a descriptive tool. Genre is a reminder of where we've been and where we're going. Genre is the ability to look at the people who have gone before me and relate to them, to look ahead to the future and consider how people might relate to me. Genre is Thomas Pynchon's 'great disorderly Tangle of Lines, long and short, weak and strong, vanishing into the Mnemonick Deep'."]
   [:p "Genre is one of the ways we tell stories about ourselves and we must value it as such."]])


(defn blog-home []
  [:div.blog-home
   [:p "It's blog! Here is where I write things, albeit somewhat inconsistently."]
   [:ul.blog-menu
    [:li [blog-menu-button 4 "Genre is History"]]
    [:li [blog-menu-button 3 "I'm Obsessed With This Song and Other Thoughts About DIY Tapes"]]
    [:li [blog-menu-button 2 "On Delicacy"]]
    [:li [blog-menu-button 1 "Nethack and the Grammar of Discovery (or the Discovery of Grammar)"]]]])

(defn blog-displayer []
  [:div.expandable
   (cond
     (= @post-display 0)
     [:div.body [blog-home]]
     (= @post-display 1)
     [:div.body [nethack][blog-back-button]]
     (= @post-display 2)
     [:div.body [on-delicacy][blog-back-button]]
     (= @post-display 3)
     [:div.body [diy-tapes][blog-back-button]]
     (= @post-display 4)
     [:div.body [genre-is-history][blog-back-button]])])

(defn blog []
  [:div.blog.page
   [:h2 "Blog"]
   [blog-displayer]])
