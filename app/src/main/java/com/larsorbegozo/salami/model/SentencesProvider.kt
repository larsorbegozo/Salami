package com.larsorbegozo.salami.model

class SentencesProvider {
    companion object {
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
    }
}