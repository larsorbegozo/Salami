package com.larsorbegozo.salami.view

import android.os.Bundle
import android.provider.UserDictionary.Words
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.larsorbegozo.salami.R
import com.larsorbegozo.salami.databinding.FragmentPhraseBinding
import com.larsorbegozo.salami.model.SentencesProvider
import kotlin.properties.Delegates

class PhraseFragment : Fragment(R.layout.fragment_phrase) {

    private var _binding: FragmentPhraseBinding? = null
    private val binding get() = _binding!!
    private lateinit var langID: String
    private var position: Int = 0
    private lateinit var langName: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        arguments?.let {
            langID = it.getString(WordsFragment.LANGID).toString()
            position = it.getInt(WordsFragment.POSITION)
            langName = it.getString(WordsFragment.LANGNAME).toString()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentPhraseBinding.inflate(layoutInflater, container, false)

        // Incomplete Phrase text
        binding.incompletePhrase.text = SentencesProvider.sentenceProvider(langName, position).phraseIncomplete
        // Complete Phrase text
        val completePhrase = SentencesProvider.sentenceProvider(langName, position).phraseComplete

        binding.button.setOnClickListener {
            if (completePhrase.equals(binding.textInputEditText.text.toString(), true)) {
                Toast.makeText(context, "CORRECTO", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(context, "INCORRECTO", Toast.LENGTH_LONG).show()
            }
        }

        return binding.root
    }
}