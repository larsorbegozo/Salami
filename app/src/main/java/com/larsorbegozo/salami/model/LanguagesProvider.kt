package com.larsorbegozo.salami.model

class LanguagesProvider {
    companion object {
        // I dunno if remove it, but, it works anyway xd
        private val position = 0
        val languagesList: List<Languages> = listOf(
            Languages("Inglés", "https://i.imgur.com/ntzOWdw.png", 0, position),
            Languages("Francés", "https://i.imgur.com/SVfUI8c.png", 1, position),
            Languages("Alemán", "https://i.imgur.com/p8xJQz4.png", 2, position),
            Languages("Japonés", "https://i.imgur.com/YTdzEN5.png", 3, position),
            Languages("Italiano", "https://i.imgur.com/tY1vD1l.png", 4, position),
            Languages("Portugués", "https://i.imgur.com/Fkts0xv.png", 5, position),
            Languages("Finlandés", "https://i.imgur.com/0rpMUR1.png", 6, position),
            Languages("Sueco", "https://i.imgur.com/53JL3TL.png", 7, position),
            Languages("Polaco", "https://i.imgur.com/2UzDbbA.png", 8, position)
        )
    }
}