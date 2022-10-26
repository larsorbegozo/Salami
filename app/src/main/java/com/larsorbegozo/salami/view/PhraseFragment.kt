package com.larsorbegozo.salami.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.larsorbegozo.salami.R
import com.larsorbegozo.salami.databinding.FragmentPhraseBinding
import com.larsorbegozo.salami.model.SentencesProvider

class PhraseFragment : Fragment(R.layout.fragment_phrase) {

    private var _binding: FragmentPhraseBinding? = null
    private val binding get() = _binding!!
    private lateinit var langID: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        arguments?.let {
            langID = it.getInt(WordsFragment.LANGID).toString()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentPhraseBinding.inflate(layoutInflater, container, false)

        // Incomplete Phrase text
        binding.incompletePhrase.text = SentencesProvider.sentencesList[langID.toInt()].phraseIncomplete
        // Complete Phrase text
        val completePhrase = SentencesProvider.sentencesList[langID.toInt()].phraseComplete

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