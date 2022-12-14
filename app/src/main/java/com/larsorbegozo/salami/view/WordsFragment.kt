package com.larsorbegozo.salami.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.bumptech.glide.Glide
import com.larsorbegozo.salami.R
import com.larsorbegozo.salami.databinding.FragmentWordsBinding
import com.larsorbegozo.salami.model.LanguagesProvider
import com.larsorbegozo.salami.model.SentencesProvider

class WordsFragment : Fragment(R.layout.fragment_words) {
    companion object {
        // reference to the argument passed to LearnFragment
        const val LANGID = "langID"
        const val POSITION = "position"
        const val LANGNAME = "langName"
    }

    private var _binding: FragmentWordsBinding? = null
    private val binding get() = _binding!!

    private lateinit var langID: String
    private var position: Int = 0
    private lateinit var langName: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        arguments?.let {
            // Get the argument passed for MenuLangFragment (LangName.text)
            langID = it.getInt(LANGID).toString()
            position = it.getInt(POSITION)
            langName = it.getString(LANGNAME).toString()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentWordsBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        swapWords(langID.toInt(), 0)
        var x = 1

        binding.repeatButton.setOnClickListener {
            swapWords(langID.toInt(), x)
            x += 1
            binding.repeatButton.text = "Repetir"
        }

        binding.confirmButton.setOnClickListener {
            val action = WordsFragmentDirections.actionWordsFragmentToPhraseFragment(langID.toInt(), position, langName)
            binding.confirmButton.findNavController().navigate(action)
        }
    }

    private fun swapWords(ID: Int, numberPhrase: Int) {
        Glide
            .with(binding.langFlag.context)
            .load(LanguagesProvider.languagesList[ID].countryFlag)
            .error(R.drawable.ic_baseline_error_24)
            .into(binding.langFlag)

        Glide
            .with(binding.spanishFlag.context)
            .load("https://i.imgur.com/M0FbkZv.png")
            .error(R.drawable.ic_baseline_error_24)
            .into(binding.spanishFlag)

        if (numberPhrase % 2 == 0) {
            binding.wordEng.text = SentencesProvider.sentenceProvider(langName, position).wordLang1
            binding.wordSpa.text = SentencesProvider.sentenceProvider(langName, position).wordSpa1
        } else {
            binding.wordEng.text = SentencesProvider.sentenceProvider(langName, position).wordLang2
            binding.wordSpa.text = SentencesProvider.sentenceProvider(langName, position).wordSpa2
        }
    }
}