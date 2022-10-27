package com.larsorbegozo.salami.model


class SentencesProvider {
    companion object {
        fun sentenceProvider(chosenLanguage: String, position: Int): Sentences {
            val hash = hashMapOf<String, List<Sentences>>()
            // TODO: Add more phrases
            hash["Inglés"] = listOf(
                Sentences(
                    "The cats are running through the forest",
                    "The GATOS are running through the BOSQUE",
                    "Cats",
                    "Forest",
                    "Gatos",
                    "Bosque"),
                Sentences(
                    "English test for second place of hash map",
                    "INcomplete Phrase english 2 test",
                    "SECOND",
                    "SECOND",
                    "SECOND",
                    "SECOND"),
                Sentences(
                    "english 3 test",
                    "English 3 test",
                    "THIRD",
                    "ARSOEN",
                    "TERCERO",
                    "arptrtar"
                )
            )
            hash["Francés"] = listOf(
                Sentences(
                    "The cats are running through the forest",
                    "The GATOS are running through the BOSQUE",
                    "FRANCHUTE1",
                    "FRANCHUTE1",
                    "FRANCHUTE1",
                    "FRANCHUTE1"),
                Sentences(
                    "English test for second place of hash map",
                    "INcomplete Phrase english 2 test",
                    "FRANCHUTE2",
                    "SECONDFRANCHUTE2",
                    "SECONDFRANCHUTE2",
                    "FRANCHUTE2"),
                Sentences(
                    "english 3 test",
                    "English 3 test",
                    "FRANCHUTE223",
                    "FRANCHUTE2213",
                    "FRANCHUTE2214",
                    "FRANCHUTE2421"
                )
            )
            hash["Alemán"] = listOf(
                Sentences(
                    "The cats are running through the forest",
                    "The GATOS are running through the BOSQUE",
                    "ALEMAN1",
                    "ALEMAN1",
                    "ALEMAN1ESP",
                    "ALEMAN1ESP"),
                Sentences(
                    "English test for second place of hash map",
                    "INcomplete Phrase english 2 test",
                    "ALEMAN2",
                    "ALEMAN22",
                    "ALEMAN2222",
                    "ALEMAN22222"),
                Sentences(
                    "english 3 test",
                    "English 3 test",
                    "arssar",
                    "FRANCatstarHUTE2213",
                    "FRANCHUstarTE2214",
                    "FRANCHafwafwgsartdUTE2421"
                )
            )
            hash["Japonés"] = listOf(
                Sentences(
                    "The cats are running through the forest",
                    "The GATOS are running through the BOSQUE",
                    "Japonés1",
                    "Japonés1",
                    "Japonés111",
                    "Japonés111"),
                Sentences(
                    "English test for second place of hash map",
                    "INcomplete Phrase english 2 test",
                    "Japonés2",
                    "Japonés2",
                    "Japonés22",
                    "Japonés22"),
                Sentences(
                    "english 3 test",
                    "English 3 test",
                    "Japonés3",
                    "Japonés3",
                    "Japonés33",
                    "Japonés33"
                )
            )
            hash["Italiano"] = listOf(
                Sentences(
                    "The cats are running through the forest",
                    "The GATOS are running through the BOSQUE",
                    "Italiano1",
                    "Italiano1",
                    "Italiano11",
                    "Italiano11"),
                Sentences(
                    "English test for second place of hash map",
                    "INcomplete Phrase english 2 test",
                    "Italiano2",
                    "Italiano2",
                    "Italiano22",
                    "Italiano22"),
                Sentences(
                    "english 3 test",
                    "English 3 test",
                    "Italiano3",
                    "Italiano3",
                    "Italiano33",
                    "Italiano33"
                )
            )
            hash["Portugués"] = listOf(
                Sentences(
                    "The cats are running through the forest",
                    "The GATOS are running through the BOSQUE",
                    "Portugués1",
                    "Portugués1",
                    "Portugués11",
                    "Portugués11"),
                Sentences(
                    "English test for second place of hash map",
                    "INcomplete Phrase english 2 test",
                    "Portugués2",
                    "Portugués2",
                    "Portugués22",
                    "Portugués22"),
                Sentences(
                    "english 3 test",
                    "English 3 test",
                    "Portugués3",
                    "Portugués3",
                    "Portugués33",
                    "Portugués33"
                )
            )

            return hash[chosenLanguage]!![position]
        }
    }
}




/*
        val sentencesList: List<Sentences> = listOf(
            Sentences(
                "The cats are running through the forest",
                "The GATOS are running through the BOSQUE",
                "Cats",
                "Forest",
                "Gatos",
                "Bosque"),
            Sentences(
                "Les princesses ne grimpent pas aux arbres",
                "Les princesses ne TREPAN pas aux ÁRBOLES",
                "Grimpent",
                "Arbres",
                "Trepan",
                "Árboles"),
            Sentences(
                "Musik macht mich immer hungrig",
                "Musik macht mich SIEMPRE HAMBRE",
                "Immer",
                "Hungrig",
                "Siempre",
                "Hambre"),
            Sentences(
                "Ame ga watashi no kuruma o nurasu",
                "LLUVIA ga watashi no AUTO o nurasu",
                "Ame",
                "Kuruma",
                "Lluvia",
                "Auto"),
            Sentences(
                "Pulisci regolarmente la tua stanza",
                "LIMPIA regolarmente la tua HABITACIÓN",
                "Pulisci",
                "Stanza",
                "Limpia",
                "Habitación"),
            Sentences(
                "Meu amigo João gosta de tocar violão",
                "Meu amigo João GUSTA de tocar GUITARRA",
                "Gosta",
                "Violão",
                "Gusta",
                "Guitarra"),
        ) */