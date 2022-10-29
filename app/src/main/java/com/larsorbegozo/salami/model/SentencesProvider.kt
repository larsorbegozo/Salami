package com.larsorbegozo.salami.model

class SentencesProvider {
    companion object {
<<<<<<< Updated upstream
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
        )
=======
        fun sentenceProvider(chosenLanguage: String, position: Int): Sentences {
            val hash = hashMapOf<String, List<Sentences>>()
            hash["Inglés"] = listOf(
                Sentences(
                    "https://i.imgur.com/E9R0JUm.png",
                    "https://i.imgur.com/faDKwXA.jpg",
                    "Cat",
                    "Forest",
                    "Gato",
                    "Bosque"),
                Sentences(
                    "https://i.imgur.com/O2VSC0d.png",
                    "https://i.imgur.com/frOZ0Li.png",
                    "Cake",
                    "Fox",
                    "Torta",
                    "Zorro"),
                Sentences(
                    "https://i.imgur.com/e7Fs8e1.png",
                    "https://i.imgur.com/fKlQJO3.jpg",
                    "Cow",
                    "Grass",
                    "Vaca",
                    "Pasto"
                )
            )
            hash["Francés"] = listOf(
                Sentences(
                    "https://i.imgur.com/FcbfKWf.png",
                    "https://i.imgur.com/5fptmif.png",
                    "Feu",
                    "Bureau",
                    "Fuego",
                    "Oficina"),
                Sentences(
                    "https://i.imgur.com/oEry96d.jpg",
                    "https://i.imgur.com/1V1b7XN.jpg",
                    "Lac",
                    "Recette",
                    "Lago",
                    "Receta"),
                Sentences(
                    "https://i.imgur.com/3xy47BQ.jpg",
                    "https://i.imgur.com/8OP30Rb.png",
                    "Église",
                    "Poubelle",
                    "Iglesia",
                    "Basura"),
            )
            hash["Alemán"] = listOf(
                Sentences(
                    "https://i.imgur.com/0D26BKn.jpg",
                    "https://i.imgur.com/bckMXFY.jpg",
                    "Zunge",
                    "Hungrig",
                    "Lengua",
                    "Hambre"),
                Sentences(
                    "https://i.imgur.com/fNuQMdi.jpg",
                    "https://i.imgur.com/5obAP0R.jpg",
                    "Sohn",
                    "Kino",
                    "Hijo",
                    "Cine"),
                Sentences(
                    "https://i.imgur.com/LZ6uC2E.jpg",
                    "https://i.imgur.com/JDFD1aq.png",
                    "Liebe",
                    "Geist",
                    "Amor",
                    "Fantasma"
                )
            )
            hash["Japonés"] = listOf(
                Sentences(
                    "https://i.imgur.com/CFmUzg2.png",
                    "https://i.imgur.com/k8oEkDV.jpg",
                    "Ame",
                    "Kuruma",
                    "Lluvia",
                    "Auto"),
                Sentences(
                    "https://i.imgur.com/zDaCvei.jpg",
                    "https://i.imgur.com/CqAjxGs.jpg",
                    "Aoi",
                    "Heya",
                    "Azul",
                    "Habitación"),
                Sentences(
                    "https://i.imgur.com/kr3YURJ.jpg",
                    "https://i.imgur.com/KlkXX8R.png",
                    "Shū",
                    "Hoshi",
                    "Semana",
                    "Estrella"
                )
            )
            hash["Italiano"] = listOf(
                Sentences(
                    "https://i.imgur.com/j4MleI8.jpg",
                    "https://i.imgur.com/5KQrbq3.png",
                    "Viaggio",
                    "Ruota",
                    "Viaje",
                    "Rueda"),
                Sentences(
                    "https://i.imgur.com/ggaoVHZ.png",
                    "https://i.imgur.com/Kxz435l.png",
                    "Tavolo",
                    "Coltello",
                    "Mesa",
                    "Cuchillo"),
                Sentences(
                    "https://i.imgur.com/XZqd9i3.png",
                    "https://i.imgur.com/g9X9Km1.jpg",
                    "Malattia",
                    "Pulsante",
                    "Enfermedad",
                    "Botón"
                )
            )
            hash["Portugués"] = listOf(
                Sentences(
                    "https://i.imgur.com/MGrzrzz.jpg",
                    "https://i.imgur.com/Kp1esoU.png",
                    "Mãe",
                    "Violão",
                    "Madre",
                    "Guitarra"),
                Sentences(
                    "https://i.imgur.com/aZLJfMV.jpg",
                    "https://i.imgur.com/ZYb1HKL.png",
                    "Relaçao",
                    "Dança",
                    "Relación",
                    "Baile"),
                Sentences(
                    "https://i.imgur.com/bfSCexJ.png",
                    "https://i.imgur.com/6WxvZoE.png",
                    "Prisioneiro",
                    "Engraçado",
                    "Prisionero",
                    "Divertido"
                )
            )
            hash["Finlandés"] = listOf(
                Sentences(
                    "https://i.imgur.com/cz6z4dq.jpg",
                    "https://i.imgur.com/90r8a0E.png",
                    "Raha",
                    "Pullo",
                    "Dinero",
                    "Botella"),
                Sentences(
                    "https://i.imgur.com/tyMPFwC.jpg",
                    "https://i.imgur.com/unVBrn0.png",
                    "Koira",
                    "Kertoa",
                    "Perro",
                    "Decir"),
                Sentences(
                    "https://i.imgur.com/VaPAqFa.png",
                    "https://i.imgur.com/5KQrbq3.png",
                    "Hiukset",
                    "Pyörä",
                    "Pelo",
                    "Rueda"
                )
            )
            hash["Sueco"] = listOf(
                Sentences(
                    "https://i.imgur.com/HOYEf6S.png",
                    "https://i.imgur.com/YNcpEfu.png",
                    "Svärd",
                    "Fönster",
                    "Espada",
                    "Ventana"),
                Sentences(
                    "https://i.imgur.com/deuEFyL.jpg",
                    "https://i.imgur.com/GHEDlkp.jpg",
                    "Vår",
                    "Damm",
                    "Primavera",
                    "Polvo"),
                Sentences(
                    "https://i.imgur.com/3LDeshv.png",
                    "https://i.imgur.com/XOgbaTT.png",
                    "Cirkel",
                    "Flod",
                    "Círculo",
                    "Río"
                )
            )
            hash["Polaco"] = listOf(
                Sentences(
                    "https://i.imgur.com/9BvwQdf.jpg",
                    "https://i.imgur.com/bslxDUb.jpg",
                    "Morze",
                    "Chleb",
                    "Mar",
                    "Pan"),
                Sentences(
                    "https://i.imgur.com/ySFpaYv.jpg",
                    "https://i.imgur.com/TbpGFkC.jpg",
                    "Kawa",
                    "Ropucha",
                    "Café",
                    "Sapo"),
                Sentences(
                    "https://i.imgur.com/GMFVJbj.png",
                    "https://i.imgur.com/rhRb6Vn.jpg",
                    "Pilka",
                    "Kuchnia",
                    "Pelota",
                    "Cocina"
                )
            )
            return hash[chosenLanguage]!![position]
        }
>>>>>>> Stashed changes
    }
}